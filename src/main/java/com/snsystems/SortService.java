package com.snsystems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author SN
 *
 */
public class SortService {

	public String sortingByIgnoreCase(String input) {
		List<String> strings = Arrays.asList(input.split(","));
		strings.sort(String::compareToIgnoreCase);
		return strings.toString();
	}
	
	public String sortingByNatural(String input) {
		List<String> strings = Arrays.asList(input.split(","));
		Collections.sort(strings);
		return strings.toString();
	}	
}
