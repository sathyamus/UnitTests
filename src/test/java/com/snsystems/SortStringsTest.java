package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SortStringsTest {

	private SortService sortService = new SortService();

	@Test
	public void sortByIgnoreCase() {
		assertThat(sortService.sortingByIgnoreCase("Aa,Bb,Cc,Dd,aa")).isEqualTo("[Aa, aa, Bb, Cc, Dd]");
	}
	
	@Test
	public void sortStringArraysByIgnoreCase() {
		String[] strings = {"Aa","Bb","Cc","Dd","aa"};
		assertThat(sortService.sortingByIgnoreCase(strings)).isEqualTo("[Aa, aa, Bb, Cc, Dd]");
	}	
	
	@Test
	public void should_sort_using_natural_sort() {
		assertThat(sortService.sortingByNatural("Aa,Bb,Cc,Dd,aa")).isEqualTo("[Aa, Bb, Cc, Dd, aa]");
	}

	@Test
	public void should_sort_string_array_using_natural_sort() {
		String[] strings = {"Aa","Bb","Cc","Dd","aa"};
		assertThat(sortService.sortingByNatural(strings)).isEqualTo("[Aa, Bb, Cc, Dd, aa]");
	}

	@Test
	public void sortStringArraysByIgnoreCase2() {
		String[] strings = {"Aa","Bb","Cc","Dd","aa"};
		assertThat(sortService.sortingByIgnoreCase2(strings)).isEqualTo("[Aa, aa, Bb, Cc, Dd]");
	}

}
