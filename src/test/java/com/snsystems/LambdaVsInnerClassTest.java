package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class LambdaVsInnerClassTest {
	
	interface Calculator {
		String display();
	}
	
	interface CalculatorV2 {
		String display();
		default String print() {
			return "print method Impl from CalculatorV2";
		}
	}
	
	@FunctionalInterface
	interface CalculatorV3 {
		String display();
		
		String toString();
	}	
	
	@Test
	public void lambdaImpl() {
		// lambda expressions
		Calculator calc = () -> {
			return "display method Impl from Lambda";
		};
		
		assertThat(calc.display()).isEqualTo("display method Impl from Lambda");
	}
	
	@Test
	public void anonymousBlockImpl() {
		Calculator calc = new Calculator() {
			
			@Override
			public String display() {
				return "display method Impl from Anonymous Block";
			}
		};
		
		assertThat(calc.display()).isEqualTo("display method Impl from Anonymous Block");
	}	

	@Test
	public void lambdaImplWithDefaultMethods() {
		// lambda expressions
		CalculatorV2 calc = () -> {
			return "display method Impl from Lambda";
		};
		
		assertThat(calc.display()).isEqualTo("display method Impl from Lambda");
		assertThat(calc.print()).isEqualTo("print method Impl from CalculatorV2");
	}
	
	@Test
	public void lambdaImplWithFuctionalInterface() {
		// lambda expressions
		CalculatorV3 calc = () -> {
			return "display method Impl from Lambda";
		};
		
		assertThat(calc.display()).isEqualTo("display method Impl from Lambda");
		assertThat(calc.toString()).contains("com.snsystems.LambdaVsInnerClassTest$$Lambda");
	}	
}
