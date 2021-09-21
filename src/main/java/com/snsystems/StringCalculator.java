package com.snsystems;

public class StringCalculator {
	
	private static final int THOUSAND = 1000;
	private static final String DELIMITER = ",|\n";

	public int calculate(String input) throws Exception {
		
		if (checkIfStringEmpty(input)) {
			return 0;
		}
		
		int sum = 0;
		String[] inputStrings = input.split(DELIMITER);
		for (String inputString : inputStrings) {
			int number = convertStringToInteger(inputString);
			
			if (number < 1) {
				throw new Exception();
			}
			
			if (checkIfNumberGreaterThanThousand(number)) {
				continue;
			}
			sum += number;
		}
		
		return sum;
	}

	private boolean checkIfNumberGreaterThanThousand(int number) {
		return number > THOUSAND;
	}

	private int convertStringToInteger(String input) {
		return Integer.parseInt(input);
	}

	private boolean checkIfStringEmpty(String input) {
		return input.isEmpty();
	}
}
