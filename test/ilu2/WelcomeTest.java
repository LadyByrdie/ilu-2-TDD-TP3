package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void testEX_1() {
		assertEquals(Welcome.welcome("Bob"),"Hello, Bob.");
		assertEquals(Welcome.welcome("bob"),"Hello, Bob.");
		assertEquals(Welcome.welcome("Maeva"),"Hello, Maeva.");
		assertEquals(Welcome.welcome("maeva"),"Hello, Maeva.");
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
		assertEquals(Welcome.welcome("amy,bob"),"Hello, Amy and Bob.");
		assertEquals(Welcome.welcome("Amy,Bob"),"Hello, Amy and Bob.");
	}
	
	@Test
	void testEX_5() {
		assertEquals(Welcome.welcome("amy,bob,Jerry"),"Hello, Amy, Bob and Jerry.");
		assertEquals(Welcome.welcome("Amy,Bob,jerry"),"Hello, Amy, Bob and Jerry.");
	}
	
	@Test
	void testEX_6() {
		assertEquals(Welcome.welcome("AMY,bob,Jerry"),"Hello, Bob and Jerry. AND HELLO, AMY!");
		assertEquals(Welcome.welcome("amy,BOB,Jerry"),"Hello, Amy and Jerry. AND HELLO, BOB!");
	}
	
	@Test
	void testEX_7() {
		assertEquals(Welcome.welcome("bob,amy,jerry"),"Hello, Bob, Amy and Jerry.");
		assertEquals(Welcome.welcome("bob,AMY,Jerry,JACK"),"Hello, Bob and Jerry. AND HELLO, AMY AND JACK!");
		assertEquals(Welcome.welcome("BOB,AMY,JERRY"),"HELLO, BOB, AMY AND JERRY!");
	}
}
