package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StringTest {
	
	@Test
	public void should_return_sum_after_split() {
		
		Integer result = sum("3,4");
		assertThat(result).isEqualTo(7);
	} 
	
	Integer sum(String input) {
		String arr[] = input.split(",");
		Integer result = 0;
		for (int i=0 ; i<arr.length; i++) {
			result = result + Integer.valueOf(arr[i]);
		}
		return result;
	}

}
