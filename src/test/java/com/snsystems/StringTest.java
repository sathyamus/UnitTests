package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringTest {
	
	@Test
	public void concatination() {
		String result = 2 + 3 + "Sathya" + 2 + 3;
		assertThat(result).isEqualTo("5Sathya23");
		
		String result2 =  2 + 3 + "Sathya";
		result2 += "Sathya" + 2 * 3;
		assertThat(result2).isEqualTo("5SathyaSathya6");
		
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = " Hello";
		assertTrue(s1 == s2);
		assertThat(s3.substring(1)).isEqualTo("Hello");
		assertThat(s3.substring(1)).isEqualTo("Hello");
		assertFalse(s1 == s3.substring(1));
		assertTrue(s1.equals(s3.substring(1)));
	}

}
