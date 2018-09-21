package ddd.test.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ddd.test.Calc;

class CalcTest {
	
	@Test
	void testSum1() {
		assertEquals(4, Calc.sum(2, 2));
		assertEquals(3, Calc.sum(1, 2));
		assertEquals(10, Calc.sum(10, 0));
	}

}
