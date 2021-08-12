package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SortStringsTest {
	
	@Test
	public void sortByIgnoreCase() {
		SortService ss = new SortService();
		assertThat(ss.sorting("Aa,Bb,Cc,Dd,aa")).isEqualTo("[Aa, aa, Bb, Cc, Dd]");
	}

}
