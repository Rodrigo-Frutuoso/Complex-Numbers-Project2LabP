package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;
import project.Polinomio;
import project.PolinomioVetor;

public class PolinomioTestesSoma {

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
        coefs[0] = new ComplexoConcreto(6,4);
        esperado = new PolinomioVetor (coefs);
        obtido = p1.soma(p2);
        assertTrue(esperado.ehIgual(obtido));
    }
    
    @Test(timeout = 1000)
    public void AmbosGrau1 () {
        Complexo[] coefs= new ComplexoConcreto[2];
        coefs[0] = new ComplexoConcreto(3,2);
        coefs[1] = new ComplexoConcreto(3,2);
        p1 = new PolinomioVetor (coefs);
        p2 = new PolinomioVetor (coefs);
        coefs[0] = new ComplexoConcreto(6,4);
        coefs[1] = new ComplexoConcreto(6,4);
        esperado = new PolinomioVetor (coefs);
        obtido = p1.soma(p2);
        assertTrue(esperado.ehIgual(obtido));
    }
    
    @Test(timeout = 1000)
    public void AmbosGrauMaior1 () {
        Complexo[] coefs= new ComplexoConcreto[3];
        
        coefs[0] = new ComplexoConcreto(3,2);
        coefs[1] = new ComplexoConcreto(3,2);
        coefs[2] = new ComplexoConcreto(1,1);
        p1 = new PolinomioVetor (coefs);
        
        coefs[0] = new ComplexoConcreto(-1,-2);
        coefs[1] = new ComplexoConcreto(1,-3);
        coefs[2] = new ComplexoConcreto(-1,1);
        p2 = new PolinomioVetor (coefs);
        
        coefs[0] = new ComplexoConcreto(2,0);
        coefs[1] = new ComplexoConcreto(4,-1);
        coefs[2] = new ComplexoConcreto(0,2);
        esperado = new PolinomioVetor (coefs);
        obtido = p1.soma(p2);
        assertTrue(esperado.ehIgual(obtido));
    }
    
    @Test(timeout = 1000)
    public void ambosGrauMaior1Diferentes () {
        Complexo[] coefs= new ComplexoConcreto[3];
        
        coefs[0] = new ComplexoConcreto(1,1);
        coefs[1] = new ComplexoConcreto(1,1);
        coefs[2] = new ComplexoConcreto(1,1);
        p1 = new PolinomioVetor (coefs);
        
        coefs= new ComplexoConcreto[4];
        coefs[0] = new ComplexoConcreto(1,1);
        coefs[1] = new ComplexoConcreto(1,1);
        coefs[2] = new ComplexoConcreto(1,1);
        coefs[3] = new ComplexoConcreto(1,1);
        
        p2 = new PolinomioVetor (coefs);
        coefs[0] = new ComplexoConcreto(2,2);
        coefs[1] = new ComplexoConcreto(2,2);
        coefs[2] = new ComplexoConcreto(2,2);
        coefs[3] = new ComplexoConcreto(1,1);
        esperado = new PolinomioVetor (coefs);
        obtido = p1.soma(p2);
        assertTrue(esperado.ehIgual(obtido));
    }
    
    
    @Test(timeout = 1000)
    public void outroAmbosGrauMaior1Diferentes () {
        Complexo[] coefs= new ComplexoConcreto[3];
        
        coefs[0] = new ComplexoConcreto(1,1);
        coefs[1] = new ComplexoConcreto(1,1);
        coefs[2] = new ComplexoConcreto(1,1);
        p1 = new PolinomioVetor (coefs);
        
        coefs= new ComplexoConcreto[4];
        coefs[0] = new ComplexoConcreto(-1,-1);
        coefs[1] = new ComplexoConcreto(-1,-1);
        coefs[2] = new ComplexoConcreto(-1,-1);
        coefs[3] = new ComplexoConcreto(1,1);
        
        p2 = new PolinomioVetor (coefs);
        coefs[0] = new ComplexoConcreto(0,0);
        coefs[1] = new ComplexoConcreto(0,0);
        coefs[2] = new ComplexoConcreto(0,0);
        coefs[3] = new ComplexoConcreto(1,1);
        esperado = new PolinomioVetor (coefs);
        obtido = p2.soma(p1);
        assertTrue(esperado.ehIgual(obtido));
    }
}
