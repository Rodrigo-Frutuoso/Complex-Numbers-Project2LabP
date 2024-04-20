package project;

import java.util.Arrays;

/**
 * @author Rodrigo Frutuoso 61865
 *
 *         Esta classe imutável deve implementar o interface Polinomio.java.
 *         Representa e manipula polinómios com coeficientes que são complexos
 *         de modo a que cada polinómio seja representado por um vetor com o
 *         tamanho apropriado para o grau do polinómio.
 */
public class PolinomioVetor implements Polinomio {
	private final Complexo[] coefs;

	/**
	 * Constrói um novo polinómio com os coeficientes dados.
	 * 
	 * @param coefs array com os coeficientes do polinomio
	 */
	public PolinomioVetor(Complexo[] coefs) {
		this.coefs = Arrays.copyOf(coefs, coefs.length);
	}

	@Override
	public int grau() {
		return coefs.length - 1;
	}

	@Override
	public Complexo coef(int i) {
		return coefs[i];
	}

	@Override
	public boolean ehZero() {
		return grau() == 0 && coefs[0].ehZero();
	}

	@Override
	public boolean ehZero(double erro) {
		return grau() == 0 && coefs[0].ehZero(erro);
	}

	@Override
	public boolean ehConstante() {
		return grau() == 0;

	}

	@Override
	public Polinomio escalar(Complexo f) {
		// cria um novo vetor para o novo polinomio
		Complexo[] novosCoefs = new Complexo[coefs.length];
		// multiplica cada coeficiente do polinómio pelo o Complexo f
		for (int i = 0; i < coefs.length; i++) {
			novosCoefs[i] = coefs[i].produto(f);
		}
		return new PolinomioVetor(novosCoefs);
	}

	@Override
	public Polinomio simetrico() {
		// cria um novo vetor para o novo polinomio
		Complexo[] novosCoefs = new Complexo[coefs.length];
		// multiplica cada coeficiente do polinómio por "-1" (ComplexoConcreto(-1, 0))
		for (int i = 0; i < coefs.length; i++) {
			novosCoefs[i] = coefs[i].produto(new ComplexoConcreto(-1, 0));
		}
		return new PolinomioVetor(novosCoefs);
	}

	@Override
	public Polinomio soma(Polinomio p) {
		// calcula o maior grau dos dois polinomios
		int maxGrau = Math.max(grau(), p.grau());
		// cria um array para o novo polinomio
		Complexo[] novosCoefs = new Complexo[maxGrau + 1];
		// for para realizar a soma
		for (int i = 0; i <= maxGrau; i++) {
			// guarda os coeficientes do grau atual de cada polinomio
			Complexo coefFirst = (i <= grau()) ? coef(i) : new ComplexoConcreto(0, 0);
			Complexo coefSecond = (i <= p.grau()) ? p.coef(i) : new ComplexoConcreto(0, 0);
			// soma os dois graus
			novosCoefs[i] = coefFirst.soma(coefSecond);
		}
		return new PolinomioVetor(novosCoefs);
	}

	@Override
	public Polinomio subtraccao(Polinomio p) {
		// faço o simétrico para a utilizar a soma
		return soma(p.simetrico());
	}

	@Override
	public Polinomio produto(Polinomio p) {
		// novo grau do produto
		int novoGrau = grau() + p.grau();
		// cria um vetor com esse novo grau
		Complexo[] novoCoef = new Complexo[novoGrau + 1];

		// cada casinha do array fica a "zeros"
		for (int i = 0; i <= novoGrau; i++) {
			novoCoef[i] = new ComplexoConcreto(0, 0);
		}

		// for para calcular o produto dos coeficientes
		for (int i = 0; i <= grau(); i++) {
			for (int j = 0; j <= p.grau(); j++) {
				novoCoef[i + j] = novoCoef[i+j].soma(coef(i).produto(p.coef(j)));
			}
		}

		// conta quantos coeficientes são zero no final
		int grauFinal = novoGrau;
		while (grauFinal > 0 && novoCoef[grauFinal].ehZero()) {
			grauFinal--;
		}

		// devolve o vetor do produto sem zeros
		return new PolinomioVetor(Arrays.copyOf(novoCoef, grauFinal + 1));
	}

	@Override
	public Complexo avalia(Complexo x) {
		Complexo resultado = new ComplexoConcreto(0, 0);
		//calcula o valor do polinómio
		for (int i = 0; i <= grau(); i++) {
			resultado = resultado.soma(coef(i).produto(x.potencia(i)));
		}
		return resultado;
	}

	@Override
	public Polinomio derivada() {
		// se for um numero constante, retorna 0
		if (ehConstante()) {
			return new PolinomioVetor(new Complexo[] { new ComplexoConcreto(0, 0) });
		}
		// quando não é constante, cria um novo vetor para os coeficientes
		Complexo[] novosCoefs = new Complexo[grau()];
		// for para calcular a deriavada dos coeficientes
		for (int i = 0; i < novosCoefs.length; i++) {
			novosCoefs[i] = coef(i + 1).produto(new ComplexoConcreto(i + 1, 0));
		}
		return new PolinomioVetor(novosCoefs);
	}

	@Override
	public Polinomio copia() {
		return new PolinomioVetor(coefs);
	}

	@Override
	public boolean ehIgual(Polinomio p) {
		for (int i = 0; i <= this.grau(); i++) {
			if (!coef(i).ehIgual(p.coef(i))) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean ehIgual(Polinomio p, double erro) {
		for (int i = 0; i <= this.grau(); i++) {
			if (!coef(i).ehIgual(p.coef(i), erro)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Devolve uma representação textual do polinómio da seguinte forma: cn x n + …
	 * + c1 x + c0, em que ci é a representação do coeficiente do termo xi na forma
	 * trigonométrica.
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int i = grau(); i >= 0; i--) {
			if (!coef(i).ehZero()) {
				if (sb.length() > 0) { // assim adiciona o + sempre, mas nao na primeira vez
					sb.append(" + ");
				}
				sb.append(coef(i).repTrigonometrica());
				if (i > 0) {
					sb.append(" x");
					if (i > 1) {
						sb.append("^").append(i);
					}
				}
			}
		} // retorna o polinómio se true, se não retorna zero porque nao existe
		return sb.length() > 0 ? sb.toString() : "0.0";
	}
}