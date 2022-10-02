# kottakcot

![Build](https://github.com/cyberpython/kottakcot/actions/workflows/main.yml/badge.svg)
![Coverage](.github/badges/jacoco.svg)
[![](https://jitpack.io/v/cyberpython/kottakcot.svg)](https://jitpack.io/#cyberpython/kottakcot)

**Kot**lin **TAK** **C**ursor-**o**n-**T**arget (CoT) library.

KotTAKCoT can parse and build CoT 2.0 messages either in XML or Google ProtoBuf
format compatible with the messages exchanged by ATAK/CivTAK.

The library uses Jackson and Woodstox for XML handling and the 
[KotCot](https://github.com/cyberpython/kotcot) library for the handling of CoT 
messages in XML format.

## Installation

The library can be installed from JitPack.

If you are using Gradle, add JitPack to the available repositories and then
add KotTakCot to the dependencies of your project:

`build.gradle:`
```
...

repositories {
  ...
  maven { url 'https://jitpack.io' }
}

...

dependencies {
  ...
  implementation 'com.github.cyberpython:kottakcot:v1.0.1
  ...
}
...
```

If you are using Maven, update your `pom.xml` in a similar manner:

`pom.xml:`
```
...

<repositories>
  <repository>
      <id>jitpack.io</id>
      <url>https://jitpack.io</url>
  </repository>
</repositories>

...

<dependency>
    <groupId>com.github.cyberpython</groupId>
    <artifactId>kottakcot</artifactId>
    <version>v1.0.1</version>
</dependency>

...
```

## Reading & writing TAK messages

TAK messages are comprised of a 3-byte header and the message's payload either in
CoT XML or ProtoBuf format.

Reading a TAK message is quite straightforward:

``` kotlin
// takBuffer contains the TAK message bytes including the 3-byte header:
val takCot = KotTakCot()
val evt = takCot.parse(takBuffer)

// evt now holds the CoT Event's data
```

From this point on you can use the KotCot library's Event object methods to 
access the CoT event's data.

Notice that there is no differentiation between parsing CoT XML and 
Protobuf-based messages.

Things to note is that:

- In order to acces the MILSTD-2525B SIDC symbol code embedded in the CoT 
  Event's `type` field, you can use the `CoTType2SIDC::to2525B` method, 
  passing the CoT Event's type as a parameter:
  ``` kotlin
  val sidc = CoTType2SIDC().to2525B(evt.type)
  ```
- The `detail` field of the CoT Event and its sub-items can be accessed using 
  dot-notation through the `Event::getDetail` method:
  ``` kotlin
  val trackSpeed = evt.getDetail("track.speed")
  ```
  Attempting to access non-existing fields will result in an 
  `IllegalArgumentException`. 

Serializing an Event object to a TAK message is straightforward as well:
``` kotlin

// Create the CoT Event object and a detail object for it:

val detail = new TakCotDetail(
  new TakCotContact("IAPETUS", "192.168.1.50:4242:tcp"), 
  new TakCotGroup("Green", "Team Lead"), 
  null, null, null, 
  new TakCotTrack(280.0, 60.0), 
  null);

val event = Event(Point(37.409, 23.768, 0.0, 0.0, 0.0), 
                  detail, // <--- detail
                  2, 
                  CoTType2SIDC().from2525B("SFGPUCVRA------"), "public", "1-r-c",
                  "4333319d-3430-44f3-bada-195fcc9bf349", 
                  ZonedDateTime.parse("2022-08-20T18:50:10Z"), 
                  ZonedDateTime.parse("2022-08-20T18:50:10Z"), 
                  ZonedDateTime.parse("2022-08-20T19:00:10Z"), "m-g")
// Write to XML:
val takCot = KotTakCot()
val msg = takCot.write(event)
```

Note: Use the `TakCotDetail` class to construct a compatible detail object.
Note that no validation takes place for the contents of the `detail.xmlDetail`
field (it may contain any XML-serializable value).

## License

All code is licensed under GNU GPL v3 (required since the ATAK-CIV `.proto` files 
used to generate the TAK-compatible protobuf message-handling classes are 
licensed under the GNU GPL v3 license as part of ATAK-CIV's source code).
