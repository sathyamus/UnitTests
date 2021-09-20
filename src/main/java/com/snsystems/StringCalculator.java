package com.snsystems;

public class StringCalculator {
	


	public int calculate(String input) {
		if (checkIfStringEmpty(input)) {
			return 0;
		}
		int number = convertStringToInteger(input);
		return number;
	}

	private int convertStringToInteger(String input) {
		return Integer.parseInt(input);
	}

	private boolean checkIfStringEmpty(String input) {
		return input.isEmpty();
	}
}
