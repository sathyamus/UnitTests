package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	
	private StringCalculator calc = null;
	
	@Before
	public void init() {
		 calc = new StringCalculator();
	}
	
	@Test
	public void emptyStringReturnZero() {
		assertThat(calc.calculate("")).isEqualTo(0);
	}
	
	@Test
	public void stringNumberReturnsItsValue() {
		assertThat(calc.calculate("3")).isEqualTo(3);
	}

}
