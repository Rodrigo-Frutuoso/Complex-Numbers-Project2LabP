package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;
import project.Polinomio;
import project.PolinomioVetor;

public class PolinomioTestesEhConstante {

    private Polinomio p;


    
    @Test(timeout = 1000)
    public void grau0NaoEhZero () {
        Complexo[] coefs= new ComplexoConcreto[1];
        coefs[0] = new ComplexoConcreto(3,2);
        p = new PolinomioVetor (coefs);
        assertTrue(p.ehConstante());
    }
    
    @Test(timeout = 1000)
    public void grau0EhZero () {
        Complexo[] coefs= new ComplexoConcreto[1];
        coefs[0] = new ComplexoConcreto(0,1);
        p = new PolinomioVetor (coefs);
        assertTrue(p.ehConstante());
    }
    
    @Test(timeout = 1000)
    public void grauMaior0 () {
        Complexo[] coefs= new ComplexoConcreto[4];
        coefs[0] = new ComplexoConcreto(1,1);
        coefs[1] = coefs[0];
        coefs[2] = coefs[0];
        coefs[3] = coefs[0];
        p = new PolinomioVetor (coefs);
        assertTrue(!p.ehConstante());
    }
    
}
