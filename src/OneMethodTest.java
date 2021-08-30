import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OneMethodTest {

	@Test
	void test_returnType() {
		Object o = OneMethod.ONE(1, 1);
		assertTrue(o instanceof float[], "Method should return array of int (int[])");

	}
	
	@Test
	void test_arraySize() {
		float[] result = OneMethod.ONE(1, 1);
		assertEquals(3, result.length, "Method should return array of int with 3 values");
	}
	
	@Test
	void test_results() {
		float[] result = OneMethod.ONE(5, 2);
		assertEquals(10f, result[0], "first element of array should have result of 5*2 which is 10");
		assertEquals(2.5f, result[1], "second element of array should have result of 5/2 which is 2.5");
		assertEquals(1f, result[2], "third element of array should have result of 5%2 which is 1");
	}
	
	@Test
	void test_results_whenFirstZero() {
		float[] result = OneMethod.ONE(0, 10);
		assertEquals(0f, result[0], "first element of array should have result of 0*10 which is 0");
		assertEquals(0f, result[1], "second element of array should have result of 0/10 which is 0");
		assertEquals(0f, result[2], "third element of array should have result of 0%10 which is 0");
	}
	
	@Test
	void test_exeptionExpected_whenZero() {
		assertThrows(ArithmeticException.class, () -> {
			OneMethod.ONE(5, 0);
		  });
		assertThrows(ArithmeticException.class, () -> {
			OneMethod.ONE(0, 0);
		  });
	}
	

	
	@Test
	void test_exeptionExpected_whenTooBig() {
		assertThrows(IllegalArgumentException.class, () -> {
			OneMethod.ONE(Integer.MAX_VALUE, Integer.MAX_VALUE);
		  });
		assertThrows(IllegalArgumentException.class, () -> {
			OneMethod.ONE(0, Integer.MAX_VALUE);
		  });
		assertThrows(IllegalArgumentException.class, () -> {
			OneMethod.ONE(Integer.MAX_VALUE, 0);
		  });
	}
	
	@Test
	void test_exeptionExpected_whenTooLow() {
		assertThrows(IllegalArgumentException.class, () -> {
			OneMethod.ONE(Integer.MIN_VALUE, Integer.MIN_VALUE);
		  });
		assertThrows(IllegalArgumentException.class, () -> {
			OneMethod.ONE(0, Integer.MIN_VALUE);
		  });
		assertThrows(IllegalArgumentException.class, () -> {
			OneMethod.ONE(Integer.MIN_VALUE, 0);
		  });
	}

}


