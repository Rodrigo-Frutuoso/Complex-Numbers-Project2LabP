package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;
import project.Polinomio;
import project.PolinomioVetor;

public class PolinomioTestesToString {

    private Polinomio p1;
    private String esperado;
    private String obtido;

    @Test(timeout = 10000)
    public void teste1 () {
        Complexo[] coefs= new ComplexoConcreto[1];
        coefs[0] = new ComplexoConcreto(0,0);
        p1 = new PolinomioVetor (coefs);
        esperado = "0.0";
        obtido = p1.toString();
        assertEquals(esperado,obtido);
    }

    @Test(timeout = 10000)
    public void teste2 () {
        Complexo[] coefs= new ComplexoConcreto[1];
        coefs[0] = new ComplexoConcreto(2,0);
        p1 = new PolinomioVetor (coefs);
        esperado = "2.0 cis (0.0)";
        obtido = p1.toString();
        assertEquals(esperado,obtido);
    }

    @Test(timeout = 10000)
    public void teste3 () {
        Complexo[] coefs= new ComplexoConcreto[1];
        coefs[0] = new ComplexoConcreto(0,1);
        p1 = new PolinomioVetor (coefs);
        esperado = "1.0 cis (1.5707963267948966)";
        obtido = p1.toString();
        assertEquals(esperado,obtido);
    }

    @Test(timeout = 10000)
    public void teste4 () {
        Complexo[] coefs= new ComplexoConcreto[1];
        coefs[0] = new ComplexoConcreto(1,-1);
        p1 = new PolinomioVetor (coefs);
        esperado = "1.4142135623730951 cis (-0.7853981633974483)";
        obtido = p1.toString();
        assertEquals(esperado,obtido);
    }


    @Test(timeout = 10000)
    public void teste5 () {
        Complexo[] coefs= new ComplexoConcreto[2];
        coefs[0] = new ComplexoConcreto(1,0);
        coefs[1] = new ComplexoConcreto(0,1);
        p1 = new PolinomioVetor (coefs);
        esperado = "1.0 cis (1.5707963267948966) x + 1.0 cis (0.0)";
        obtido = p1.toString();
        assertEquals(esperado,obtido);
    }

    @Test(timeout = 10000)
    public void teste6 () {
        Complexo[] coefs= new ComplexoConcreto[2];
        coefs[0] = new ComplexoConcreto(1,0);
        coefs[1] = new ComplexoConcreto(0,-1);
        p1 = new PolinomioVetor (coefs);
        esperado = "1.0 cis (-1.5707963267948966) x + 1.0 cis (0.0)";
        obtido = p1.toString();
        assertEquals(esperado,obtido);
    }

    @Test(timeout = 10000)
    public void teste7 () {
        Complexo[] coefs= new ComplexoConcreto[3];
        coefs[0] = new ComplexoConcreto(1,0);
        coefs[1] = new ComplexoConcreto(1,0);
        coefs[2] = new ComplexoConcreto(1,0);
        p1 = new PolinomioVetor (coefs);
        esperado = "1.0 cis (0.0) x^2 + 1.0 cis (0.0) x + 1.0 cis (0.0)";
        obtido = p1.toString();
        assertEquals(esperado,obtido);
    }

    @Test(timeout = 10000)
    public void teste8 () {
        Complexo[] coefs= new ComplexoConcreto[3];
        coefs[0] = new ComplexoConcreto(1,0);
        coefs[1] = new ComplexoConcreto(0,0);
        coefs[2] = new ComplexoConcreto(1,0);
        p1 = new PolinomioVetor (coefs);
        esperado = "1.0 cis (0.0) x^2 + 1.0 cis (0.0)";
        obtido = p1.toString();
        assertEquals(esperado,obtido);
    }

   @Test(timeout = 10000)
    public void teste9 () {
        Complexo[] coefs= new ComplexoConcreto[1];
        coefs[0] = new ComplexoConcreto(-2,0);
        p1 = new PolinomioVetor (coefs);
        esperado = "2.0 cis (3.141592653589793)";
        obtido = p1.toString();
        assertEquals(esperado,obtido);
    }


    @Test(timeout = 10000)
    public void poliMix () {
        Complexo[] coefs= new ComplexoConcreto[5];
        coefs[0] = new ComplexoConcreto(1,1);
        coefs[1] = new ComplexoConcreto(0,1);
        coefs[2] = new ComplexoConcreto(-1,1);
        coefs[3] = new ComplexoConcreto(0,0);
        coefs[4] = new ComplexoConcreto(3,0);
        p1 = new PolinomioVetor (coefs);
        esperado = "3.0 cis (0.0) x^4 + 1.4142135623730951 cis (2.356194490192345) x^2 + "
        		+ "1.0 cis (1.5707963267948966) x + 1.4142135623730951 cis (0.7853981633974483)";
        obtido = p1.toString();
        assertEquals(esperado,obtido);
    }
    
    
    @Test(timeout = 10000)
    public void poliMix2 () {
        Complexo[] coefs= new ComplexoConcreto[5];
        coefs[0] = new ComplexoConcreto(4,1);
        coefs[1] = new ComplexoConcreto(1,0);
        coefs[2] = new ComplexoConcreto(0,0);
        coefs[3] = new ComplexoConcreto(-1,-1);
        coefs[4] = new ComplexoConcreto(3,0);
        p1 = new PolinomioVetor (coefs);
        esperado = "3.0 cis (0.0) x^4 + 1.4142135623730951 cis (-2.356194490192345) x^3 "
        		+ "+ 1.0 cis (0.0) x + 4.123105625617661 cis (0.24497866312686414)";
        obtido = p1.toString();
        assertEquals(esperado,obtido);
    }
}
