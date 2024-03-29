package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import org.junit.Test;

public class ComparatorInLambdaTest {
	
	@Test
	public void compare() {
		
		List<String> digits = Arrays.asList("one", "two", "three", "four", "five", "six");
		
		// sort by natural order
		Comparator<String> lambdaComparator = (String s1, String s2) -> s1.compareTo(s2);
		
		digits.sort(lambdaComparator);
		assertThat(digits).isEqualTo(Arrays.asList("five", "four", "one", "six", "three", "two"));
		
	}

	@Test
	public void compareWithFunction() {
		
		List<String> digits = Arrays.asList("one", "two", "three", "four", "five", "six");
		
		// sort by length
		Function<String, Integer> byLength = (String input) -> input.length();
		Comparator<String> lambdaComparator = Comparator.comparing(byLength);
		
		digits.sort(lambdaComparator);
		assertThat(digits).isEqualTo(Arrays.asList("one", "two", "six", "four", "five", "three"));
		
	}
	
	@Test
	public void comparingInt() {
		
		List<String> digits = Arrays.asList("one", "two", "three", "four", "five", "six");
		
		// sort by length
		ToIntFunction<String> byLength = input -> input.length();
		Comparator<String> lambdaComparator = Comparator.comparingInt(byLength);
		
		digits.sort(lambdaComparator);
		assertThat(digits).isEqualTo(Arrays.asList("one", "two", "six", "four", "five", "three"));
		
	}
	
	
	@Test
	public void comparingIntRefactored() {
		
		List<String> digits = Arrays.asList("one", "two", "three", "four", "five", "six");
		digits.forEach(digit -> System.out.print(" :: " + digit));
		
		// sort by length
		Comparator<String> lambdaComparator = Comparator.comparingInt(input -> input.length());
		
		digits.sort(lambdaComparator);
		assertThat(digits).isEqualTo(Arrays.asList("one", "two", "six", "four", "five", "three"));
		
	}
	
	@Test
	public void compareUsersByNameAndAge() {
		
		User sathya = new User("Sathya", 35);
		User lr = new User("LR", 35);
		User dsp = new User("DSP", 10);
		User ssp1 = new User("SSP", 5);
		User ssp2 = new User("SSP", 3);
		
		List<User> users = Arrays.asList(sathya, lr, dsp, ssp1, ssp2);
		
		users.forEach(user -> System.out.println(user));
		users.forEach(user -> System.out.println("Name : " + user.name + ", Age : " + user.age));
		
		// chain of lambdas
		Comparator<User> comparatorByName = Comparator.comparing(user -> user.name);
		Comparator<User> comparatorByAge = Comparator.comparingInt(user -> user.age);
		
		users.sort(comparatorByName.thenComparing(comparatorByAge));
		users.forEach(user -> System.out.println(user));
		assertThat(users).containsSequence(dsp, lr, ssp2, ssp1, sathya);
		
	}	
	
	private class User {
		
		private String name;
		private Integer age;
		
		public User(String name, Integer age) {
			super();
			this.name = name;
			this.age = age;
		}
		
		@Override
		public String toString() {
			return "[ User: " + name + ", Age: " + age + "]";
		}
		
	}
}
