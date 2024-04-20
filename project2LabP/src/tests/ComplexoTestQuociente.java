package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;

public class ComplexoTestQuociente {

	private Complexo expected;
	private Complexo actual;
	
	@Test
	public void testEhIgual1() {
		
		Complexo um = new ComplexoConcreto(0, 1);
		Complexo outro = new ComplexoConcreto(0, 1);
		expected = new ComplexoConcreto (1,0);
		actual = um.quociente(outro);
		
		assertTrue(expected.ehIgual(actual));
		
	}
	
	@Test
	public void testEhIgual2() {
		
		Complexo um = new ComplexoConcreto(1, 0);
		
		Complexo outro = new ComplexoConcreto(0, 1);
		expected = new ComplexoConcreto (0,-1);
		actual = um.quociente(outro);
		
		assertTrue(expected.ehIgual(actual));
		
	}
	

	
	@Test
	public void testEhIgual4() {
		
		Complexo um = new ComplexoConcreto(2, 3);
		Complexo outro = new ComplexoConcreto(-2, -3);
		expected = new ComplexoConcreto (-1,0);
		actual = um.quociente(outro);
		
		assertTrue(expected.ehIgual(actual));
		
	}
	
	@Test
	public void testEhIgual5() {
		
		Complexo um = new ComplexoConcreto(2, 3);
		Complexo outro = new ComplexoConcreto(3, 2);
		expected = new ComplexoConcreto (0.92307692307,0.38461538461538);
		actual = um.quociente(outro);
		
		assertTrue(expected.ehIgual(actual));
		
	}
	
	
	@Test
	public void testEhIgual6() {
		
		Complexo um = new ComplexoConcreto(-2, 3);
		Complexo outro = new ComplexoConcreto(3, -5);
		expected = new ComplexoConcreto (-0.6176470588235294,-0.029411764705882353);
		actual = um.quociente(outro);
				
		assertTrue(expected.ehIgual(actual));
		
	}
	
	@Test
	public void testEhIgual7() {
		
		Complexo um = new ComplexoConcreto(-2, -3);
		Complexo outro = new ComplexoConcreto(-2,-3);
		expected = new ComplexoConcreto (1,0);
		actual = um.quociente(outro);		
		
		assertTrue(expected.ehIgual(actual));
		
	}
	
	@Test
	public void testEhIgual8() {
		
		Complexo um = new ComplexoConcreto(2, 3);
		Complexo outro = new ComplexoConcreto(2, -3);
		expected = new ComplexoConcreto (-0.38461538461538464,0.923076923076923);
		actual = um.quociente(outro);
		
		assertTrue(expected.ehIgual(actual));
		
	}

}
