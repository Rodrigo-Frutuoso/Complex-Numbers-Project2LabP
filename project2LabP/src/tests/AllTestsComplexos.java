package tests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        ComplexoTestConjugado.class,
        ComplexoTestEhIgual.class,
        ComplexoTestEhReal.class,
        ComplexoTestEhZero.class,
        ComplexoTestIm.class,
        ComplexoTestNorma.class,
        ComplexoTestPotencia.class,
        ComplexoTestProduto.class,
        ComplexoTestQuociente.class,
        ComplexoTestRe.class,
        ComplexoTestRho.class,
        ComplexoTestSoma.class,
        ComplexoTestThetha.class,
        ComplexoTestToString.class,
        ComplexoTestTrignometrico.class
        })

public class AllTestsComplexos {

}