package com.cyberpython.kottakcot

import java.time.ZonedDateTime
import java.time.ZoneId
import java.time.Instant
import java.time.ZoneOffset
import com.cyberpython.kotcot.Event
import com.cyberpython.kotcot.CoT
import com.cyberpython.kotcot.Point

import com.cyberpython.kottakcot.protobuf.Takmessage.TakMessage
import com.cyberpython.kottakcot.protobuf.Takmessage
import com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent
import com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail
import com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track
import com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact
import com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group
import com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation
import com.cyberpython.kottakcot.protobuf.StatusOuterClass.Status
import com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.annotation.JsonInclude.Include
import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule



data class TakCotContact (
    val callsign: String?,
    val endpoint: String?
)

data class TakCotGroup (
    val name: String?,
    val role: String?
)

data class TakCotPrecisionLocation (
    val altsrc: String?,
    val geopointsrc: String?
)

data class TakCotStatus (
    val battery: Int?
)

data class TakCotTakV (
    val device: String?,
    val os: String?,
    val platform: String?,
    val version: String?
)

data class TakCotTrack (
    val course: Double?,
    val speed: Double?
)

data class TakCotDetail(
    
    val contact: TakCotContact?,
    val group: TakCotGroup?,
    val precision_location: TakCotPrecisionLocation?,
    val status: TakCotStatus?,
    val takv: TakCotTakV?,
    val track: TakCotTrack?,
    val xmlDetail: Any?

)

class KotTakCot {

    fun parse(bytes: ByteArray): Event? {
        if ( (bytes.size > 3) && 0xbfu.equals((bytes[0].toUInt() and 0xffu)) && 0xbfu.equals(bytes[2].toUInt() and 0xffu)) {
            when (bytes.get(1).toUInt() and 0xffu) {
                0u -> {
                    val cot = CoT()
                    return cot.parse(String(bytes.slice(3..bytes.size-1).toByteArray(), Charsets.UTF_8))
                }
                1u -> {
                    val takMsg = TakMessage.parseFrom(bytes.slice(3..bytes.size-1).toByteArray())

                    if (takMsg.hasCotEvent()){

                        // Convert the TAK protobuf detail hierarchy to a series
                        // of nested Map<String, Any> so that it is an exact match
                        // for XML CoT Event details parsed with KotCot:

                        var evtDetail : Map<String, Any>? = null
                        var emptyDetail = false
                        
                        val xmlMapper: ObjectMapper = XmlMapper()
                        xmlMapper.setSerializationInclusion(Include.NON_EMPTY);

                        if(takMsg.cotEvent.hasDetail()){
                            

                            val xmlDetail : Map<String, Any> ? = xmlMapper.readValue("<xmlDetail>${takMsg.cotEvent?.detail?.xmlDetail}</xmlDetail>", object: TypeReference<Map<String, Any>>() {})

                            val detail = TakCotDetail(
                                if (takMsg.cotEvent.detail.hasContact()) TakCotContact(takMsg.cotEvent.detail.contact.callsign, takMsg.cotEvent.detail.contact.endpoint) else null,
                                if (takMsg.cotEvent.detail.hasGroup()) TakCotGroup(takMsg.cotEvent.detail.group.name, takMsg.cotEvent.detail.group.role) else null,
                                if (takMsg.cotEvent.detail.hasPrecisionLocation()) TakCotPrecisionLocation(takMsg.cotEvent.detail.precisionLocation.altsrc, takMsg.cotEvent.detail.precisionLocation.geopointsrc) else null,
                                if (takMsg.cotEvent.detail.hasStatus()) TakCotStatus(takMsg.cotEvent.detail.status.battery) else null,
                                if (takMsg.cotEvent.detail.hasTakv()) TakCotTakV(takMsg.cotEvent.detail.takv.device, takMsg.cotEvent.detail.takv.os, takMsg.cotEvent.detail.takv.platform, takMsg.cotEvent.detail.takv.version) else null,
                                if (takMsg.cotEvent.detail.hasTrack()) TakCotTrack(takMsg.cotEvent.detail.track.course, takMsg.cotEvent.detail.track.speed) else null,
                                xmlDetail
                            );

                            val xmlStr = xmlMapper.writeValueAsString(detail)
                            if("<TakCotDetail/>".equals(xmlStr)){
                                emptyDetail = true
                            } else {
                                evtDetail = xmlMapper.readValue(xmlStr, object: TypeReference<Map<String, Any>>() {})
                            }
                        }
                        
                        // OK, let's build and return a KotCot Event:
                        return Event(
                            Point(takMsg.cotEvent.lat, takMsg.cotEvent.lon, takMsg.cotEvent.hae, takMsg.cotEvent.ce, takMsg.cotEvent.le), 
                            if(emptyDetail) "" else evtDetail,
                            2,
                            takMsg.cotEvent.type, 
                            if (takMsg.cotEvent?.access === "") null else takMsg.cotEvent?.access, 
                            if (takMsg.cotEvent?.qos === "") null else takMsg.cotEvent?.qos, 
                            takMsg.cotEvent.uid, 
                            ZonedDateTime.ofInstant(Instant.ofEpochMilli(takMsg.cotEvent.sendTime), ZoneId.of("UTC")),
                            ZonedDateTime.ofInstant(Instant.ofEpochMilli(takMsg.cotEvent.startTime), ZoneId.of("UTC")),
                            ZonedDateTime.ofInstant(Instant.ofEpochMilli(takMsg.cotEvent.staleTime), ZoneId.of("UTC")),
                            takMsg.cotEvent.how)
                    }
                    else{
                        throw IllegalArgumentException("Invalid TAK CoT message (missing CoT Event)")
                    }
                }
                else -> throw IllegalArgumentException("Unsupported TAK CoT type: ${bytes.get(1).toUInt()}")
            }
        }
        
        throw IllegalArgumentException("Invalid TAK CoT data.")
    }

    @kotlin.ExperimentalUnsignedTypes
    fun write(event: Event) : ByteArray {

        val cot = CoT()

        val evt : Event = cot.parse(cot.write(event))

        val cotEvtBldr = CotEvent.newBuilder()
            .setLat(evt.point.lat)
            .setLon(evt.point.lon)
            .setHae(evt.point.hae)
            .setCe(evt.point.ce)
            .setLe(evt.point.le)
            .setType(evt.type)
            .setUid(evt.uid)
            .setSendTime(Instant.from(evt.time).toEpochMilli())
            .setStartTime(Instant.from(evt.start).toEpochMilli())
            .setStaleTime(Instant.from(evt.stale).toEpochMilli())
            .setHow(evt.how)

        if(evt.access !== null){
            cotEvtBldr.setAccess(evt.access)
        }

        if(evt.qos !== null){
            cotEvtBldr.setQos(evt.qos)
        }

        if(evt.detail != null){

            val detailBldr = Detail.newBuilder()
            
            try{
                val detailMap = evt.detail as Map<String, Any>

                // Contact
                if (detailMap.containsKey("contact")){
                    val contactBldr = Contact.newBuilder();

                    try{
                        val callsign : String? =  evt.getDetail("contact.callsign")
                        if (callsign != null) {
                            contactBldr.setCallsign(callsign)
                        }
                    }
                    catch(iae: IllegalArgumentException){}
                    catch(cce: ClassCastException){}
                    

                    try{
                        val endpoint : String? = evt.getDetail("contact.endpoint")
                        if (endpoint != null) {
                            contactBldr.setEndpoint(endpoint)
                        }
                    }
                    catch(iae: IllegalArgumentException){}
                    catch(cce: ClassCastException){}

                    detailBldr.setContact(contactBldr.build())
                }

                // Group
                if (detailMap.containsKey("group")){
                    val groupBldr = Group.newBuilder();

                    try{
                        val name : String? =  evt.getDetail("group.name")
                        if (name != null) {
                            groupBldr.setName(name)
                        }
                    }
                    catch(iae: IllegalArgumentException){}
                    catch(cce: ClassCastException){}
                    

                    try{
                        val role : String? = evt.getDetail("group.role")
                        if (role != null) {
                            groupBldr.setRole(role)
                        }
                    }
                    catch(iae: IllegalArgumentException){}
                    catch(cce: ClassCastException){}

                    detailBldr.setGroup(groupBldr.build())
                }

                // Precision Location
                if (detailMap.containsKey("precision_location")){
                    val precLocBldr = PrecisionLocation.newBuilder();

                    try{
                        val altSrc : String? =  evt.getDetail("precision_location.altsrc")
                        if (altSrc != null) {
                            precLocBldr.setAltsrc(altSrc)
                        }
                    }
                    catch(iae: IllegalArgumentException){}
                    catch(cce: ClassCastException){}
                    

                    try{
                        val geopointSrc : String? = evt.getDetail("precision_location.geopointsrc")
                        if (geopointSrc != null) {
                            precLocBldr.setGeopointsrc(geopointSrc)
                        }
                    }
                    catch(iae: IllegalArgumentException){}
                    catch(cce: ClassCastException){}

                    detailBldr.setPrecisionLocation(precLocBldr.build())
                }

                // Status
                if (detailMap.containsKey("status")){
                    val statusBldr = Status.newBuilder();

                    try{
                        val battery : Int? =  evt.getDetail("status.battery").toInt()
                        if (battery != null) {
                            statusBldr.setBattery(battery)
                        }
                    }
                    catch(iae: IllegalArgumentException){}
                    catch(cce: ClassCastException){}

                    detailBldr.setStatus(statusBldr.build())
                }

                // Takv
                if (detailMap.containsKey("takv")){
                    val takvBldr = Takv.newBuilder();

                    try{
                        val device : String? =  evt.getDetail("takv.device")
                        if (device != null) {
                            takvBldr.setDevice(device)
                        }
                    }
                    catch(iae: IllegalArgumentException){}
                    catch(cce: ClassCastException){}

                    try{
                        val os : String? =  evt.getDetail("takv.os")
                        if (os != null) {
                            takvBldr.setOs(os)
                        }
                    }
                    catch(iae: IllegalArgumentException){}
                    catch(cce: ClassCastException){}

                    try{
                        val platform : String? =  evt.getDetail("takv.platform")
                        if (platform != null) {
                            takvBldr.setPlatform(platform)
                        }
                    }
                    catch(iae: IllegalArgumentException){}
                    catch(cce: ClassCastException){}

                    try{
                        val version : String? =  evt.getDetail("takv.version")
                        if (version != null) {
                            takvBldr.setVersion(version)
                        }
                    }
                    catch(iae: IllegalArgumentException){}
                    catch(cce: ClassCastException){}

                    detailBldr.setTakv(takvBldr.build())
                }

                // Track
                if (detailMap.containsKey("track")){
                    val trackBldr = Track.newBuilder();

                    try{
                        val course : Double? =  evt.getDetail("track.course").toDouble()
                        if (course != null) {
                            trackBldr.setCourse(course)
                        }
                    }
                    catch(iae: IllegalArgumentException){}
                    catch(cce: ClassCastException){}
                    

                    try{
                        val speed : Double? = evt.getDetail("track.speed").toDouble()
                        if (speed != null) {
                            trackBldr.setSpeed(speed)
                        }
                    }
                    catch(iae: IllegalArgumentException){}
                    catch(cce: ClassCastException){}

                    detailBldr.setTrack(trackBldr.build())
                }

                if (detailMap.containsKey("xmlDetail")){
                    val xmlMapper: ObjectMapper = XmlMapper()
                    xmlMapper.setSerializationInclusion(Include.NON_EMPTY);
                    val xmlDetailXml : String = xmlMapper.writer().withRootName("xmlDetail").writeValueAsString(detailMap["xmlDetail"])
                    val xmlDetailContents = xmlDetailXml.substring("<xmlDetail>".length, xmlDetailXml.length - "</xmlDetail>".length)
                    detailBldr.setXmlDetail(xmlDetailContents)
                }
                
            }
            catch(iae: IllegalArgumentException){}
            catch(cce: ClassCastException){}

            cotEvtBldr.setDetail(detailBldr.build())
        }

        
        
        val cotEvt = cotEvtBldr.build()

        val takMsg = TakMessage.newBuilder().setCotEvent(cotEvt).build()
        
        return ubyteArrayOf(0xbfU, 0x01U, 0xbfU).toByteArray() + takMsg.toByteString().toByteArray()
    }
}
