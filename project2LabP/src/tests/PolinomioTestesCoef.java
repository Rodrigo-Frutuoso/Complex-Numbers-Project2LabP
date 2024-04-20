package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import project.Complexo;
import project.ComplexoConcreto;
import project.Polinomio;
import project.PolinomioVetor;

public class PolinomioTestesCoef {

    @Test(timeout = 1000)
    public void coefsPolinomioGrau2 () {
    	Complexo[] coefsP1 = new ComplexoConcreto[3];
        coefsP1[0] = new ComplexoConcreto(1, 3.2);
        coefsP1[1] = new ComplexoConcreto(-5.1, 7.33);
        coefsP1[2] = new ComplexoConcreto(11.45, -8.034);
        Polinomio polinomio1 = new PolinomioVetor(coefsP1);
        assertEquals(polinomio1.coef(0).re(), 1, 0.00000001);
        assertEquals(polinomio1.coef(0).im(), 3.2, 0.00000001);
        assertEquals(polinomio1.coef(1).re(), -5.1, 0.00000001);
        assertEquals(polinomio1.coef(1).im(), 7.33, 0.00000001);
        assertEquals(polinomio1.coef(2).re(), 11.45 ,0.00000001);
        assertEquals(polinomio1.coef(2).im(), -8.034, 0.00000001);
    }

}
