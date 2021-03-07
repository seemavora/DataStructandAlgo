package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CounterTest {

	Counter counter = new Counter();
	
	@Test
	void testIncrement() {
		int actual = counter.increment();
		int expected = 0;
		
		assertTrue(actual == expected);
	}

	@Test
	void testDecrement() {
		int actual = counter.decrement();
		int expected = -1;
		
		assertTrue(actual == expected);
	}
	
	@Test
	void testGetCount() {
		int actual = counter.getCount();
		int expected = 0;
		
		assertTrue(actual == expected);
		}
}
