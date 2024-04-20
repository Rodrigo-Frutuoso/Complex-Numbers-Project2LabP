package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;
import project.Polinomio;
import project.PolinomioVetor;

public class PolinomioTestesGrau {

    private Polinomio p;
    private int esperado;
    private int obtido;

    @Test(timeout = 1000)
    public void grau0 () {
        Complexo[] coefs= new ComplexoConcreto[1];
        coefs[0] = new ComplexoConcreto(3,2);
        p = new PolinomioVetor (coefs);
        esperado = 0;
        obtido = p.grau();
        assertEquals(esperado, obtido);
    }
    
    @Test(timeout = 1000)
    public void grau0NaoInteiro () {
        Complexo[] coefs= new ComplexoConcreto[1];
        coefs[0] = new ComplexoConcreto(1,2);
        p = new PolinomioVetor (coefs);
        esperado = 0;
        obtido = p.grau();
        assertEquals(esperado, obtido);
    }
    
    @Test(timeout = 1000)
    public void grau1Inteiro () {
        Complexo[] coefs= new ComplexoConcreto[2];
        coefs[0] = new ComplexoConcreto(2,1);
        coefs[1] = new ComplexoConcreto(2,2);
        p = new PolinomioVetor (coefs);
        esperado = 1;
        obtido = p.grau();
        assertEquals(esperado, obtido);
    }
    
    @Test(timeout = 1000)
    public void grau1NaoInteiro () {
        Complexo[] coefs= new ComplexoConcreto[2];
        coefs[0] = new ComplexoConcreto(2,3);
        coefs[1] = new ComplexoConcreto(2,5);
        p = new PolinomioVetor (coefs);
        esperado = 1;
        obtido = p.grau();
        assertEquals(esperado, obtido);
    }
    
    
    @Test(timeout = 1000)
    public void grauMaiorQue1Inteiro () {
        Complexo[] coefs= new ComplexoConcreto[4];
        coefs[0] = new ComplexoConcreto(1,1);
        coefs[1] = coefs[0];
        coefs[2] = coefs[0];
        coefs[3] = coefs[0];
        p = new PolinomioVetor (coefs);
        esperado = 3;
        obtido = p.grau();
        assertEquals(esperado, obtido);
    }
    
    
    @Test(timeout = 1000)
    public void grauMaiorQue1NaoInteiro () {
        Complexo[] coefs= new ComplexoConcreto[4];
        coefs[0] = new ComplexoConcreto(2,3);
        coefs[1] = coefs[0];
        coefs[2] = coefs[0];
        coefs[3] = coefs[0];
        p = new PolinomioVetor (coefs);
        esperado = 3;
        obtido = p.grau();
        assertEquals(esperado, obtido);
    }
}
