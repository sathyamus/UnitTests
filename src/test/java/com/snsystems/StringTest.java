package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StringTest {
	
	@Test
	public void should_return_sum_after_split() {
		
		assertThat(sum("3,4")).isEqualTo(7);
		assertThat(sum("1,2,3")).isEqualTo(6);
		assertThat(sum("1,2,3,4")).isEqualTo(10);
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
