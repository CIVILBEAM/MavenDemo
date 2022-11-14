package com.lti.demo;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator c = new Calculator();
	
	@Test
	public void testsayHello() {
		Assertions.assertEquals("hello", c.sayHello());
	}
	
	@Test
	public void testAdd() {
		Assertions.assertEquals(100, c.add(60, 40), "Check the code again");
	}
	
	@Test
	void testAssertFalse() {
		Assertions.assertTrue("mayank".length()==6);
		Assertions.assertFalse("mayank".length()==10);//runs if condition is false
		Assertions.assertNotEquals("Hello", "hello");
	}
	
	@Disabled
	@Test
	void testAssertNull() {
		String str1 = null;
		String str2 = "abcd";
		Assertions.assertNull(str1);
		Assertions.assertNotNull(str2);
	}
	
	@Test
	public void testArrayList() {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		Assertions.assertEquals(0, myList.size());
		myList.add(100);
		myList.add(200);
		Assertions.assertEquals(2, myList.size());
	}
	
	
}
