
package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author SN
 *
 */
public class SumOfNumberTest {

	private SumOfNumberService sumOfNumberService = null;
	
	@Before
	public void setUp() throws Exception {
		sumOfNumberService = new SumOfNumberService();
	}

	@After
	public void tearDown() throws Exception {
		sumOfNumberService = null;
	}

	@Test
	public void should_check_the_sum_of_number() {
		
		assertThat(sumOfNumberService.sum(1)).isEqualTo(1);
		assertThat(sumOfNumberService.sum(12)).isEqualTo(3);		
		assertThat(sumOfNumberService.sum(123)).isEqualTo(6);
		assertThat(sumOfNumberService.sum(1234)).isEqualTo(10);
		assertThat(sumOfNumberService.sum(12345)).isEqualTo(15);
		assertThat(sumOfNumberService.sum3(13591)).isEqualTo(19);
		
	}

	@Test
	public void should_check_the_sum_of_number_2() {
		
		assertThat(sumOfNumberService.sum2(1)).isEqualTo(1);
		assertThat(sumOfNumberService.sum2(12)).isEqualTo(3);
		assertThat(sumOfNumberService.sum2(123)).isEqualTo(6);
		assertThat(sumOfNumberService.sum2(1234)).isEqualTo(10);
		assertThat(sumOfNumberService.sum2(12345)).isEqualTo(15);
		assertThat(sumOfNumberService.sum2(13591)).isEqualTo(19);
		
	}
	
	@Test
	public void should_check_the_sum_of_number_3() {
		
		assertThat(sumOfNumberService.sum3(1)).isEqualTo(1);
		assertThat(sumOfNumberService.sum3(12)).isEqualTo(3);
		assertThat(sumOfNumberService.sum2(123)).isEqualTo(6);
		assertThat(sumOfNumberService.sum3(1234)).isEqualTo(10);
		assertThat(sumOfNumberService.sum3(12345)).isEqualTo(15);
		assertThat(sumOfNumberService.sum3(13591)).isEqualTo(19);
		
	}	
}
