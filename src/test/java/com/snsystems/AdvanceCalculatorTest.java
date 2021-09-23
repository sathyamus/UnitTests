package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class AdvanceCalculatorTest {

	@Test
	public void performMultiplyOperations() {
		AdvanceCalculator advCalc = new AdvanceCalculator();
		assertThat(advCalc.perform(2, 3)).isEqualTo(10);
	}
}
