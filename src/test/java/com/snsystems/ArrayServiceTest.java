package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ArrayServiceTest {

	private ArrayService arrayService = new ArrayService();

	@Test
	public void mergeIntArrays() {
		
		Integer[] arrays1 = { 1, 3, 5, 8, 9, 11, 13 };
		Integer[] arrays2 = { 6, 8, 10, 12, 14, 16, 18 };

		Integer[] expectedResult = {1, 3, 5, 6,8, 9,10,11,12,13,14,16,18};
		assertThat(arrayService.merge(arrays1, arrays2)).isEqualTo(expectedResult);
	}

}
