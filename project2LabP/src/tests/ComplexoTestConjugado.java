package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;

public class ComplexoTestConjugado {
	
	@Test
	public void testComplexoTipico() {	
		Complexo complexoTipico = new ComplexoConcreto(-27.482, 12.9);
		Complexo complexoTipicoConjugado = complexoTipico.conjugado();
		assertEquals(complexoTipicoConjugado.re(), -27.482, 0.00000001);
		assertEquals(complexoTipicoConjugado.im(), -12.9, 0.00000001);		
	}
	
	@Test
	public void testComplexoReal() {	
		Complexo complexoReal = new ComplexoConcreto(2.37, 0);
		Complexo complexoRealConjugado = complexoReal.conjugado();
		assertEquals(complexoRealConjugado.re(), 2.37, 0.00000001);
		assertEquals(complexoRealConjugado.im(), 0, 0.00000001);  // na verdade, eh -0	
	}
	
}
