package br.furb.api.furbspeech.comp;

import org.junit.Test;

import br.furb.api.furbspeech.FurbSpeech;
import br.furb.api.furbspeech.synth.MBrolaSynthesizer;

public class FurbSpeechTest {

	@Test
	public void testSpeechOnlyOnePhrase() {
		new FurbSpeech().text("Vou empregar a pessoa").to().speech();
		new FurbSpeech().text("Ol� senhor Germano").to().speech();
		new FurbSpeech().text("Rua martin luther").to().speech();		
		new FurbSpeech().text("Rua ant�nio da veiga").to().speech();
	}
	
	@Test
	public void testSpeechMorePhrases() {
		new FurbSpeech().text("Esse � um teste da n�va biblioteca. Nova frase para falar").to().speech();
		new FurbSpeech().text("Perfume. Perf�me. Perto. P�rto").to().speech();
	}
	
	@Test
	public void testSpeechPhrasesWithAbbreviations() {
		new FurbSpeech().text("Av. Alameda Rio Branco. Av. Beira Rio").to().speech();
	}
	
	@Test
	public void testSpeechPhrasesWithDigits() {
		new FurbSpeech().text("Av. Alameda Rio Branco n� 64").to().speech();
		new FurbSpeech().text("Av. Alameda Rio Branco n� 1420").to().speech();
	}
	
	@Test
	public void testSpeechInterrogativePhrases() {
		new FurbSpeech().text("O que � isso? Quem manda aqui?").to().speech();
	}
	
	@Test
	public void testSpeechToWavFile() {
		new FurbSpeech().text("Ol� mundo!").to("myFile.wav").speech();
	}
	
	@Test
	public void testSpeechWithDifferentVoice() {
		new FurbSpeech().text("Ol� mundo!").withVoice(MBrolaSynthesizer.VOICE_BR2).to().speech();
	}
}
