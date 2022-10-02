package com.cyberpython.kottakcot

import com.cyberpython.kotcot.Event
import com.cyberpython.kotcot.CoT

import java.util.Base64
import com.cyberpython.kottakcot.protobuf.Takmessage.TakMessage

import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

@kotlin.ExperimentalUnsignedTypes
class KotTakCotTest {

    @Test fun testXmlCoTParsing() {

        // Test XML data:
        val xmlCoT = """
        <event version="2" type="a-h-S-C-L-D-D" access="national-restricted" qos="5-r-c" uid="1f3836bf-67b0-447c-8f41-292a325112b7" time="2022-08-19T16:09:11.128558Z" start="2022-08-19T16:09:11.130456Z" stale="2022-08-19T16:19:11.130479Z" how="m-g">
          <point lat="37.409" lon="23.768" hae="0.0" ce="0.0" le="0.0"/>
        </event>
        """.trimIndent()

        // Create the expected value:
        val tmpCot = CoT()
        val evt = tmpCot.parse(xmlCoT)

        // Run the test:
        val ktc = KotTakCot()
        val testDataCotXml = ubyteArrayOf(0xbfU, 0x00U, 0xbfU).toByteArray() + xmlCoT.toByteArray()
        assertEquals(evt, ktc.parse(testDataCotXml))
    }

    @Test fun testTakCoTParsing() {

        // TODO: Details

        // Test XML data:
        val xmlCoT = """
        <event version="2" type="a-f-G-U-C" uid="ANDROID-861825040182873" time="2022-09-13T20:28:13.587Z" start="2022-09-13T20:28:13.587Z" stale="2022-09-13T20:29:05.387Z" how="m-g">
          <point lat="37.969021" lon="23.704599" hae="81.895" ce="81.6" le="9999999.0"/>
          <detail>
            <contact>
              <callsign>PYTHON</callsign>
              <endpoint>192.168.1.105:4242:tcp</endpoint>
            </contact>
            <group>
              <name>Blue</name>
              <role>Team Lead</role>
            </group>
            <precision_location>
              <altsrc>GPS</altsrc>
              <geopointsrc>GPS</geopointsrc>
            </precision_location>
            <status>
              <battery>92</battery>
            </status>
            <takv>
              <device>HUAWEI JSN-L21</device>
              <os>28</os>
              <platform>ATAK-CIV</platform>
              <version>4.7.0.0 (2630c526)[playstore].1658845578-CIV</version>
            </takv>
            <track>
              <course>286.0160009783298</course>
              <speed>1.541161298751831</speed>
            </track>
            <xmlDetail><uid Droid="PYTHON"/></xmlDetail>
          </detail>
        </event>
        """.trimIndent()

        // Create the expected value:
        val tmpCot = CoT()
        val evt = tmpCot.parse(xmlCoT)

        // Run the test:
        val ktc = KotTakCot()
        val testDataTakCot = ubyteArrayOf(0xbfU, 0x01U, 0xbfU, 0x0aU, 0x00U, 0x12U, 0xacU, 0x02U,
                                          0x0aU, 0x09U, 0x61U, 0x2dU, 0x66U, 0x2dU, 0x47U, 0x2dU,
                                          0x55U, 0x2dU, 0x43U, 0x2aU, 0x17U, 0x41U, 0x4eU, 0x44U,
                                          0x52U, 0x4fU, 0x49U, 0x44U, 0x2dU, 0x38U, 0x36U, 0x31U,
                                          0x38U, 0x32U, 0x35U, 0x30U, 0x34U, 0x30U, 0x31U, 0x38U,
                                          0x32U, 0x38U, 0x37U, 0x33U, 0x30U, 0x93U, 0xf3U, 0xa6U,
                                          0xc4U, 0xb3U, 0x30U, 0x38U, 0x93U, 0xf3U, 0xa6U, 0xc4U,
                                          0xb3U, 0x30U, 0x40U, 0xebU, 0x87U, 0xaaU, 0xc4U, 0xb3U,
                                          0x30U, 0x4aU, 0x03U, 0x6dU, 0x2dU, 0x67U, 0x51U, 0x90U,
                                          0x11U, 0x50U, 0xe1U, 0x08U, 0xfcU, 0x42U, 0x40U, 0x59U,
                                          0x58U, 0xcbU, 0x9dU, 0x99U, 0x60U, 0xb4U, 0x37U, 0x40U,
                                          0x61U, 0xe1U, 0x7aU, 0x14U, 0xaeU, 0x47U, 0x79U, 0x54U,
                                          0x40U, 0x69U, 0x66U, 0x66U, 0x66U, 0x66U, 0x66U, 0x66U,
                                          0x54U, 0x40U, 0x71U, 0x00U, 0x00U, 0x00U, 0xe0U, 0xcfU,
                                          0x12U, 0x63U, 0x41U, 0x7aU, 0xbeU, 0x01U, 0x0aU, 0x15U,
                                          0x3cU, 0x75U, 0x69U, 0x64U, 0x20U, 0x44U, 0x72U, 0x6fU,
                                          0x69U, 0x64U, 0x3dU, 0x22U, 0x50U, 0x59U, 0x54U, 0x48U,
                                          0x4fU, 0x4eU, 0x22U, 0x2fU, 0x3eU, 0x12U, 0x20U, 0x0aU,
                                          0x16U, 0x31U, 0x39U, 0x32U, 0x2eU, 0x31U, 0x36U, 0x38U,
                                          0x2eU, 0x31U, 0x2eU, 0x31U, 0x30U, 0x35U, 0x3aU, 0x34U,
                                          0x32U, 0x34U, 0x32U, 0x3aU, 0x74U, 0x63U, 0x70U, 0x12U,
                                          0x06U, 0x50U, 0x59U, 0x54U, 0x48U, 0x4fU, 0x4eU, 0x1aU,
                                          0x11U, 0x0aU, 0x04U, 0x42U, 0x6cU, 0x75U, 0x65U, 0x12U,
                                          0x09U, 0x54U, 0x65U, 0x61U, 0x6dU, 0x20U, 0x4cU, 0x65U,
                                          0x61U, 0x64U, 0x22U, 0x0aU, 0x0aU, 0x03U, 0x47U, 0x50U,
                                          0x53U, 0x12U, 0x03U, 0x47U, 0x50U, 0x53U, 0x2aU, 0x02U,
                                          0x08U, 0x5cU, 0x32U, 0x4cU, 0x0aU, 0x0eU, 0x48U, 0x55U,
                                          0x41U, 0x57U, 0x45U, 0x49U, 0x20U, 0x4aU, 0x53U, 0x4eU,
                                          0x2dU, 0x4cU, 0x32U, 0x31U, 0x12U, 0x08U, 0x41U, 0x54U,
                                          0x41U, 0x4bU, 0x2dU, 0x43U, 0x49U, 0x56U, 0x1aU, 0x02U,
                                          0x32U, 0x38U, 0x22U, 0x2cU, 0x34U, 0x2eU, 0x37U, 0x2eU,
                                          0x30U, 0x2eU, 0x30U, 0x20U, 0x28U, 0x32U, 0x36U, 0x33U,
                                          0x30U, 0x63U, 0x35U, 0x32U, 0x36U, 0x29U, 0x5bU, 0x70U,
                                          0x6cU, 0x61U, 0x79U, 0x73U, 0x74U, 0x6fU, 0x72U, 0x65U,
                                          0x5dU, 0x2eU, 0x31U, 0x36U, 0x35U, 0x38U, 0x38U, 0x34U,
                                          0x35U, 0x35U, 0x37U, 0x38U, 0x2dU, 0x43U, 0x49U, 0x56U,
                                          0x3aU, 0x12U, 0x09U, 0x00U, 0x00U, 0x00U, 0xc0U, 0x98U,
                                          0xa8U, 0xf8U, 0x3fU, 0x11U, 0x17U, 0xeaU, 0x3dU, 0x8aU,
                                          0x41U, 0xe0U, 0x71U, 0x40U).toByteArray()
        val evt2 = ktc.parse(testDataTakCot)
        assertNotNull(evt2)
        assertEquals(evt, evt2)
    }

    @Test fun testTakCotNoDetail(){

      // Test XML data:
      val xmlCoT = """
      <event version="2" type="a-f-G-U-C" uid="ANDROID-861825040182873" time="2022-09-13T20:28:13.587Z" start="2022-09-13T20:28:13.587Z" stale="2022-09-13T20:29:05.387Z" how="m-g">
        <point lat="37.969021" lon="23.704599" hae="81.895" ce="81.6" le="9999999.0"/>
      </event>
      """.trimIndent()

      // Convert CoT XML to KotCot Event:
      val tmpCot = CoT()
      val evt = tmpCot.parse(xmlCoT)
      
      val ktc = KotTakCot()
      val testDataTakCot = ktc.write(evt) // Convert KotCot Event to ProtoBuf
      val evt2 = ktc.parse(testDataTakCot) // Convert ProtoBuf back to KotCot Event
      assertNotNull(evt2)
      assertEquals(evt, evt2)
      
    }

    @Test fun testTakCotWithAccessAndQos(){

      // Test XML data:
      val xmlCoT = """
      <event version="2" type="a-f-G-U-C" access="UNRESTRICTED" qos="5-r-d" uid="ANDROID-861825040182873" time="2022-09-13T20:28:13.587Z" start="2022-09-13T20:28:13.587Z" stale="2022-09-13T20:29:05.387Z" how="m-g">
        <point lat="37.969021" lon="23.704599" hae="81.895" ce="81.6" le="9999999.0"/>
      </event>
      """.trimIndent()

      // Convert CoT XML to KotCot Event:
      val tmpCot = CoT()
      val evt = tmpCot.parse(xmlCoT)

      val ktc = KotTakCot()
      val testDataTakCot = ktc.write(evt) // Convert KotCot Event to ProtoBuf
      val evt2 = ktc.parse(testDataTakCot) // Convert ProtoBuf back to KotCot Event
      assertNotNull(evt2)
      assertEquals(evt, evt2)
      
    }

    @Test fun testTakCotWithEmptyDetail(){

      // Test XML data:
      val xmlCoT = """
      <event version="2" type="a-f-G-U-C" uid="ANDROID-861825040182873" time="2022-09-13T20:28:13.587Z" start="2022-09-13T20:28:13.587Z" stale="2022-09-13T20:29:05.387Z" how="m-g">
        <point lat="37.969021" lon="23.704599" hae="81.895" ce="81.6" le="9999999.0"/>
        <detail></detail>
      </event>
      """.trimIndent()

      // Convert CoT XML to KotCot Event:
      val tmpCot = CoT()
      val evt = tmpCot.parse(xmlCoT)

      val ktc = KotTakCot()
      val testDataTakCot = ktc.write(evt) // Convert KotCot Event to ProtoBuf
      val evt2 = ktc.parse(testDataTakCot) // Convert ProtoBuf back to KotCot Event
      assertNotNull(evt2)
      assertEquals(evt,evt2)
    }

    @Test fun testTakCotWithTrackDetail(){

      // Test XML data:
      val xmlCoT = """
      <event version="2" type="a-f-G-U-C" uid="ANDROID-861825040182873" time="2022-09-13T20:28:13.587Z" start="2022-09-13T20:28:13.587Z" stale="2022-09-13T20:29:05.387Z" how="m-g">
        <point lat="37.969021" lon="23.704599" hae="81.895" ce="81.6" le="9999999.0"/>
        <detail>
          <track course="286.0" speed="1.541"/>
        </detail>
      </event>
      """.trimIndent()

      // Convert CoT XML to KotCot Event:
      val tmpCot = CoT()
      val evt = tmpCot.parse(xmlCoT)

      val ktc = KotTakCot()
      val testDataTakCot = ktc.write(evt) // Convert KotCot Event to ProtoBuf
      val evt2 = ktc.parse(testDataTakCot) // Convert ProtoBuf back to KotCot Event
      assertNotNull(evt2)
      assertEquals(evt,evt2)
    }

    @Test fun testTakCotWithFullDetail(){

      // Test XML data:
      val xmlCoT = """
      <event version="2" type="a-f-G-U-C" uid="ANDROID-861825040182873" time="2022-09-13T20:28:13.587Z" start="2022-09-13T20:28:13.587Z" stale="2022-09-13T20:29:05.387Z" how="m-g">
        <point lat="37.969021" lon="23.704599" hae="81.895" ce="81.6" le="9999999.0"/>
        <detail>
          <contact>
            <callsign>PYTHON</callsign>
            <endpoint>192.168.1.105:4242:tcp</endpoint>
          </contact>
          <group>
            <name>Blue</name>
            <role>Team Lead</role>
          </group>
          <precision_location>
            <altsrc>GPS</altsrc>
            <geopointsrc>GPS</geopointsrc>
          </precision_location>
          <status>
            <battery>92</battery>
          </status>
          <takv>
            <device>HUAWEI JSN-L21</device>
            <os>28</os>
            <platform>ATAK-CIV</platform>
            <version>4.7.0.0 (2630c526)[playstore].1658845578-CIV</version>
          </takv>
          <track>
            <course>286.0160009783298</course>
            <speed>1.541161298751831</speed>
          </track>
          <xmlDetail><uid Droid="PYTHON"/></xmlDetail>
        </detail>
      </event>
      """.trimIndent()

      // Convert CoT XML to KotCot Event:
      val tmpCot = CoT()
      val evt = tmpCot.parse(xmlCoT)

      val ktc = KotTakCot()
      val testDataTakCot = ktc.write(evt) // Convert KotCot Event to ProtoBuf
      val evt2 = ktc.parse(testDataTakCot) // Convert ProtoBuf back to KotCot Event
      assertNotNull(evt2)
      assertEquals(evt,evt2)
    }

}
