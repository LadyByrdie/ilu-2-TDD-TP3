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
	
	@Test
	void testEX_8() {
		assertEquals(Welcome.welcome("bob      ,amy  "),"Hello, Bob and Amy.");
		assertEquals(Welcome.welcome("BOB    , amy"),"Hello, Amy. AND HELLO, BOB!");
		assertEquals(Welcome.welcome("BOB    , AMY   "),"HELLO, BOB AND AMY!");

	}
	
	@Test
	void testEX_9() {
		assertEquals(Welcome.welcome("bob,JERRY,amy,bob,JERRY,bob"),"Hello, Bob (x3) and Amy. AND HELLO, JERRY (x2)!");
		assertEquals(Welcome.welcome("bob,Bob,bob"),"Hello, Bob (x3).");
		assertEquals(Welcome.welcome("BOB,BOB , bob,bob"),"Hello, Bob (x2). AND HELLO, BOB (x2)!");
	}
	
	@Test
	void testEX_10() {
		assertEquals(Welcome.welcome("bob,yoda,amy,JERRY"),"Bob, Yoda and Amy, Hello. AND HELLO, JERRY!");
		assertEquals(Welcome.welcome("bob,YODA,amy,JERRY,YODA"),"Hello, Bob and Amy. AND YODA (x2) AND JERRY HELLO!");
		assertEquals(Welcome.welcome("yoda,YODA ,Yoda,yoda"),"Yoda (x3), Hello. AND YODA HELLO!");
		assertEquals(Welcome.welcome("bob,YODA,amy,YODA,JERRY"),"Hello, Bob and Amy. AND YODA (x2) AND JERRY HELLO!");

	}
}
