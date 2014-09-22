package com.rakesh;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	private App app;

	@Before
	public void setUp() {
		app = new App();
	}

	@After
	public void tearDown() {
		app = null;
	}

	@Test
	public void testingAddition() {

		assertEquals("Here is test for add Result: ", 30, app.addition(27, 3));
	}

	@Test
	public void testingMultiplication() {

		assertEquals("Here is test for Multi Result: ", 30,
				app.multiplication(6, 5));
	}

	@Test
	public void testingSubstraction() {

		assertEquals("Here is test for sub Result: ", 30,
				app.substraction(33, 3));
	}

	@Test
	public void testingDivision() {

		assertEquals("Here is test for div Result: ", 30, app.division(60, 2));
	}

	@Test
	public void testingHelloWorld() {

		assertEquals("Here is test for Hello World String: ", "Hello World",
				app.helloWorld());
	}
}
