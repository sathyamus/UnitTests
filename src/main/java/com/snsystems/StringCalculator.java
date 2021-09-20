package com.snsystems;

public class StringCalculator {
	


	public int calculate(String input) {
		if (checkIfStringEmpty(input)) {
			return 0;
		}
		int sum = 0;
		String[] inputStrings = input.split(",");
		for (String inputString : inputStrings) {
			sum = sum + convertStringToInteger(inputString);
		}
		return sum;
	}

	private int convertStringToInteger(String input) {
		return Integer.parseInt(input);
	}

	private boolean checkIfStringEmpty(String input) {
		return input.isEmpty();
	}
}
