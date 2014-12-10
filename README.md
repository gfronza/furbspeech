#### Furbspeech

FurbSpeech is a Java-based API that converts portuguese text into speech. It uses the MBrola System in the back-end to provide the convertion from phonetic notation to media file (WAV format). FurbSpeech was fully developed in Java language, considering that MBrola system is a native executable. It means that the portability is directly dependent of the platforms supported by MBrola.


Usage:

```java
 *    new FurbSpeech().text("some text in portuguese language").to().speech();<br/><br/>
 *    
 *    // defining the voice<br/>
 *    new FurbSpeech().text("some text in portuguese language").withVoice(filePointingToTheVoice).to().speech();<br/><br/>
 *    
 *    // output to WAV file<br/>
 *    new FurbSpeech().text("some text in portuguese language").to("tts.wav").speech();
```