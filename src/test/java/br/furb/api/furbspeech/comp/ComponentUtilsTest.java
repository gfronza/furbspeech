package br.furb.api.furbspeech.comp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.furb.api.furbspeech.util.ComponentUtils;
public class ComponentUtilsTest {

	@Test
	public void testInArray() {
		assertTrue(ComponentUtils.inArray("z", new String[] {"s", "T", "x", "1", "z", "A"}));
		assertFalse(ComponentUtils.inArray("z", new String[] {"s", "T", "x", "1", "Z", "A"}));
	}
	
	@Test
	public void testVogal() {
		assertTrue(ComponentUtils.vogal("�").equals("A"));
		try {
			assertFalse(ComponentUtils.vogal("x").length() > 0);
		} catch (IllegalArgumentException e) {
			// I'm waiting this exception
		}
	}
	
	@Test
	public void testIsVogal() {
		assertTrue(ComponentUtils.isVogal("�"));
		assertFalse(ComponentUtils.isVogal("x"));
		assertFalse(ComponentUtils.isVogal("1"));
	}
	
	@Test
	public void testIsConsonant() {
		assertTrue(ComponentUtils.isConsonant("X"));
		assertFalse(ComponentUtils.isConsonant("�"));
		assertFalse(ComponentUtils.isConsonant("1"));
	}
	
	@Test
	public void testConvert() {
		assertTrue(ComponentUtils.convert("�", ComponentUtils.getVogalsInBasic()).equals("i"));
		assertFalse(ComponentUtils.convert("�", ComponentUtils.getVogalsInBasic()).equals("e"));
		assertFalse(ComponentUtils.convert("x", ComponentUtils.getVogalsInBasic()).equals("e"));
	}
	
	@Test
	public void testHasAccentuation() {
		assertTrue(ComponentUtils.hasAccentuation("p�"));
		assertTrue(ComponentUtils.hasAccentuation("�"));
		assertFalse(ComponentUtils.hasAccentuation("lhe"));
	}
}
