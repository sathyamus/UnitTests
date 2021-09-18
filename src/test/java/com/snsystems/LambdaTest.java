package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.junit.Test;

public class LambdaTest {
	
	@Test
	public void lambda() {
		
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
		
	}

}
