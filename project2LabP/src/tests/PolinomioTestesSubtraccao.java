package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;
import project.Polinomio;
import project.PolinomioVetor;

public class PolinomioTestesSubtraccao {

    private Polinomio p1;
    private Polinomio p2;
    private Polinomio esperado;
    private Polinomio obtido;

    @Test(timeout = 1000)
    public void AmbosGrau0 () {
        Complexo[] coefs= new ComplexoConcreto[1];
        coefs[0] = new ComplexoConcreto(3,2);
        p1 = new PolinomioVetor (coefs);
        p2 = new PolinomioVetor (coefs);
        coefs[0] = new ComplexoConcreto(0,0);
        esperado = new PolinomioVetor (coefs);
        obtido = p1.subtraccao(p2);
        assertTrue(esperado.ehIgual(obtido));
    }
    
    @Test(timeout = 1000)
    public void AmbosGrau0Diferentes () {
        Complexo[] coefs= new ComplexoConcreto[1];
        coefs[0] = new ComplexoConcreto(3,2);
        p1 = new PolinomioVetor (coefs);
        
        coefs[0] = new ComplexoConcreto(1,2);
        p2 = new PolinomioVetor (coefs);
        
        coefs[0] = new ComplexoConcreto(2,0);
        esperado = new PolinomioVetor (coefs);
        obtido = p1.subtraccao(p2);
        assertTrue(esperado.ehIgual(obtido));
    }
    
    @Test(timeout = 1000)
    public void AmbosGrau1Iguais () {
        Complexo[] coefs= new ComplexoConcreto[2];
        coefs[0] = new ComplexoConcreto(3,2);
        coefs[1] = new ComplexoConcreto(3,2);
        p1 = new PolinomioVetor (coefs);

        p2 = new PolinomioVetor (coefs);
        coefs[0] = new ComplexoConcreto(3,1);
        coefs[1] = new ComplexoConcreto(3,2);

        coefs= new ComplexoConcreto[1];
        coefs[0] = new ComplexoConcreto(0,0);
        esperado = new PolinomioVetor (coefs);
        obtido = p1.subtraccao(p2);

        assertTrue(esperado.ehIgual(obtido));
    }
    
    @Test(timeout = 1000)
    public void AmbosGrau1Diferentes () {
        Complexo[] coefs= new ComplexoConcreto[2];
        coefs[0] = new ComplexoConcreto(3,2);
        coefs[1] = new ComplexoConcreto(3,2);
        p1 = new PolinomioVetor (coefs);
        
        coefs[0] = new ComplexoConcreto(1,2);
        coefs[1] = new ComplexoConcreto(0,1);
        p2 = new PolinomioVetor (coefs);
        

        coefs[0] = new ComplexoConcreto(2,0);
        coefs[1] = new ComplexoConcreto(3,1);
        esperado = new PolinomioVetor (coefs);
        obtido = p1.subtraccao(p2);
        assertTrue(esperado.ehIgual(obtido));
    }
    
    
    @Test(timeout = 1000)
    public void AmbosGrauMaior1Diferentes () {
        Complexo[] coefs= new ComplexoConcreto[3];
        coefs[0] = new ComplexoConcreto(2,1);
        coefs[1] = new ComplexoConcreto(2,1);
        coefs[2] = new ComplexoConcreto(1,1);
        p1 = new PolinomioVetor (coefs);

        coefs[0] = new ComplexoConcreto(0,1);
        coefs[1] = new ComplexoConcreto(0,1);
        coefs[2] = new ComplexoConcreto(1,1);
        p2 = new PolinomioVetor (coefs);

        coefs= new ComplexoConcreto[2];
        coefs[0] = new ComplexoConcreto(2,0);
        coefs[1] = new ComplexoConcreto(2,0);
        esperado = new PolinomioVetor (coefs);
        obtido = p1.subtraccao(p2);
        
        assertTrue(esperado.ehIgual(obtido));
    }
    
    
}
