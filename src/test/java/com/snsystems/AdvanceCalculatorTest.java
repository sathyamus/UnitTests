package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class AdvanceCalculatorTest {

	@Test
	public void performMultiplyOperations() {
		
		CalculatorService calculatorService = new CalculatorService() {
			
			@Override
			public int add(int i, int j) {
				return 5;
			}
		};
		AdvanceCalculator advCalc = new AdvanceCalculator(calculatorService);
		assertThat(advCalc.perform(2, 3)).isEqualTo(10);
	}
}
