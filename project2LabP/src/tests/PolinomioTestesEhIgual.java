package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;
import project.Polinomio;
import project.PolinomioVetor;

public class PolinomioTestesEhIgual {

    private Polinomio p1;
    private Polinomio p2;

    @Test(timeout = 1000)
    public void grau0Igual () {
        Complexo[] coefs= new ComplexoConcreto[1];
        coefs[0] = new ComplexoConcreto(3,2);
        p1 = new PolinomioVetor (coefs);
        p2 = new PolinomioVetor (coefs);
        assertTrue(p1.ehIgual(p2));
    }
    
    @Test(timeout = 1000)
    public void grau0Equivalente () {
        Complexo[] coefs= new ComplexoConcreto[1];
        coefs[0] = new ComplexoConcreto(3,2);
        p1 = new PolinomioVetor (coefs);
        coefs[0] = new ComplexoConcreto(6,4);
        p2 = new PolinomioVetor (coefs);
        assertFalse(p1.ehIgual(p2));
    }
  
    @Test(timeout = 1000)
    public void grau0NaoIgual () {
        Complexo[] coefs= new ComplexoConcreto[1];
        coefs[0] = new ComplexoConcreto(3,2);
        p1 = new PolinomioVetor (coefs);
        coefs[0] = new ComplexoConcreto(6,5);
        p2 = new PolinomioVetor (coefs);
        assertFalse(p1.ehIgual(p2));
    }
    
    
    @Test(timeout = 1000)
    public void grau1Igual () {
        Complexo[] coefs= new ComplexoConcreto[2];
        coefs[0] = new ComplexoConcreto(3,2);
        coefs[1] = new ComplexoConcreto(1,1);
        p1 = new PolinomioVetor (coefs);
        p2 = new PolinomioVetor (coefs);
        assertTrue(p1.ehIgual(p2));
    }
    
    @Test(timeout = 1000) // usa erro do TDA Complexo por omissao
    public void grauMaior1IguaisErroDefault () {
        Complexo[] coefs= new ComplexoConcreto[3];
        coefs[0] = new ComplexoConcreto(3, 2);
        coefs[1] = new ComplexoConcreto(0, 0);
        coefs[2] = new ComplexoConcreto(1, 1);
        p1 = new PolinomioVetor (coefs);
        coefs[0] = new ComplexoConcreto(3, 2 + Complexo.getErro() - Complexo.getErro() / 10);
        coefs[1] = new ComplexoConcreto(0, 0);
        coefs[2] = new ComplexoConcreto(1, 1 + Complexo.getErro() - Complexo.getErro() / 10);
        p2 = new PolinomioVetor (coefs);
        assertTrue(p1.ehIgual(p2));
    }
    
    @Test(timeout = 1000)  // usa parametro erro na comparacao
    public void grauMaior1IguaisErroPassado () {
        Complexo[] coefs= new ComplexoConcreto[3];
        coefs[0] = new ComplexoConcreto(3, 2);
        coefs[1] = new ComplexoConcreto(0, 0);
        coefs[2] = new ComplexoConcreto(1, 1);
        p1 = new PolinomioVetor (coefs);
        coefs[0] = new ComplexoConcreto(3, 2 + Complexo.getErro() - Complexo.getErro() / 10);
        coefs[1] = new ComplexoConcreto(0, 0);
        coefs[2] = new ComplexoConcreto(1, 1 + Complexo.getErro() - Complexo.getErro() / 10);
        p2 = new PolinomioVetor (coefs);
        assertTrue(p1.ehIgual(p2, Complexo.getErro()));
    }
  
    @Test(timeout = 1000)
    public void grau1NaoIguais () {
        Complexo[] coefs= new ComplexoConcreto[2];
        coefs[0] = new ComplexoConcreto(3, 2);
        coefs[1] = new ComplexoConcreto(3, 2);
        p1 = new PolinomioVetor (coefs);
        coefs[0] = new ComplexoConcreto(6, 5);
        coefs[1] = new ComplexoConcreto(3, 2);
        p2 = new PolinomioVetor (coefs);
        assertFalse(p1.ehIgual(p2));
    }
    
    @Test(timeout = 1000) // usa erro do TDA Complexo por omissao
    public void grau1NaoIguaisPorPoucoErroDefault () {
        Complexo[] coefs= new ComplexoConcreto[2];
        coefs[0] = new ComplexoConcreto(3, 2);
        coefs[1] = new ComplexoConcreto(6, 5);
        p1 = new PolinomioVetor (coefs);
        coefs[0] = new ComplexoConcreto(3, 2 + Complexo.getErro() + Complexo.getErro() / 10);
        coefs[1] = new ComplexoConcreto(6, 5);
        p2 = new PolinomioVetor (coefs);
        assertFalse(p1.ehIgual(p2));
    }
    
    @Test(timeout = 1000) // usa parametro erro na comparacao
    public void grau1NaoIguaisPorPoucoErroPassado () {
        Complexo[] coefs= new ComplexoConcreto[2];
        coefs[0] = new ComplexoConcreto(3, 2);
        coefs[1] = new ComplexoConcreto(6, 5);
        p1 = new PolinomioVetor (coefs);
        coefs[0] = new ComplexoConcreto(3, 2 + Complexo.getErro() + Complexo.getErro() / 10);
        coefs[1] = new ComplexoConcreto(6, 5);
        p2 = new PolinomioVetor (coefs);
        assertFalse(p1.ehIgual(p2, Complexo.getErro()));
    }
    
}
