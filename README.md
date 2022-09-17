# kottakcot

[![](https://jitpack.io/v/cyberpython/kottakcot.svg)](https://jitpack.io/#cyberpython/kottakcot)

**Kot**lin **TAK** **C**ursor-**o**n-**T**arget (CoT) library.

KotTAKCoT can parse and build CoT 2.0 messages either in XML or Google ProtoBuf
format compatible with the messages exchanged by ATAK/CivTAK.

The API is based on the Event class provided by the 
[KotCot](https://github.com/cyberpython/kotcot) library.

Refer to the unit tests for usage examples.

The library uses Jackson and Woodstox for XML handling.

Note: Any object can be set as the `detail` for Event objects and it will be 
serialized by Jackson, but it will serialize all fields and values as nested 
elements. If you want to customize this behaviour and specify fields to be used 
as attributes in the generated XML, you need to create custom classes (data 
classes are recommended) annotated with Jackson's annotations.


