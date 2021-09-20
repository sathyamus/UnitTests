package com.snsystems;

public class StringCalculator {
	


	public int calculate(String input) {
		if (checkIfStringEmpty(input)) {
			return 0;
		}
		int number = Integer.parseInt(input);
		return number;
	}

	private boolean checkIfStringEmpty(String input) {
		return input.isEmpty();
	}
}
