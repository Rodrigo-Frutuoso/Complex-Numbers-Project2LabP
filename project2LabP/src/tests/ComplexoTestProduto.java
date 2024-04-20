package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;

public class ComplexoTestProduto {

	private Complexo expected;
	private Complexo actual;
	
	@Test
	public void testEhIgual1() {
		
		Complexo um = new ComplexoConcreto(0, 1);
		Complexo outro = new ComplexoConcreto(0, 1);
		expected = new ComplexoConcreto (-1,0);
		actual = um.produto(outro);
		
		assertTrue(expected.ehIgual(actual));
		
	}
	
	@Test
	public void testEhIgual2() {
		
		Complexo um = new ComplexoConcreto(1, 0);
		Complexo outro = new ComplexoConcreto(0, 1);
		expected = new ComplexoConcreto(0,1);
		actual = um.produto(outro);
		
		assertTrue(expected.ehIgual(actual));
		
	}
	
	@Test
	public void testEhIgual3() {
		
		Complexo um = new ComplexoConcreto(1,2);
		Complexo outro = new ComplexoConcreto(0, 0);
		expected = new ComplexoConcreto (0,0);
		actual = um.produto(outro);
		
		assertTrue(expected.ehIgual(actual));
		
	}
	
	@Test
	public void testEhIgual4() {
		
		Complexo um = new ComplexoConcreto(2, 3);
		Complexo outro = new ComplexoConcreto(-2, -3);
		expected = new ComplexoConcreto (5,-12);
		actual = um.produto(outro);
				
		assertTrue(expected.ehIgual(actual));
		
	}
	
	@Test
	public void testEhIgual5() {
		
		Complexo um = new ComplexoConcreto(2, 3);
		Complexo outro = new ComplexoConcreto(3, 2);
		expected = new ComplexoConcreto (0,13);
		actual = um.produto(outro);
		
		assertTrue(expected.ehIgual(actual));
		
	}
	
	
	@Test
	public void testEhIgual6() {
		
		Complexo um = new ComplexoConcreto(-2, 3);
		Complexo outro = new ComplexoConcreto(3, -5);
		expected = new ComplexoConcreto (9,19);
		actual = um.produto(outro);
	
		assertTrue(expected.ehIgual(actual));
		
	}
	
	@Test
	public void testEhIgual7() {
		
		Complexo um = new ComplexoConcreto(-2, -3);
		Complexo outro = new ComplexoConcreto(-2,-3);
		expected = new ComplexoConcreto (-5,12);
		actual = um.produto(outro);

		assertTrue(expected.ehIgual(actual));
		
	}
	
	@Test
	public void testEhIgual8() {
		
		Complexo um = new ComplexoConcreto(2, 3);
		Complexo outro = new ComplexoConcreto(2, -3);
		expected = new ComplexoConcreto (13,0);
		actual = um.produto(outro);
		
		assertTrue(expected.ehIgual(actual));
		
	}

}
