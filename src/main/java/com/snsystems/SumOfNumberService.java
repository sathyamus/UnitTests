package com.snsystems;


public class SumOfNumberService {

	public Integer sum(Integer number) {
		int sum = 0;
		char[] numberChars = String.valueOf(number).toCharArray();
		for (int i=0 ; i < numberChars.length ; i++) {
			sum = sum + Integer.parseInt(numberChars[i]+"");
		}
		return sum;
	}

	public Integer sum2(int number) {
		int sum = 0;
		return sum;
	}

}
