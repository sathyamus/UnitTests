package com.snsystems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author SN
 *
 */
public class SortService {
	
	final String SPLIT_PATTERN = ",";

	public String sortingByIgnoreCase(String input) {
		List<String> strings = Arrays.asList(input.split(SPLIT_PATTERN));
		strings.sort(String::compareToIgnoreCase);
		return strings.toString();
	}

	public String sortingByNatural(String input) {
		List<String> strings = Arrays.asList(input.split(SPLIT_PATTERN));
		Collections.sort(strings);
		return strings.toString();
	}
	
	
}
