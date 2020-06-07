package edu.kit.informatik;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeekdayUtilTest {

	@Test(expected = UnsupportedOperationException.class)
	public void testAddEuropeDayShouldFail() {
		WeekdayUtil.addEuropaDay();
	}
	
	@Test
	public void testGetHighestNumberOfLetters() {
		assertEquals(9, WeekdayUtil.getHighestNumberOfLetters());
	}

}
