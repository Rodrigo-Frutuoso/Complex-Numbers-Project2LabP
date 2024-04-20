package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;

public class ComplexoTestEhIgual {

	private boolean expected;
	private boolean actual;
	
	@Test
	public void testEhIgual1() {
		
		Complexo um = new ComplexoConcreto(0, 1);
		Complexo outro = new ComplexoConcreto(0, 1);
		expected = true;
		actual = um.ehIgual(outro);
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testEhIgual2() {
		
		Complexo um = new ComplexoConcreto(1, 0);
		Complexo outro = new ComplexoConcreto(0, 1);
		expected = false;
		actual = um.ehIgual(outro);
		
		assertEquals(expected,actual);
		
	}
	
	@Test // testando diferenca perto do limite do erro; usa erro por omissao
	public void testEhIgual3a() {
		
		Complexo um = new ComplexoConcreto(1 + Complexo.getErro() - Complexo.getErro() / 10,
				                           5 + Complexo.getErro() - Complexo.getErro() / 10);
		Complexo outro = new ComplexoConcreto(1, 5);
		expected = true;
		actual = um.ehIgual(outro);
		
		assertEquals(expected,actual);
		
	}
	
	@Test // testando diferenca perto do limite do erro; usa parametro erro
	public void testEhIgual3b() {
		
		Complexo um = new ComplexoConcreto(1 + Complexo.getErro() - Complexo.getErro() / 10,
				                           5 + Complexo.getErro() - Complexo.getErro() / 10);
		Complexo outro = new ComplexoConcreto(1, 5);
		expected = true;
		actual = um.ehIgual(outro, Complexo.getErro());
		
		assertEquals(expected,actual);
		
	}
	
	@Test  // testando diferenca ligeiramente superior ao limite do erro; usa erro por omissao
	public void testEhIgual4a() {
		
		Complexo um = new ComplexoConcreto(2, 3);
		Complexo outro = new ComplexoConcreto(2,  3 + Complexo.getErro() * 10);
		expected = false;
		actual = um.ehIgual(outro);
		
		assertEquals(expected,actual);
		
	}
	
	@Test  // testando diferenca ligeiramente superior ao limite do erro; usa parametro erro
	public void testEhIgual4b() {
		
		Complexo um = new ComplexoConcreto(2, 3);
		Complexo outro = new ComplexoConcreto(2,  3 + Complexo.getErro() * 10);
		expected = false;
		actual = um.ehIgual(outro, Complexo.getErro());
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testEhIgual5() {
		
		Complexo um = new ComplexoConcreto(2, 3);
		Complexo outro = new ComplexoConcreto(3, 2);
		expected = false;
		actual = um.ehIgual(outro);
		
		assertEquals(expected,actual);
		
	}
	
	
	@Test
	public void testEhIgual6() {
		
		Complexo um = new ComplexoConcreto(-2, 3);
		Complexo outro = new ComplexoConcreto(-2, 3);
		expected = true;
		actual = um.ehIgual(outro);
		
		assertEquals(expected,actual);
		
	}
	
	@Test  // testando diferenca perto do limite do erro; usa erro por omissao
	public void testEhIgual7a() {
		
		Complexo um = new ComplexoConcreto(2, -3);
		Complexo outro = new ComplexoConcreto(2.00000000001, -(3 + Complexo.getErro() - Complexo.getErro()));
		expected = true;
		actual = um.ehIgual(outro);
		
		assertEquals(expected,actual);
		
	}
	
	@Test  // testando diferenca perto do limite do erro; usa parametro erro
	public void testEhIgual7b() {
		
		Complexo um = new ComplexoConcreto(2, -3);
		Complexo outro = new ComplexoConcreto(2.00000000001, -(3 + Complexo.getErro() - Complexo.getErro()));
		expected = true;
		actual = um.ehIgual(outro, Complexo.getErro());
		
		assertEquals(expected,actual);
		
	}

}
