package com.example.numberchain.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.numberchain.NumberChainLengthCalc;

public class TestNumberChainCalcLength {
	
	NumberChainLengthCalc calculator = new NumberChainLengthCalc();
	
	@Test
	public void shouldReturnInputInDescendingOrder() {
		assertEquals(97543, calculator.getDescendingOrder("43579"));
	}

	@Test
	public void shouldReturnInputInAscendingOrder() {
		assertEquals(123456789, calculator.getAscendingOrder("987654321"));
	}
	
	@Test
	public void testSubtraction() {
		assertEquals(864197532, calculator.getSubtractedValue(987654321, 123456789));
	}

	@Test
	public void shouldReturnNumberChainLength() {
		assertEquals(4, calculator.createNumberChain("1234"));
		assertEquals(2, calculator.createNumberChain("444"));
	}
}
