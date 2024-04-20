package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;

public class ComplexoTestRho {

	private double expected;
	private double actual;
	private final double ERRO_EQUALS = Complexo.getErro() / 10;
	
	@Test
	public void testIm1() {
		
		Complexo x = new ComplexoConcreto(0, 1);
		expected = 1;
		actual = x.rho();
		
		assertEquals(expected, actual, ERRO_EQUALS);
		
	}
	
	@Test
	public void testIm2() {
		
		Complexo x = new ComplexoConcreto(1, 1);
		expected = 1.4142135;
		actual = x.rho();
		
		assertEquals(expected, actual, ERRO_EQUALS);
		
	}
	
	@Test
	public void testIm3() {
		
		Complexo x = new ComplexoConcreto(0, 0);
		expected = 0;
		actual = x.rho();
		
		assertEquals(expected, actual, ERRO_EQUALS);
		
	}
	
	@Test
	public void testIm4() {
		
		Complexo x = new ComplexoConcreto(0, -1);
		expected = 1;
		actual = x.rho();
		
		assertEquals(expected, actual, ERRO_EQUALS);
		
	}
	
	@Test
	public void testIm5() {
		
		Complexo x = new ComplexoConcreto(3, -1);
		expected = 3.162277;
		actual = x.rho();
		
		assertEquals(expected, actual, ERRO_EQUALS);
		
	}

}
