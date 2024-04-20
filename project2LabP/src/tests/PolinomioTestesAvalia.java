package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;
import project.Polinomio;
import project.PolinomioVetor;

public class PolinomioTestesAvalia {

    private Polinomio p1;
    private Complexo x;
    private Complexo esperado;

    @Test(timeout = 1000)
    public void grau0 () {
        Complexo[] coefs= new ComplexoConcreto[1];
        coefs[0] = new ComplexoConcreto(3,2);
        p1 = new PolinomioVetor (coefs);
        x = new ComplexoConcreto(1,0); 
        esperado = coefs[0];
        
        assertTrue(p1.avalia(x).ehIgual(esperado));
    }

    @Test(timeout = 1000)
    public void grau1 () {
        Complexo[] coefs= new ComplexoConcreto[2];
        coefs[0] = new ComplexoConcreto(1,1);
        coefs[1] = new ComplexoConcreto(1,1);
        p1 = new PolinomioVetor (coefs);
        x = new ComplexoConcreto(1,0);
        esperado = new ComplexoConcreto(2,2);
        assertTrue(p1.avalia(x).ehIgual(esperado));
    }


    @Test(timeout = 1000)
    public void grauMaior1 () {
        Complexo[] coefs= new ComplexoConcreto[3];
        coefs[0] = new ComplexoConcreto(2,1);
        coefs[1] = new ComplexoConcreto(1,-1);
        coefs[2] = new ComplexoConcreto(-1,-1);
        p1 = new PolinomioVetor (coefs);
        x = new ComplexoConcreto(1,1); 
        esperado = new ComplexoConcreto(6,-1);
        assertTrue(p1.avalia(x).ehIgual(esperado));
    }

}
