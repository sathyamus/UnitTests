package com.snsystems;

public class StringCalculator {
	
	private static String DELIMITER = ",|\n";

	public Integer sum(String input) {
		String arr[] = input.split(DELIMITER);
		Integer result = 0;
		for (String val : arr) {
			result = result + Integer.valueOf(val);
		}
		return result;
	}
}
