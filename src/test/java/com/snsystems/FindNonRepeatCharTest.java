package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;

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
	
	@Test
	public void findNonRepeatCharLongWay() {
		assertThat(findNonRepeatCharLongWay("Sathya")).isEqualTo('S');
		assertThat(findNonRepeatCharLongWay("Naveen")).isEqualTo('a');
	}
	
	char findNonRepeatCharLongWay(String input) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] inputs = input.toLowerCase().toCharArray();
		int count = 0;
		while (count < input.length()) {
			if (map.get(inputs[count]) != null) {
				map.put(inputs[count], map.get(inputs[count]) + 1);
			} else {
				map.put(inputs[count], 1);
			}
			count ++;
		}
		count = 0;
		char result = 0;
		while (count < input.length()) {
			if (map.get(inputs[count]) == 1) {
				result = input.toCharArray()[count];
				break;
			}
			count ++;
		}
		return result;
	}

}
