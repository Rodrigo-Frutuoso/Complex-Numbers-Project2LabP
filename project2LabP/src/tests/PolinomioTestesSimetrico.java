package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;
import project.Polinomio;
import project.PolinomioVetor;

public class PolinomioTestesSimetrico {

    private Polinomio p1;
    private Polinomio esperado;
    private Polinomio obtido;

    @Test(timeout = 1000)
    public void grau0 () {
        Complexo[] coefs= new ComplexoConcreto[1];
        coefs[0] = new ComplexoConcreto(3,2);
        p1 = new PolinomioVetor (coefs);
        coefs[0] = new ComplexoConcreto(-3,-2);
        esperado = new PolinomioVetor (coefs);
        obtido = p1.simetrico();

        assertTrue(esperado.ehIgual(obtido));
    }
    
    @Test(timeout = 1000)
    public void grau1 () {
        Complexo[] coefs= new ComplexoConcreto[2];
        coefs[0] = new ComplexoConcreto(3,2);
        coefs[1] = new ComplexoConcreto(3,2);
        p1 = new PolinomioVetor (coefs);
        
        coefs[0] = new ComplexoConcreto(-3,-2);
        coefs[1] = new ComplexoConcreto(-3,-2);
        esperado = new PolinomioVetor (coefs);
        obtido = p1.simetrico();
       
        assertTrue(esperado.ehIgual(obtido));
    }
    
    @Test(timeout = 1000)
    public void grauMaior1 () {
        Complexo[] coefs= new ComplexoConcreto[3];
        
        coefs[0] = new ComplexoConcreto(3,2);
        coefs[1] = new ComplexoConcreto(0,1);
        coefs[2] = new ComplexoConcreto(1,1);
        p1 = new PolinomioVetor (coefs);
        
        coefs[0] = new ComplexoConcreto(-3,-2);
        coefs[1] = new ComplexoConcreto(0,-1);
        coefs[2] = new ComplexoConcreto(-1,-1);
        
        esperado = new PolinomioVetor (coefs);
        obtido = p1.simetrico();
        assertTrue(esperado.ehIgual(obtido));
    }
    
}
