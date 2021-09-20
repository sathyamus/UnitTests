package com.snsystems;

public class StringCalculator {
	
	private static final String DELIMITER = ",|\n";

	public int calculate(String input) {
		if (checkIfStringEmpty(input)) {
			return 0;
		}
		
		int sum = 0;
		String[] inputStrings = input.split(DELIMITER);
		for (String inputString : inputStrings) {
			int number = convertStringToInteger(inputString);
			if (number > 1000) {
				continue;
			}
			sum += number;
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
