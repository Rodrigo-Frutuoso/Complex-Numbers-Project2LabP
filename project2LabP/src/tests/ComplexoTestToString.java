package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;

public class ComplexoTestToString {

	private String expected;
	private String actual;
	
	@Test
	public void testEhToString1() {
		
		Complexo um = new ComplexoConcreto(0, 1);
		expected = "1.0i";
		actual = um.toString();
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testEhToString2() {
		
		Complexo um = new ComplexoConcreto(1, 0);
		expected = "1.0";
		actual = um.toString();
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testEhToString3() {
		
		Complexo um = new ComplexoConcreto(-1, 0);
		expected = "- 1.0";
		actual = um.toString();
		
		assertEquals(expected,actual);
		
	}	
	
	@Test
	public void testEhToString4() {
		
		Complexo um = new ComplexoConcreto(0, -1);
		expected = "- 1.0i";
		actual = um.toString();
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testEhToString5() {
		
		Complexo um = new ComplexoConcreto(0, 0);
		expected = "0.0";
		actual = um.toString();
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testEhToString6() {
		
		Complexo um = new ComplexoConcreto(-0.5, -0.5);
		expected = "- 0.5 - 0.5i";
		actual = um.toString();
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testEhToString7() {
		
		Complexo um = new ComplexoConcreto(0.5, -0.5);
		expected = "0.5 - 0.5i";
		actual = um.toString();
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testEhToString8() {
		
		Complexo um = new ComplexoConcreto(-0.5, 0.5);
		expected = "- 0.5 + 0.5i";
		actual = um.toString();
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testEhToString9() {
		
		Complexo um = new ComplexoConcreto(-0.5, -0.5);
		expected = "- 0.5 - 0.5i";
		actual = um.toString();
		
		assertEquals(expected,actual);
		
	}
}
