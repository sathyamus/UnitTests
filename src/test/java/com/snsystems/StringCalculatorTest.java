package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	
	private StringCalculator calc = null;
	
	@Before
	public void init() {
		 calc = new StringCalculator();
	}
	
	@Test
	public void emptyStringReturnZero() throws Exception {
		assertThat(calc.calculate("")).isEqualTo(0);
	}
	
	@Test
	public void stringNumberReturnsItsValue() throws Exception {
		assertThat(calc.calculate("3")).isEqualTo(3);
	}
	
	@Test
	public void commaDelimiterReturnsSum() throws Exception {
		assertThat(calc.calculate("1,2")).isEqualTo(3);
	}
	
	@Test
	public void newLineDelimiterReturnsSum() throws Exception {
		assertThat(calc.calculate("2\n3")).isEqualTo(5);
	}
	
	@Test
	public void multipleDelimiterReturnsSum() throws Exception {
		assertThat(calc.calculate("2,3\n4")).isEqualTo(9);
	}
	
	@Test
	public void ignoreNumberGreaterThanThousand() throws Exception {
		assertThat(calc.calculate("2,3\n1005")).isEqualTo(5);
	}
	
	@Test(expected = Exception.class) 
	public void negativeNumberThrowsException() throws Exception {
		calc.calculate("-1,2");
	}

}
