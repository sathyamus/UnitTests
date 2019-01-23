package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EndOfMonthServiceTest {
	
	private EndOfMonthService endOfMonthService = null;

	@Before
	public void setUp() throws Exception {
		endOfMonthService = new EndOfMonthService();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void should_find_end_of_month_dates_from_given_dates() {
		
		List<String> dates = Arrays.asList("01-01-2018", "05-01-2018", "31-01-2018", "01-02-2018", "28-02-2018");
		assertThat(endOfMonthService.find(dates)).contains("31-01-2018", "28-02-2018");
	}

	@Test
	public void should_return_end_of_month_date_from_given_date() {
		
		assertThat(endOfMonthService.getEOM("05-01-2018")).contains("31-01-2018");
		assertThat(endOfMonthService.getEOM("05-02-2016")).contains("29-02-2016");
		assertThat(endOfMonthService.getEOM("05-02-2018")).contains("28-02-2018");
		assertThat(endOfMonthService.getEOM("05-03-2018")).contains("31-03-2018");
		assertThat(endOfMonthService.getEOM("05-04-2018")).contains("30-04-2018");
	}
	
}
