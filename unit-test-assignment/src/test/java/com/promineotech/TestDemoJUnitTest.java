package com.promineotech;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import java.util.Random;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;



class TestDemoJUnitTest {
	
	private TestDemo testDemo;

	@BeforeEach
	void setUp() throws Exception {
		testDemo = new TestDemo();
	}

	@ParameterizedTest
	@MethodSource("TestDemoUnitTest#argumentsForAddPositive")
	void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException) {
	testDemo = new TestDemo();
		if(!expectException) 
	
	{
		assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
	} else {
			assertThatThrownBy(() -> testDemo.addPositive(a, b))
				.isInstanceOf(IllegalArgumentException.class);
		}
	}

	public static Stream<Arguments> argumentsForAddPositive () {
		return Stream.of(arguments(2, 4, 6, false));
		
	}
	
	@Test
	private void assertThatTwoPositiveNumbersAreAddedCorrectly() {
		assertThat(testDemo.addPositive(4, 5)).isEqualTo(9);
		assertThat(testDemo.addPositive(40, 50)).isEqualTo(90);
		assertThat(testDemo.addPositive(10, 10)).isEqualTo(20);
		assertThat(testDemo.addPositive(15, 5)).isEqualTo(15);
		assertThat(testDemo.addPositive(100, 1)).isEqualTo(101);
			
	}
	
	@Test
		private void assertSubtractionIsCorrect() {
			assertThat(testDemo.subtractNumbers(10, 5)).isEqualTo(5);
			assertThat(testDemo.subtractNumbers(20, 5)).isEqualTo(15);
			assertThat(testDemo.subtractNumbers(30, 5)).isEqualTo(25);

}
		
	
		TestDemo mockDemo = spy(testDemo);
	
		@Test
	private void assertThatNumberSquaredIsCorrect() {
		doReturn(5).when(mockDemo).getRandomInt();	}
		int fiveSquared = mockDemo.randomNumberSquared(); {
		assertThat(fiveSquared).isEqualTo(25);
		
		}


		

	
	
	
	
	}
