package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

public class StreamTest {
	

	@Test
	public void filterUsersAverageAge() {
		
		User sathya = new User("Sathya", 35);
		User lr = new User("LR", 35);
		User dsp = new User("DSP", 10);
		User ssp1 = new User("SSP", 5);
		User ssp2 = new User("SSP", 3);
		User dummy = new User("", 1); 
		
		List<User> users = Arrays.asList(sathya, lr, dsp, ssp1, ssp2, dummy);

		Stream<User> usersStream = users.stream();
		Stream<String> nameStream = usersStream.map(user -> user.name);
		Stream<String> filteredNames = nameStream.filter(user -> user.isEmpty());
		assertThat(filteredNames.count()).isEqualTo(1);
		

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
