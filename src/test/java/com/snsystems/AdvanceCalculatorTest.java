package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.verification.Times;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AdvanceCalculatorTest {
	
	private CalculatorService calculatorService = null;
	
	@Mock
	private CalculatorService calculatorServiceMock = null;

	@Test
	public void performMultiplyOperations() {
		
		calculatorService = new CalculatorService() {
			
			@Override
			public int add(int i, int j) {
				return i + j;
			}
		};
		
		AdvanceCalculator advCalc = new AdvanceCalculator(calculatorService);
		assertThat(advCalc.perform(2, 3)).isEqualTo(10);
	}
	
	
	@Test
	public void performMultiplyOperationsWithMock() {
		
		Mockito.when(calculatorServiceMock.add(Mockito.anyInt(), Mockito.anyInt())).thenReturn(5);
		
		AdvanceCalculator advCalc = new AdvanceCalculator(calculatorServiceMock);
		assertThat(advCalc.perform(2, 3)).isEqualTo(10);
		
		Mockito.verify(calculatorServiceMock, Mockito.times(1)).add(Mockito.anyInt(), Mockito.anyInt());
	}
}
