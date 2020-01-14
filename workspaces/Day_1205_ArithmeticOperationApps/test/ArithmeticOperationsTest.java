import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmeticOperationsTest {

	@Test
	public void testAddition() {
		ArithmeticOperations ao = new ArithmeticOperations();
		assertEquals(6,ao.addition(4, 2));
	}

	@Test
	public void testSubtraction() {
		ArithmeticOperations ao = new ArithmeticOperations();
		assertEquals(2,ao.subtraction(4, 2));
	}

	@Test
	public void testMultiplication() {
		ArithmeticOperations ao = new ArithmeticOperations();
		assertEquals(8,ao.multiplication(4, 2));
	}

	@Test
	public void testDivision() {
		ArithmeticOperations ao = new ArithmeticOperations();
		assertEquals(2,ao.division(4, 2));
	}

}
