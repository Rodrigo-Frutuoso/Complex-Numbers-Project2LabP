package project;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Executa testes quase unitarios aos metodos das classes ComplexoConcreto e PolinomioVetor
 * 
 * @author Docentes de LabP
 */
public class RunProject2 {

	/**
	 * Inicia a execucao dos testes
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		new RunProject2().execute();
	}

	/**
	 * Executa os testes
	 * 
	 * @throws FileNotFoundException
	 */
	private void execute() throws FileNotFoundException {
		PrintWriter writer = new PrintWriter("./out/output.txt");
		
		writer.println("--- testes de ComplexoConcreto ---");
		writer.println("--- construtor e getters de ComplexoConcreto ---");
		Complexo complexo1 = new ComplexoConcreto(1.2, -5.3);
		writer.println(complexo1.re());
		writer.println(complexo1.im());
		writer.println(complexo1.rho());
		writer.println(complexo1.theta());
		writer.println(complexo1.norma());
		
		writer.println("--- operacoes aritmeticas e toString de ComplexoConcreto ---");
		Complexo complexo2 = new ComplexoConcreto(0.3, 4);
		double expoente = 3.1;
		writer.println(complexo1.soma(complexo2));
		writer.println(complexo1.produto(complexo2));
		writer.println(complexo1.potencia(expoente));
		writer.println(complexo1.quociente(complexo2));
		writer.println(complexo1.conjugado());
		
		writer.println("--- toString de ComplexoConcreto, com complexos pequenos ---");
		writer.println(new ComplexoConcreto(Complexo.getErro() - Complexo.getErro() / 10, 
				                            Complexo.getErro() - Complexo.getErro() / 10));
		writer.println(new ComplexoConcreto(Complexo.getErro() - Complexo.getErro() / 10, 1));
		writer.println(new ComplexoConcreto(1, Complexo.getErro() - Complexo.getErro() / 10));
		
		writer.println("--- comparacoes de ComplexoConcreto ---");
		Complexo complexoReal = new ComplexoConcreto(7, Complexo.getErro() - Complexo.getErro() / 10);
		writer.println(complexoReal.ehReal());
		writer.println(complexoReal.ehReal(Complexo.getErro()));
		Complexo complexoIrreal = new ComplexoConcreto(7, Complexo.getErro() + Complexo.getErro() / 10);
		writer.println(complexoIrreal.ehReal());
		writer.println(complexoIrreal.ehReal(Complexo.getErro()));
		Complexo complexoZero = new ComplexoConcreto(-Complexo.getErro() + Complexo.getErro() / 10,
	                                                 Complexo.getErro() - Complexo.getErro() / 10);
		writer.println(complexoZero.ehZero());
		writer.println(complexoZero.ehZero(Complexo.getErro()));
		Complexo complexoNaoZero = new ComplexoConcreto(-Complexo.getErro() - Complexo.getErro() / 10,
                                                         Complexo.getErro() + Complexo.getErro() / 10);
        writer.println(complexoNaoZero.ehZero());
        writer.println(complexoNaoZero.ehZero(Complexo.getErro()));
        Complexo complexoIgualA1 = new ComplexoConcreto(1.2 - Complexo.getErro() + Complexo.getErro() / 10,
                                                        -5.3 + Complexo.getErro() - Complexo.getErro() / 10);
        writer.println(complexo1.ehIgual(complexoIgualA1));
        writer.println(complexo1.ehIgual(complexoIgualA1, Complexo.getErro()));
        Complexo complexoNaoIgualA1 = new ComplexoConcreto(1.2 - Complexo.getErro() - Complexo.getErro() / 10,
                                                           -5.3 + Complexo.getErro() + Complexo.getErro() / 10);
        writer.println(complexo1.ehIgual(complexoNaoIgualA1));
        writer.println(complexo1.ehIgual(complexoNaoIgualA1, Complexo.getErro()));

        writer.println("--- representacao trigonometrica de ComplexoConcreto ---");
        writer.println(complexo1.repTrigonometrica());
        
        writer.println();
        writer.println("--- testes de PolinomioVetor ---");
		writer.println("--- construtor, getters e toString de PolinomioVetor ---");
		Complexo[] coefsP1 = new ComplexoConcreto[3];
        coefsP1[0] = new ComplexoConcreto(2, 1);
        coefsP1[1] = new ComplexoConcreto(1, -1);
        coefsP1[2] = new ComplexoConcreto(-3.7, -5.2);
        Polinomio polinomio1 = new PolinomioVetor(coefsP1);
        writer.println(polinomio1.grau());
        writer.println(polinomio1.coef(1));
        writer.println(polinomio1);
        
        writer.println("--- grau e toString de PolinomioVetor, exemplos do enunciado ---");
        Complexo[] coefsPoliEnunciado = new ComplexoConcreto[5];
        coefsPoliEnunciado[0] = new ComplexoConcreto(0, 4);
        coefsPoliEnunciado[1] = new ComplexoConcreto(1, 0);
        coefsPoliEnunciado[2] = new ComplexoConcreto(0, 0);
        coefsPoliEnunciado[3] = new ComplexoConcreto(-1, -1);
        coefsPoliEnunciado[4] = new ComplexoConcreto(3, 0);
        Polinomio polinomioEnunciado = new PolinomioVetor(coefsPoliEnunciado);
        writer.println(polinomioEnunciado.grau());
        writer.println(polinomioEnunciado);
        ComplexoConcreto[] coefsMuiPequenos =  // vetor de coeficientes com 1 elemento, que eh um complexo pequeno
        	new ComplexoConcreto[] {new ComplexoConcreto(Complexo.getErro() - Complexo.getErro() / 10, 
                                                         Complexo.getErro() - Complexo.getErro() / 10)};
        Polinomio polinomioMuiPequeno = new PolinomioVetor(coefsMuiPequenos);
        writer.println(polinomioMuiPequeno);
        
        writer.println("--- operacoes aritmeticas, toString e avaliacao de PolinomioVetor ---");
        writer.println(polinomio1.escalar(new ComplexoConcreto(2, 3)));
        writer.println(polinomio1.simetrico());
        Complexo[] coefsP2 = new ComplexoConcreto[2];
        coefsP2[0] = new ComplexoConcreto(-4.7, 2);
        coefsP2[1] = new ComplexoConcreto(10, 0);
        Polinomio polinomio2 = new PolinomioVetor(coefsP2);
        writer.println(polinomio1.soma(polinomio2));
        writer.println(polinomio1.subtraccao(polinomio2));
        writer.println(polinomio1.subtraccao(polinomio1)); // polinomio zero
        writer.println(polinomio1.produto(polinomio2));
        writer.println(polinomio1.avalia(new ComplexoConcreto(-2, 2)));
        
        writer.println("--- derivadas de PolinomioVetor ---");
        // polinomio nao constante
        writer.println("antes de derivar:");
        writer.println(polinomioEnunciado);
        writer.println("apos derivar:");
        writer.println(polinomioEnunciado.derivada());
       // polinomio constante
        Complexo[] coefsConstante = new ComplexoConcreto[1];
        coefsConstante[0] = new ComplexoConcreto(3.2, -2.1);
        Polinomio polinomioConstante = new PolinomioVetor(coefsConstante);
        writer.println("antes de derivar:");
        writer.println(polinomioConstante);
        writer.println("apos derivar:");
        writer.println(polinomioConstante.derivada());
        
        writer.println("--- comparacoes de PolinomioVetor ---");
        Complexo[] coefsPZero = new ComplexoConcreto[1];
        coefsPZero[0] = new ComplexoConcreto(0, Complexo.getErro() - Complexo.getErro() / 10);
        Polinomio polinomioZero = new PolinomioVetor(coefsPZero);
        writer.println(polinomioZero.ehZero());
        writer.println(polinomioZero.ehZero(Complexo.getErro()));
        Complexo[] coefsPNaoZero = new ComplexoConcreto[1];
        coefsPNaoZero[0] = new ComplexoConcreto(0, Complexo.getErro() + Complexo.getErro() / 10);
        Polinomio polinomioNaoZero = new PolinomioVetor(coefsPNaoZero);
        writer.println(polinomioNaoZero.ehZero());
        writer.println(polinomioNaoZero.ehZero(Complexo.getErro()));
        writer.println(polinomioNaoZero.ehConstante());
        // alterando um pouco um dos coeficientes de polinomio1; mantem-se "igual"
        coefsP1[2] = new ComplexoConcreto(-3.7, -5.2 + Complexo.getErro() - Complexo.getErro() / 10);
        Polinomio polinomioIgualAP1 = new PolinomioVetor(coefsP1);
        writer.println(polinomio1.ehIgual(polinomioIgualAP1));
        writer.println(polinomio1.ehIgual(polinomioIgualAP1, Complexo.getErro()));
        // alterando um pouco mais um dos coeficientes de polinomio1; deixa de ser "igual"
        coefsP1[2] = new ComplexoConcreto(-3.7, -5.2 + Complexo.getErro() + Complexo.getErro() / 10);
        Polinomio polinomioNaoIgualAP1 = new PolinomioVetor(coefsP1);
        writer.println(polinomio1.ehIgual(polinomioNaoIgualAP1));
        writer.println(polinomio1.ehIgual(polinomioNaoIgualAP1, Complexo.getErro()));
        
        writer.println("--- copia de PolinomioVetor ---");
        writer.println(polinomio1);
        writer.println(polinomio1.copia());
        writer.println(polinomio1 == polinomio1.copia()); // false (objectos diferentes)
        
		writer.close();
	};
}
