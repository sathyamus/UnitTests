package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.junit.Test;

public class LambdaTest {
	
	@Test
	public void filterStrings() {
		
		String[] colors = {"red", "green", "blue", "orange", "purple", "yellow"	};
		
		Predicate<String> endingWithE = new Predicate<String>() {
			@Override
			public boolean test(String color) {
				return color.endsWith("e");
			}
		};
		
		List<String> colors1 = Arrays.asList(colors);
		List<String> colors2 = new ArrayList<>(Arrays.asList(colors));
		
		System.out.println("colors :");
		colors1.forEach(color -> System.out.println("- " + color));
		assertThat(colors1).hasSize(6);

		System.out.println("removeIf :");
		colors2.removeIf(endingWithE);
		colors2.forEach(color -> System.out.println("- " + color));
		
		System.out.println("removeIf v2:");
		colors2 = new ArrayList<>(Arrays.asList(colors));
		colors2.removeIf(color -> color.endsWith("e"));
		colors2.forEach(color -> System.out.println("- " + color));
		
		assertThat(colors2).hasSize(3);
		
		colors2 = new ArrayList<>(Arrays.asList(colors));
		System.out.println("filter :");
		Stream<String> filtered = colors2.stream().filter(endingWithE);
		filtered.forEach(color -> System.out.println("- " + color));
		
		// For making re-use of stream, re-creating them
		filtered = colors2.stream().filter(endingWithE);
		assertThat(filtered).hasSize(3);
	}
	
	@Test
	public void supplier() {
		Supplier<String> supplier = () -> "Hello";
		assertThat(supplier.get()).isEqualTo("Hello");
		
		supplier = () -> {
			System.out.println("Inside the Supplier Lambda");
			return "Hello";
		};
		assertThat(supplier.get()).isEqualTo("Hello");
		
	}
	
	@Test
	public void consumer() {
		
		Consumer<String> consumer = (String input) -> System.out.println(input);
		consumer = (String input) -> {
			System.out.println("Inside the Consumer Lambda");
			System.out.println(input);
		};
		consumer.accept("Hello");
		consumer.accept("Hello World!");
		
	}
	
	@Test
	public void filterStringsV2() {
		
		String[] colors = {"red", "green", "blue", "orange", "purple", "yellow"	};
		List<String> colors1 = new ArrayList<>(Arrays.asList(colors));
		System.out.println("colors Before remove :");
		assertThat(colors1).hasSize(6);
		Predicate<String> filterByE = (String input) -> input.endsWith("e");
		
		System.out.println("colors After filter :");
		colors1.removeIf(filterByE);
		assertThat(colors1).hasSize(3);
		
		
		
	}
	
	@Test
	public void function() {
		Function<String[], Integer> length = (String[] input) -> {
			return input.length;
		};
		
		String[] colors = {"red", "green", "blue", "orange", "purple", "yellow"	};
		assertThat(length.apply(colors)).isEqualTo(6);
	}
	

}
