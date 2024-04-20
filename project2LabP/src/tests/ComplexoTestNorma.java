package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;

public class ComplexoTestNorma {

	private double expected;
	private double actual;
	private final double ERRO_EQUALS = Complexo.getErro() / 10;
	
	@Test
	public void testNorma1() {
		
		Complexo x = new ComplexoConcreto(0, 1);
		expected = 1;
		actual = x.norma();
		
		assertEquals(expected, actual, ERRO_EQUALS);
		
	}
	
	@Test
	public void testNorma2() {
		
		Complexo x = new ComplexoConcreto(4, 3);
		expected = 5;
		actual = x.norma();
		
		assertEquals(expected, actual, ERRO_EQUALS);
		
	}
	
	@Test
	public void testNorma3() {
		
		Complexo x = new ComplexoConcreto(-3, 4);
		expected = 5;
		actual = x.norma();
		
		assertEquals(expected, actual, ERRO_EQUALS);
		
	}
	
	@Test
	public void testNorma4() {
		
		Complexo x = new ComplexoConcreto(-4, -3);
		expected = 5;
		actual = x.norma();
		
		assertEquals(expected, actual, ERRO_EQUALS);
		
	}
	
	@Test
	public void testNorma5() {
		
		Complexo x = new ComplexoConcreto(3, -4);
		expected = 5;
		actual = x.norma();
		
		assertEquals(expected, actual, ERRO_EQUALS);
		
	}
	
	@Test
	public void testNorma6() {
		
		Complexo x = new ComplexoConcreto(0,0);
		expected = 0;
		actual = x.norma();
		
		assertEquals(expected, actual, ERRO_EQUALS);
		
	}
	
	@Test
	public void testNorma7() {
		
		Complexo x = new ComplexoConcreto(1, 0);
		expected = 1;
		actual = x.norma();
		
		assertEquals(expected, actual, ERRO_EQUALS);
		
	}

}
