package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StringCalculatorTest {
	
	@Test
	public void emptyStringReturnZero() {
		StringCalculator calc = new StringCalculator();
		assertThat(calc.calculate("")).isEqualTo(0);
	}

}
