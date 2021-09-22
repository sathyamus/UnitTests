package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class LambdaVsInnerClassTest {
	
	interface Calculator {
		String display();
	}
	

	
	@Test
	public void lambdaImpl() {
		Calculator calc = () -> {
			return "display method Impl from Lambda";
		};
		
		assertThat(calc.display()).isEqualTo("display method Impl from Lambda");
	}
	
	

}
