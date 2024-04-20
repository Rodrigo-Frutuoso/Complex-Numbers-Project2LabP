package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;
import project.Polinomio;
import project.PolinomioVetor;

public class PolinomioTestesEscalar {

    private Polinomio p1;
    private Polinomio esperado;
    private Polinomio obtido;

    @Test(timeout = 1000)
    public void grau0EEscalar0 () {
        Complexo[] coefs= new ComplexoConcreto[1];
        coefs[0] = new ComplexoConcreto(3,2);
        p1 = new PolinomioVetor (coefs);
        coefs[0] = new ComplexoConcreto(0,0);
        esperado = new PolinomioVetor (coefs);
        obtido = p1.escalar(new ComplexoConcreto(0,0));
        
        assertTrue(esperado.ehIgual(obtido));
    }

    @Test(timeout = 1000)
    public void grau0EEscalar1 () {
        Complexo[] coefs= new ComplexoConcreto[1];
        coefs[0] = new ComplexoConcreto(3,2);
        p1 = new PolinomioVetor (coefs);
        esperado = new PolinomioVetor (coefs);
        obtido = p1.escalar(new ComplexoConcreto(1,0));
        
        assertTrue(esperado.ehIgual(obtido));
    }    

    
    @Test(timeout = 1000)
    public void grau0EEscalarComplexo () {
        Complexo[] coefs= new ComplexoConcreto[1];
        coefs[0] = new ComplexoConcreto(3,2);
        p1 = new PolinomioVetor (coefs);
        coefs[0] = new ComplexoConcreto(-2,3);
        esperado = new PolinomioVetor (coefs);
        obtido = p1.escalar(new ComplexoConcreto(0,1));
        
        assertTrue(esperado.ehIgual(obtido));
    }   
    

    @Test(timeout = 1000)
    public void grau0EEscalarComplexoCompleto () {
        Complexo[] coefs= new ComplexoConcreto[1];
        coefs[0] = new ComplexoConcreto(3,2);
        p1 = new PolinomioVetor (coefs);
        coefs[0] = new ComplexoConcreto(-3,11);
        esperado = new PolinomioVetor (coefs);
        obtido = p1.escalar(new ComplexoConcreto(1,3));
      
        assertTrue(esperado.ehIgual(obtido));
    }   
    
    
    public void grau1EEscalar0 () {
        Complexo[] coefs= new ComplexoConcreto[2];
        coefs[0] = new ComplexoConcreto(3,2);
        coefs[1] = new ComplexoConcreto(1,2);
        p1 = new PolinomioVetor (coefs);
        coefs= new ComplexoConcreto[1];
        coefs[0] = new ComplexoConcreto(0,1);
        esperado = new PolinomioVetor (coefs);
        obtido = p1.escalar(new ComplexoConcreto(0,1));
        
        assertTrue(esperado.ehIgual(obtido));
    }

    @Test(timeout = 1000)
    public void grau1EEscalar1 () {
        Complexo[] coefs= new ComplexoConcreto[2];
        coefs[0] = new ComplexoConcreto(3,2);
        coefs[1] = new ComplexoConcreto(1,2);
        p1 = new PolinomioVetor (coefs);
        
        esperado = new PolinomioVetor (coefs);
        obtido = p1.escalar(new ComplexoConcreto(1,0));
        
        assertTrue(esperado.ehIgual(obtido));
    }    

    
    @Test(timeout = 1000)
    public void grau1EEscalarImaginario () {
        Complexo[] coefs= new ComplexoConcreto[2];
        coefs[0] = new ComplexoConcreto(3,2);
        coefs[1] = new ComplexoConcreto(1,2);
        p1 = new PolinomioVetor (coefs);
        
        coefs[0] = new ComplexoConcreto(-2,3);
        coefs[1] = new ComplexoConcreto(-2,1);
        esperado = new PolinomioVetor (coefs);
        obtido = p1.escalar(new ComplexoConcreto(0,1));
        
        assertTrue(esperado.ehIgual(obtido));
    }   
    
    @Test(timeout = 1000)
    public void grau1EEscalarReal () {
        Complexo[] coefs= new ComplexoConcreto[2];
        coefs[0] = new ComplexoConcreto(3,2);
        coefs[1] = new ComplexoConcreto(1,2);
        p1 = new PolinomioVetor (coefs);
        
        coefs[0] = new ComplexoConcreto(6,4);
        coefs[1] = new ComplexoConcreto(2,4);
        esperado = new PolinomioVetor (coefs);
        obtido = p1.escalar(new ComplexoConcreto(2,0));
        
        assertTrue(esperado.ehIgual(obtido));
    }    
    
    
    public void grauMaior1EEscalar0 () {
        Complexo[] coefs= new ComplexoConcreto[3];
        coefs[0] = new ComplexoConcreto(3,2);
        coefs[1] = new ComplexoConcreto(1,2);
        coefs[2] = new ComplexoConcreto(1,2);
        p1 = new PolinomioVetor (coefs);
        coefs= new ComplexoConcreto[1];
        coefs[0] = new ComplexoConcreto(0,0);
        esperado = new PolinomioVetor (coefs);
        obtido = p1.escalar(new ComplexoConcreto(0,0));
        
        assertTrue(esperado.ehIgual(obtido));
    }
    
    @Test(timeout = 1000)
    public void grauMaior1EEscalar1 () {
        Complexo[] coefs= new ComplexoConcreto[3];
        coefs[0] = new ComplexoConcreto(3,2);
        coefs[1] = new ComplexoConcreto(1,2);
        coefs[2] = new ComplexoConcreto(1,2);
        p1 = new PolinomioVetor (coefs);
        
        esperado = new PolinomioVetor (coefs);
        obtido = p1.escalar(new ComplexoConcreto(1,0));
        
        assertTrue(esperado.ehIgual(obtido));
    }    

    
    @Test(timeout = 1000)
    public void grauMaior1EEscalarCompleto () {
        Complexo[] coefs= new ComplexoConcreto[3];
        coefs[0] = new ComplexoConcreto(3,2);
        coefs[1] = new ComplexoConcreto(1,2);
        coefs[2] = new ComplexoConcreto(1,2);
        p1 = new PolinomioVetor (coefs);
        
        coefs[0] = new ComplexoConcreto(4,7);
        coefs[1] = new ComplexoConcreto(0,5);
        coefs[2] = new ComplexoConcreto(0,5);
        esperado = new PolinomioVetor (coefs);
        obtido = p1.escalar(new ComplexoConcreto(2,1));
       
        assertTrue(esperado.ehIgual(obtido));
    }   
    
    @Test(timeout = 1000)
    public void grauMaior1EEscalarComplexo2 () {
        Complexo[] coefs= new ComplexoConcreto[3];
        coefs[0] = new ComplexoConcreto(3,2);
        coefs[1] = new ComplexoConcreto(1,2);
        coefs[2] = new ComplexoConcreto(1,2);
        p1 = new PolinomioVetor (coefs);
        
        coefs[0] = new ComplexoConcreto(0.5,2.5);
        coefs[1] = new ComplexoConcreto(-.5,1.5);
        coefs[2] = new ComplexoConcreto(-0.5, 1.5);
        esperado = new PolinomioVetor (coefs);
        obtido = p1.escalar(new ComplexoConcreto(0.5,0.5));
        
        assertTrue(esperado.ehIgual(obtido));
    } 
    
}
