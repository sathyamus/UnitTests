package com.snsystems;

public class AdvanceCalculator {
	
	private CalculatorService calculatorService = null;

	public AdvanceCalculator(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}


	public int perform(int i, int j) {
		return calculatorService.add(i, j) * i;
	}

}
