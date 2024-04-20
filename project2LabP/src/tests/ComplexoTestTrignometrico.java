package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;

public class ComplexoTestTrignometrico {

	private String expected;
	private String actual;
	
	@Test
	public void testEhToString1() {
		
		Complexo um = new ComplexoConcreto(0, 0);
		expected = "0.0 cis (0.0)";
		actual = um.repTrigonometrica();
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testEhToString2() {
		
		Complexo um = new ComplexoConcreto(1, 0);
		expected = "1.0 cis (0.0)";
		actual = um.repTrigonometrica();
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testEhToString3() {
		
		Complexo um = new ComplexoConcreto(-1, 0);
		expected = "1.0 cis (3.141592653589793)";
		actual = um.repTrigonometrica();
		
		assertEquals(expected,actual);
		
	}	
	
	@Test
	public void testEhToString4() {
		
		Complexo um = new ComplexoConcreto(0, 1);
		expected = "1.0 cis (1.5707963267948966)";
		actual = um.repTrigonometrica();
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testEhToString5() {
		
		Complexo um = new ComplexoConcreto(0, -1);
		expected = "1.0 cis (-1.5707963267948966)";
		actual = um.repTrigonometrica();
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testEhToString6() {
		
		Complexo um = new ComplexoConcreto(3, -4);
		expected = "5.0 cis (-0.9272952180016122)";
		actual = um.repTrigonometrica();
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testEhToString7() {
		
		Complexo um = new ComplexoConcreto(-3, -4);
		expected = "5.0 cis (-2.214297435588181)";
		actual = um.repTrigonometrica();
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testEhToString8() {
		
		Complexo um = new ComplexoConcreto(-3, 4);
		expected = "5.0 cis (2.214297435588181)";
		actual = um.repTrigonometrica();
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testEhToString9() {
		
		Complexo um = new ComplexoConcreto(3, 4);
		expected = "5.0 cis (0.9272952180016122)";
		actual = um.repTrigonometrica();
		
		assertEquals(expected,actual);
		
	}
}
