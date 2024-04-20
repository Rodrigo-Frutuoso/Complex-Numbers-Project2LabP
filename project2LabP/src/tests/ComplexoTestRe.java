package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;

public class ComplexoTestRe {

	private double expected;
	private double actual;
	private final double ERRO_EQUALS = Complexo.getErro() / 10;
	
	@Test
	public void testIm1() {
		
		Complexo x = new ComplexoConcreto(0, 1);
		expected = 0;
		actual = x.re();
		
		assertEquals(expected, actual, ERRO_EQUALS);
		
	}
	
	@Test
	public void testRe2() {
		
		Complexo x = new ComplexoConcreto(1, 1);
		expected = 1;
		actual = x.re();
		
		assertEquals(expected, actual, ERRO_EQUALS);
		
	}
	
	@Test
	public void testRe3() {
		
		Complexo x = new ComplexoConcreto(0, 0);
		expected = 0;
		actual = x.re();
		
		assertEquals(expected, actual, ERRO_EQUALS);
		
	}
	
	@Test
	public void testRe4() {
		
		Complexo x = new ComplexoConcreto(3, -1);
		expected = 3;
		actual = x.re();
		
		assertEquals(expected, actual, ERRO_EQUALS);
		
	}
	
	@Test
	public void testRe5() {
		
		Complexo x = new ComplexoConcreto(-3, -1);
		expected = -3;
		actual = x.re();
		
		assertEquals(expected, actual, ERRO_EQUALS);
		
	}

}
