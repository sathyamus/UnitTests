package com.snsystems;

import static org.junit.Assert.assertEquals;

import org.assertj.core.api.SoftAssertions;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AssertUnitTest {

	private ArithmeticService arithmeticService = null;

	@BeforeClass
	public static void before() {
		System.out.println("setting up onetime config");
	}

	@AfterClass
	public static void after() {
		System.out.println("\ncleaning onetime config");
	}

	@Before
	public void setup() {
		System.out.println("\nsetting up resources");
		arithmeticService = new ArithmeticService();
	}

	@After
	public void cleanup() {
		System.out.println("cleaning resources");
	}

	@Ignore
	public void ignoringTest() {
		System.out.println("Ignoring test");
	}

	@Test
	public void testAddition() {
		assertEquals(2, arithmeticService.add(1, 1));
		assertEquals(3, arithmeticService.add(1, 2));
		assertEquals(4, arithmeticService.add(1, 3));
		org.fest.assertions.Assertions.assertThat(arithmeticService.add(1, 1)).isEqualTo(2);
		org.fest.assertions.Assertions.assertThat(arithmeticService.add(1, 2)).isEqualTo(3);
		org.fest.assertions.Assertions.assertThat(arithmeticService.add(1, 3)).isEqualTo(4);
	}

	@Test
	public void testMultiplication() {
		assertEquals(1, arithmeticService.multiply(1, 1));
		assertEquals(2, arithmeticService.multiply(1, 2));
		assertEquals(3, arithmeticService.multiply(1, 3));
		
		SoftAssertions softAssertions = new SoftAssertions();
		softAssertions.assertThat(arithmeticService.multiply(1, 1)).isEqualTo(1);
		softAssertions.assertThat(arithmeticService.multiply(1, 2)).isEqualTo(2);
		softAssertions.assertThat(arithmeticService.multiply(1, 3)).isEqualTo(3);
		softAssertions.assertAll();
	}

	@Test(expected = ArithmeticException.class)
	public void testDivision() {
		assertEquals(0, arithmeticService.divide(1, 0));
	}

}
