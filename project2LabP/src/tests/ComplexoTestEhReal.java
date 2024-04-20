package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;

public class ComplexoTestEhReal {

	private boolean expected;
	private boolean actual;
	
	@Test
	public void testEhReal1() {
		
		Complexo um = new ComplexoConcreto(0, 1);
		expected = false;
		actual = um.ehReal();
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testEhReal2() {
		
		Complexo um = new ComplexoConcreto(1, 0);
		expected = true;
		actual = um.ehReal();		

		assertEquals(expected,actual);
		
	}
	
	@Test // testando tamanho da parte imaginaria perto do limite do erro; usa erro por omissao
	public void testEhReal3a() {
		
		Complexo um = new ComplexoConcreto(1, Complexo.getErro() - Complexo.getErro() / 10);
		expected = true;
		actual = um.ehReal();
		
		assertEquals(expected,actual);
		
	}
	
	@Test // testando tamanho da parte imaginaria perto do limite do erro; usa parametro erro
	public void testEhReal3b() {
		
		Complexo um = new ComplexoConcreto(1, Complexo.getErro() - Complexo.getErro() / 10);
		expected = true;
		actual = um.ehReal(Complexo.getErro());
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testEhReal4() {
		
		Complexo um = new ComplexoConcreto(2, 3);
		expected = false;
		actual = um.ehReal();
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testEhReal5() {
		
		Complexo um = new ComplexoConcreto(-2,0);
		expected = true;
		actual = um.ehReal();
		
		assertEquals(expected,actual);
		
	}
	
	@Test // testando tamanho da parte imaginaria ligeiramente acima do limite do erro; usa erro por omissao
	public void testEhReal6a() {
		
		Complexo um = new ComplexoConcreto(-2, Complexo.getErro() + Complexo.getErro() / 10);
		expected = false;
		actual = um.ehReal();
		
		assertEquals(expected,actual);
		
	}
	
	@Test // testando tamanho da parte imaginaria ligeiramente acima do limite do erro; usa parametro erro
	public void testEhReal6b() {
		
		Complexo um = new ComplexoConcreto(-2, Complexo.getErro() + Complexo.getErro() / 10);
		expected = false;
		actual = um.ehReal(Complexo.getErro());
		
		assertEquals(expected,actual);
		
	}

}
