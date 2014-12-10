# Furbspeech

FurbSpeech is a Java-based API that converts portuguese text into speech. It uses the MBrola System in the back-end to provide the convertion from phonetic notation to media file (WAV format). FurbSpeech was fully developed in Java language, considering that MBrola system is a native executable. It means that the portability is directly dependent of the platforms supported by MBrola.


### How to setup in your project

1. Add the FurbSpeech JAR to the classpath
2. Put in your classpath the contents of the folder 'src/test/resources'
3. That's it


### DSL Usage:

```java
// basic usage.
new FurbSpeech().text("some text in portuguese language").to().speech();
   
// defining the voice
new FurbSpeech().text("some text in portuguese language").withVoice(filePointingToTheVoice).to().speech();
   
// output to WAV file
new FurbSpeech().text("some text in portuguese language").to("tts.wav").speech();
```