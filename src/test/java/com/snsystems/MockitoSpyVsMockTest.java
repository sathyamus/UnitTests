package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class MockitoSpyVsMockTest {
	
	@Mock
	private List<String> mockList = new ArrayList<>();
	
	@Spy
	private List<String> spyList = new ArrayList<>();	
	
	@Test
	public void able_to_mock_and_track_collection() {
		MockitoAnnotations.initMocks(this);
		mockList.add("Sathya");
		Mockito.verify(mockList).add("Sathya");
		assertThat(mockList).isNotNull();
		assertThat(spyList).isEmpty();
		assertThat(mockList).hasSize(0);
	}
	
	@Test
	public void able_to_spy_and_track_collection() {
		MockitoAnnotations.initMocks(this);
		spyList.add("Sathya");
		Mockito.verify(spyList).add("Sathya");
		assertThat(spyList).isNotNull();
		assertThat(spyList).isNotEmpty();
		assertThat(spyList).hasSize(1);
	}	

}
