package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;

public class ComplexoTestSoma {
	
	private Complexo expected;
	private Complexo actual;
	
	@Test
	public void testEhIgual1() {
		
		Complexo um = new ComplexoConcreto(0, 1);
		Complexo outro = new ComplexoConcreto(0, 1);
		expected = new ComplexoConcreto (0,2);
		actual = um.soma(outro);
		
		assertTrue(expected.ehIgual(actual));
		
	}
	
	@Test
	public void testEhIgual2() {
		
		Complexo um = new ComplexoConcreto(1, 0);
		Complexo outro = new ComplexoConcreto(0, 1);
		expected = new ComplexoConcreto (1,1);
		actual = um.soma(outro);
		
		assertTrue(expected.ehIgual(actual));
		
	}
	
	@Test
	public void testEhIgual3() {
		
		Complexo um = new ComplexoConcreto(1,2);
		Complexo outro = new ComplexoConcreto(0, 0);
		expected = new ComplexoConcreto (1,2);
		actual = um.soma(outro);
		
		assertTrue(expected.ehIgual(actual));
		
	}
	
	@Test
	public void testEhIgual4() {
		
		Complexo um = new ComplexoConcreto(2, 3);
		Complexo outro = new ComplexoConcreto(-2, -3);
		expected = new ComplexoConcreto (0,0);
		actual = um.soma(outro);
		
		assertTrue(expected.ehIgual(actual));
		
	}
	
	@Test
	public void testEhIgual5() {
		
		Complexo um = new ComplexoConcreto(2, 3);
		Complexo outro = new ComplexoConcreto(3, 2);
		expected = new ComplexoConcreto (5,5);
		actual = um.soma(outro);
		
		assertTrue(expected.ehIgual(actual));
		
	}
	
	
	@Test
	public void testEhIgual6() {
		
		Complexo um = new ComplexoConcreto(-2, 3);
		Complexo outro = new ComplexoConcreto(3, -5);
		expected = new ComplexoConcreto (1,-2);
		actual = um.soma(outro);
		
		assertTrue(expected.ehIgual(actual));
		
	}
	
	@Test
	public void testEhIgual7() {
		
		Complexo um = new ComplexoConcreto(-2, -3);
		Complexo outro = new ComplexoConcreto(-2,-3);
		expected = new ComplexoConcreto (-4,-6);
		actual = um.soma(outro);
		
		assertTrue(expected.ehIgual(actual));
		
	}

}
