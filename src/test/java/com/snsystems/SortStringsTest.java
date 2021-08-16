package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SortStringsTest {
	
	@Test
	public void sortByIgnoreCase() {
		SortService sortService = new SortService();
		assertThat(sortService.sortingByIgnoreCase("Aa,Bb,Cc,Dd,aa")).isEqualTo("[Aa, aa, Bb, Cc, Dd]");
	}
	
	@Test
	public void sortStringArraysByIgnoreCase() {
		SortService sortService = new SortService();
		String[] strings = {"Aa","Bb","Cc","Dd","aa"};
		assertThat(sortService.sortingByIgnoreCase(strings)).isEqualTo("[Aa, aa, Bb, Cc, Dd]");
	}	
	
	@Test
	public void should_sort_using_natural_sort() {
		SortService sortService = new SortService();
		assertThat(sortService.sortingByNatural("Aa,Bb,Cc,Dd,aa")).isEqualTo("[Aa, Bb, Cc, Dd, aa]");
	}
	
	@Test
	public void sortStringArraysByIgnoreCase2() {
		SortService sortService = new SortService();
		String[] strings = {"Aa","Bb","Cc","Dd","aa"};
		assertThat(sortService.sortingByIgnoreCase2(strings)).isEqualTo("[Aa, aa, Bb, Cc, Dd]");
	}

}
