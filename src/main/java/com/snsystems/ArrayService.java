package com.snsystems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayService {

	public Object[] merge(Integer[] arrays1, Integer[] arrays2) {

		Set<Integer> mergedInts = new HashSet<Integer>();
		mergedInts.addAll(Arrays.asList(arrays1));
		mergedInts.addAll(Arrays.asList(arrays2));

		return mergedInts.stream().sorted().collect(Collectors.toList()).toArray();
	}

}
