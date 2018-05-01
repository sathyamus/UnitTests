package com.snsystems;

import static org.junit.Assert.assertEquals;

import static org.assertj.core.api.Assertions.*;

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
		System.out.println("\nsetting up resources on every test");
		arithmeticService = new ArithmeticService();
	}

	@After
	public void cleanup() {
		System.out.println("cleaning resources on every test");
	}

	@Ignore
	public void ignoringTest() {
		System.out.println("Ignoring test");
	}

	@Test
	public void testAddition() {
		// JUnit assertions
		assertEquals(2, arithmeticService.add(1, 1));
		assertEquals(3, arithmeticService.add(1, 2));
		assertEquals(4, arithmeticService.add(1, 3));
		
		// fest assertions
		org.fest.assertions.Assertions.assertThat(arithmeticService.add(1, 1)).isEqualTo(2);
		org.fest.assertions.Assertions.assertThat(arithmeticService.add(1, 2)).isEqualTo(3);
		org.fest.assertions.Assertions.assertThat(arithmeticService.add(1, 3)).isEqualTo(4);
		
		// assertj assertions
		assertThat(arithmeticService.add(1, 1)).isNotNull();
		assertThat(arithmeticService.add(1, 1)).isNotZero();
		assertThat(arithmeticService.add(1, 1)).isEqualTo(2);
		assertThat(arithmeticService.add(1, 2)).isEqualTo(3);
		assertThat(arithmeticService.add(1, 3)).isEqualTo(4);
		
		assertThat("Sathyamus").contains("sathya");
		
	}

	@Test
	public void testMultiplication() {
		
		// JUnit assertions
		assertEquals(1, arithmeticService.multiply(1, 1));
		assertEquals(2, arithmeticService.multiply(1, 2));
		assertEquals(3, arithmeticService.multiply(1, 3));
		
		// assertj soft assertions (multi)
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
