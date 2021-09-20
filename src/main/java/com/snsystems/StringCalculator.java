package com.snsystems;

public class StringCalculator {
	


	public int calculate(String input) {
		if (checkIfStringEmpty(input)) {
			return 0;
		}
		return -1;
	}

	private boolean checkIfStringEmpty(String input) {
		return input.isEmpty();
	}
}
