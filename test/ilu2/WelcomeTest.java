package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void testEX_1() {
		assertEquals(Welcome.welcome("Bob"),"Hello, Bob");
		assertEquals(Welcome.welcome("bob"),"Hello, Bob");
		assertEquals(Welcome.welcome("Maeva"),"Hello, Maeva");
		assertEquals(Welcome.welcome("maeva"),"Hello, Maeva");
	}
	
	@Test
	void testEX_2() {
		assertEquals(Welcome.welcome(" "),"Hello, my friend.");
		assertEquals(Welcome.welcome(""),"Hello, my friend.");
		assertEquals(Welcome.welcome(null),"Hello, my friend.");
	}
	

	@Test
	void testEX_3() {
		assertEquals(Welcome.welcome("JERRY"),"HELLO, JERRY!");
		assertEquals(Welcome.welcome("LAURA"),"HELLO, LAURA!");
	}
	
	@Test
	void testEX_4() {
		assertEquals(Welcome.welcome("amy,bob"),"Hello, Amy, Bob");
		assertEquals(Welcome.welcome("Amy,Bob"),"Hello, Amy, Bob");
	}
	
	@Test
	void testEX_5() {
		assertEquals(Welcome.welcome("amy,bob,Jerry"),"Hello, Amy, Bob, Jerry");
		assertEquals(Welcome.welcome("Amy,Bob,jerry"),"Hello, Amy, Bob, Jerry");
	}
}
