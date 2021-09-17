package com.snsystems;

public class StringCalculator {

	public Integer sum(String input) {
		String arr[] = input.split(",");
		Integer result = 0;
		for (String val : arr) {
			result = result + Integer.valueOf(val);
		}
		return result;
	}
}
