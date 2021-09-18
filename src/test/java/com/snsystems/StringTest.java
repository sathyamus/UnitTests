package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StringTest {
	
	StringCalculator calc = new StringCalculator();
	
	
	@Test
	public void should_return_sum_after_split() {
		
		assertThat(calc.sum("3,4")).isEqualTo(7);
		assertThat(calc.sum("1,2,3")).isEqualTo(6);
		assertThat(calc.sum("1,2,3,4")).isEqualTo(10);
	}
	
	@Test
	public void should_return_sum_after_split_by_carriage() {
		assertThat(calc.sum("1,2\n3")).isEqualTo(6);
	}


	@Test
	public void concatination() {
		assertThat(2 + 3 + "Sathya" + 2 + 3).isEqualTo("5Sathya23");
	}

}
