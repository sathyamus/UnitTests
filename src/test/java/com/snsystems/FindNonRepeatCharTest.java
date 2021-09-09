package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class FindNonRepeatCharTest {
	
	@Test
	public void findNonRepeatChar() {
		assertThat(findNonRepeatChar("Sathya")).isEqualTo('S');
		assertThat(findNonRepeatChar("Naveen")).isEqualTo('a');
	}
	
	char findNonRepeatChar(String input) {
		char[] inputs = input.toLowerCase().toCharArray();
		int count = 0;
		char result = 0;
		while (count < input.length()) {
			if (input.toLowerCase().indexOf(inputs[count]) == input.toLowerCase().lastIndexOf(inputs[count])) {
				result = input.toCharArray()[count];
				break;
			}
			count ++;
		}
		return result;
	}

}
