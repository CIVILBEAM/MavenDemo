package com.lti.advdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

class RepeatedTestEx {

	@DisplayName("Repeat the test for 5 times")
	@RepeatedTest(5)
	public void shouldRepeat() {
		int a=10, b=20;
		assertEquals(400,(a*b), "should repeat test - passed");
	}
	
	
}
