package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

public class StreamTest {
	

	@Test
	public void filterUsersAverageAge() {
		
		List<User> users = populateUsers();

		Stream<User> usersStream = users.stream();
		Stream<String> nameStream = usersStream.map(user -> user.name);
		Stream<String> filteredNames = nameStream.filter(user -> user.isEmpty());
		assertThat(filteredNames.count()).isEqualTo(1);
		
	}
	
	@Test
	public void filterUsersAverageAgeSimplified() {
		
		List<User> users = populateUsers();

		// Simplified
		long countEmptyNames = users.stream()
									.map(user -> user.name)
									.filter(user -> user.isEmpty())
									.count();
		assertThat(countEmptyNames).isEqualTo(1);

		long countNonEmptyNames = users.stream()
									.map(user -> user.name)
									.filter(user -> !user.isEmpty())
									.count();
		assertThat(countNonEmptyNames).isEqualTo(5);

		long countAdults = users.stream()
								.map(user -> user.age)
								.filter(user -> user > 20)
								.count();
		assertThat(countAdults).isEqualTo(2);
	}

	private List<User> populateUsers() {
		User sathya = new User("Sathya", 35);
		User lr = new User("LR", 35);
		User dsp = new User("DSP", 10);
		User ssp1 = new User("SSP", 5);
		User ssp2 = new User("SSP", 3);
		User dummy = new User("", 1); 
		
		List<User> users = Arrays.asList(sathya, lr, dsp, ssp1, ssp2, dummy);
		return users;
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
			return " User [ Name = " + name + ", Age = " + age + "]";
		}

	}
}
