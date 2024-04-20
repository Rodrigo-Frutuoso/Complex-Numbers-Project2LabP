package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;

public class ComplexoTestEhZero {

	private boolean expected;
	private boolean actual;
	
	@Test
	public void testehZero1() {
		
		Complexo um = new ComplexoConcreto(0, 1);
		expected = false;
		actual = um.ehZero();
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testehZero2() {
		
		Complexo um = new ComplexoConcreto(1, 0);
		expected = false;
		actual = um.ehZero();
		
		assertEquals(expected,actual);
		
	}
	
	@Test // testando tamanho perto do limite do erro; usa erro por omissao
	public void testehZero3a() {
		
		Complexo um = new ComplexoConcreto(Complexo.getErro() - Complexo.getErro() / 10,
				                           Complexo.getErro() - Complexo.getErro() / 10);
		expected = true;
		actual = um.ehZero();
		
		assertEquals(expected,actual);
		
	}
	
	@Test // testando tamanho perto do limite do erro; usa parametro erro
	public void testehZero3b() {
		
		Complexo um = new ComplexoConcreto(Complexo.getErro() - Complexo.getErro() / 10,
				                           Complexo.getErro() - Complexo.getErro() / 10);
		expected = true;
		actual = um.ehZero(Complexo.getErro());
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testehZero4() {
		
		Complexo um = new ComplexoConcreto(2, 3);
		expected = false;
		actual = um.ehZero();
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testehZero5() {
		
		Complexo um = new ComplexoConcreto(-2,0);
		expected = false;
		actual = um.ehZero();
				
		assertEquals(expected,actual);
		
	}

}
