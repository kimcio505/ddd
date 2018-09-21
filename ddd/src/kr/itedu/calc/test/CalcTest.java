package kr.itedu.calc.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kr.itedu.calc.Calc;

class CalcTest {

	@Test
	void test() {
		assertEquals(3,Calc.sum(1, 2));
		assertEquals(15,Calc.sum(5, 10));
		assertEquals(12,Calc.sum(6, 6));
	}

}
