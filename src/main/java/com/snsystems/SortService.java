package com.snsystems;

import java.util.Arrays;
import java.util.List;

/**
 * @author SN
 *
 */
public class SortService {

	public String sorting(String input) {
		List<String> strings = Arrays.asList(input.split(","));
		strings.sort(String::compareToIgnoreCase);
		return strings.toString();
	}
}
