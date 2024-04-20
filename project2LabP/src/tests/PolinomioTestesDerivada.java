package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;
import project.Polinomio;
import project.PolinomioVetor;

public class PolinomioTestesDerivada {

    private Polinomio antesDeDerivar;  // quando derivamos este polinomio
    private Polinomio aposDerivar;     // obtemos este?
    
    @Test(timeout = 1000)
    public void derivarPolinomioGrau4 () {  // exemplo do enunciado 2023-24
    	Complexo[] coefsPoliEnunciado = new ComplexoConcreto[5];
        coefsPoliEnunciado[0] = new ComplexoConcreto(0, 4);
        coefsPoliEnunciado[1] = new ComplexoConcreto(1, 0);
        coefsPoliEnunciado[2] = new ComplexoConcreto(0, 0);
        coefsPoliEnunciado[3] = new ComplexoConcreto(-1, -1);
        coefsPoliEnunciado[4] = new ComplexoConcreto(3, 0);
        antesDeDerivar = new PolinomioVetor (coefsPoliEnunciado);
        
        Complexo[] coefsPoliEnunciadoDeriv = new ComplexoConcreto[4];
        coefsPoliEnunciadoDeriv[0] = new ComplexoConcreto(1, 0);
        coefsPoliEnunciadoDeriv[1] = new ComplexoConcreto(0, 0);
        coefsPoliEnunciadoDeriv[2] = new ComplexoConcreto(-3, -3);
        coefsPoliEnunciadoDeriv[3] = new ComplexoConcreto(12, 0);
        aposDerivar = new PolinomioVetor (coefsPoliEnunciadoDeriv);
        
        assertTrue(aposDerivar.ehIgual(antesDeDerivar.derivada()));
    }
    
    @Test(timeout = 1000)
    public void derivarPolinomioConstante () {
    	Complexo[] coefsConstante = new ComplexoConcreto[1];
        coefsConstante[0] = new ComplexoConcreto(3.2, -2.1);
        antesDeDerivar = new PolinomioVetor(coefsConstante);
        aposDerivar = new PolinomioVetor(new ComplexoConcreto[]{new ComplexoConcreto(0, 0)});  // polinomio zero
        assertTrue(aposDerivar.ehIgual(antesDeDerivar.derivada()));
    }
}
