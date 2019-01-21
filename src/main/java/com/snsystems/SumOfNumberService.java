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
		int res = 0;
		int mod = 0;
		int div = 0;
		res = number;
		for (int i=0 ; i < String.valueOf(number).length() ; i++) {
			
			div = res / 10;
			mod = res % 10;
			
			res = div;
			sum = sum + mod;
			
			System.out.println("num : " + div);
			System.out.println("mod : " + mod);
			System.out.println("sum : " + sum);
			
		}
		return sum;

	}

}
