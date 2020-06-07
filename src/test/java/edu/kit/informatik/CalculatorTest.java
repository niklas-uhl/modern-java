package edu.kit.informatik;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testParseInt() {
		assertEquals(Optional.of(42), SimpleCalculator.parseInt("42"));
	}
	
	@Test
	public void testParseIntWhitespace() {
		assertEquals(Optional.of(42), SimpleCalculator.parseInt("  42 "));
	}
	
	@Test
	public void testParseNegativeInt() {
		assertEquals(Optional.of(-42), SimpleCalculator.parseInt(" -42 "));
	}
	
	@Test
	public void testParseInvalidFloat() {
		assertEquals(Optional.empty(), SimpleCalculator.parseInt("4.5"));
	}
	
	@Test
	public void testParseInvalid() {
		assertEquals(Optional.empty(), SimpleCalculator.parseInt("zweiundvierzig"));
	}
	
	@Test
	public void testSum() {
		assertEquals(Optional.of(7), SimpleCalculator.calculate("3 + 4"));
	}
	
	@Test
	public void testMultipleSum() {
		assertEquals(Optional.of(42), SimpleCalculator.calculate("3 + 4 + 35"));
	}
	
	@Test
	public void testInvalidSum() {
		assertEquals(Optional.empty(), SimpleCalculator.calculate("3 + swt + 35"));
	}
}
