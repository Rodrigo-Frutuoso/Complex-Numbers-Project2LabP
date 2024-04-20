package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;
import project.Polinomio;
import project.PolinomioVetor;

public class PolinomioTestesProduto {

    @Test(timeout = 1000)
    public void Grau2vezesGrau4 () {
    	Complexo[] coefsP1 = new ComplexoConcreto[3];
        coefsP1[0] = new ComplexoConcreto(1, 3.2);
        coefsP1[1] = new ComplexoConcreto(-5.1, 7.33);
        coefsP1[2] = new ComplexoConcreto(11.45, -8.034);
        Polinomio polinomio1 = new PolinomioVetor(coefsP1);
        
        Complexo[] coefsP2 = new ComplexoConcreto[5];
        coefsP2[0] = new ComplexoConcreto(0, 4);
        coefsP2[1] = new ComplexoConcreto(1, 0);
        coefsP2[2] = new ComplexoConcreto(0, 0);
        coefsP2[3] = new ComplexoConcreto(-1, -1);
        coefsP2[4] = new ComplexoConcreto(3, 0);
        Polinomio polinomio2 = new PolinomioVetor(coefsP2);
        
        Polinomio produtoP1P2 = polinomio1.produto(polinomio2);
        Polinomio produtoP2P1 = polinomio2.produto(polinomio1);

        assertEquals(produtoP1P2.grau(), 6);
        assertEquals(produtoP2P1.grau(), 6);
        
        assertEquals(produtoP1P2.coef(0).re(), -12.8, 0.000000001);       
        assertEquals(produtoP1P2.coef(0).im(), 4.0, 0.000000001);
        assertEquals(produtoP1P2.coef(1).re(), -28.32, 0.000000001);
        assertEquals(produtoP1P2.coef(1).im(), -17.2, 0.000000001);
        assertEquals(produtoP1P2.coef(2).re(), 27.036, 0.000000001);
        assertEquals(produtoP1P2.coef(2).im(), 53.129999999999995, 0.000000001);
        assertEquals(produtoP1P2.coef(3).re(), 13.649999999999999, 0.000000001);
        assertEquals(produtoP1P2.coef(3).im(), -12.234000000000002, 0.000000001);
        assertEquals(produtoP1P2.coef(4).re(), 15.43, 0.000000001);
        assertEquals(produtoP1P2.coef(4).im(), 7.370000000000001, 0.000000001);
        assertEquals(produtoP1P2.coef(5).re(), -34.784, 0.000000001);
        assertEquals(produtoP1P2.coef(5).im(), 18.574000000000005, 0.000000001);
        assertEquals(produtoP1P2.coef(6).re(), 34.349999999999994, 0.000000001);
        assertEquals(produtoP1P2.coef(6).im(), -24.102000000000004, 0.000000001);
        
        // testando a comutatitividade, mas evitando esta dependencia de ehIgual()
        // assertTrue(produtoP1P2.ehIgual(produtoP2P1, 0.000000001));
        assertEquals(produtoP2P1.coef(0).re(), -12.8, 0.000000001);       
        assertEquals(produtoP2P1.coef(0).im(), 4.0, 0.000000001);
        assertEquals(produtoP2P1.coef(1).re(), -28.32, 0.000000001);
        assertEquals(produtoP2P1.coef(1).im(), -17.2, 0.000000001);
        assertEquals(produtoP2P1.coef(2).re(), 27.036, 0.000000001);
        assertEquals(produtoP2P1.coef(2).im(), 53.129999999999995, 0.000000001);
        assertEquals(produtoP2P1.coef(3).re(), 13.649999999999999, 0.000000001);
        assertEquals(produtoP2P1.coef(3).im(), -12.234000000000002, 0.000000001);
        assertEquals(produtoP2P1.coef(4).re(), 15.43, 0.000000001);
        assertEquals(produtoP2P1.coef(4).im(), 7.370000000000001, 0.000000001);
        assertEquals(produtoP2P1.coef(5).re(), -34.784, 0.000000001);
        assertEquals(produtoP2P1.coef(5).im(), 18.574000000000005, 0.000000001);
        assertEquals(produtoP2P1.coef(6).re(), 34.349999999999994, 0.000000001);
        assertEquals(produtoP2P1.coef(6).im(), -24.102000000000004, 0.000000001);
    }
    
    @Test(timeout = 1000)
    public void Grau4vezesGrau0 () {
        Complexo[] coefsP2 = new ComplexoConcreto[5];
        coefsP2[0] = new ComplexoConcreto(0, 4);
        coefsP2[1] = new ComplexoConcreto(1, 0);
        coefsP2[2] = new ComplexoConcreto(0, 0);
        coefsP2[3] = new ComplexoConcreto(-1, -1);
        coefsP2[4] = new ComplexoConcreto(3, 0);
        Polinomio polinomio2 = new PolinomioVetor(coefsP2);
        
        Complexo[] constanteZero = new ComplexoConcreto[1];
		constanteZero[0] = new ComplexoConcreto(0,0);
		Polinomio polinomioZero = new PolinomioVetor(constanteZero);
        
        Polinomio produtoP2zero = polinomio2.produto(polinomioZero);
        Polinomio produtoZeroP2 = polinomioZero.produto(polinomio2);

        assertEquals(produtoP2zero.grau(), 0);
        assertEquals(produtoP2zero.grau(), 0);
        
        assertTrue(produtoP2zero.ehZero(0.00000001));  // dependencia de ehZero()
        assertTrue(produtoZeroP2.ehZero(0.00000001));  // dependencia de ehZero()  
    }
    
}
