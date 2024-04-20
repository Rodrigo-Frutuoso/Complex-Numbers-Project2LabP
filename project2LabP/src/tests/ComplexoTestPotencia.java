package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;

public class ComplexoTestPotencia {

	private Complexo expected;
	private Complexo actual;
	
	@Test
	public void testPotencia1() {
		
		Complexo um = new ComplexoConcreto(1, 2);
		expected = new ComplexoConcreto (-0.3002831060007772,3.3301906767855614);
		actual = um.potencia(1.5);
		
		assertTrue(expected.ehIgual(actual));
		
	}
	
	@Test
	public void testPotencia2() {
		
		Complexo um = new ComplexoConcreto(1,0);
		expected = new ComplexoConcreto (1,0);
		actual = um.potencia(10);
		
		assertTrue(expected.ehIgual(actual));
		
	}
	
	@Test
	public void testPotencia3() {
		
		Complexo um = new ComplexoConcreto(0,1);
		expected = new ComplexoConcreto (-1,0);
		actual = um.potencia(2);
		
		assertTrue(expected.ehIgual(actual));
		
	}
	
	@Test
	public void testPotencia4() {
		
		Complexo um = new ComplexoConcreto(1,2);
		expected = new ComplexoConcreto (1.27201965, 0.786151378);
		actual = um.potencia(0.5);
		
		assertTrue(expected.ehIgual(actual));
		
	}
	
	@Test
	public void testPotencia5() {
		
		Complexo um = new ComplexoConcreto(1,-2);
		expected = new ComplexoConcreto (1.27201965, -0.786151378);
		actual = um.potencia(0.5);
		
		assertTrue(expected.ehIgual(actual));
		
	}

}
