package project;

/**
 * @author Rodrigo Frutuoso 61865
 *
 *         Esta classe imutável deve implementar o interface Complexo.java.
 *         Guarda um número complexo na forma a + bi e na forma r cis t.
 */
public class ComplexoConcreto implements Complexo {
	private final double[] complexo = new double[2];

	/**
	 * Constrói um novo complexo dadas a parte real e a parte imaginária
	 * 
	 * @param re parte real de um numero complexo
	 * @param im parte imaginaria de um numero complexo
	 */
	public ComplexoConcreto(double re, double im) {
		this.complexo[0] = re;
		this.complexo[1] = im;
	}

	@Override
	public double re() {
		return complexo[0];
	}

	@Override
	public double im() {
		return complexo[1];
	}

	@Override
	public double rho() {
		return Math.hypot(re(), im());
	}

	@Override
	public double theta() {
		return Math.atan2(im(), re());
	}

	@Override
	public double norma() {
		return rho();
	}

	@Override
	public Complexo soma(Complexo outro) {
		return new ComplexoConcreto(re() + outro.re(), im() + outro.im());
	}

	public Complexo subtracao(Complexo outro) {
		return new ComplexoConcreto(re() - outro.re(), im() - outro.im());
	}

	@Override
	public Complexo produto(Complexo outro) {
		double real = re() * outro.re() - im() * outro.im();
		double imag = re() * outro.im() + im() * outro.re();
		return new ComplexoConcreto(real, imag);
	}

	@Override
	public Complexo potencia(double x) {
		double r = Math.pow(rho(), x);
		double t = theta() * x;
		return new ComplexoConcreto(r * Math.cos(t), r * Math.sin(t));
	}

	@Override
	public Complexo quociente(Complexo outro) {
		double denom = Math.pow(outro.re(), 2) + Math.pow(outro.im(), 2);
		double real = (re() * outro.re() + im() * outro.im()) / denom;
		double imag = (im() * outro.re() - re() * outro.im()) / denom;
		return new ComplexoConcreto(real, imag);
	}

	@Override
	public Complexo conjugado() {
		return new ComplexoConcreto(re(), -im());
	}

	@Override
	public boolean ehReal() {
		return Math.abs(im()) < ERRO;
	}

	@Override
	public boolean ehReal(double erro) {
		return Math.abs(im()) <= erro;
	}

	@Override
	public boolean ehZero() {
		return Math.abs(re()) <= ERRO && Math.abs(im()) <= ERRO;
	}

	@Override
	public boolean ehZero(double erro) {
		return Math.abs(re()) <= erro && Math.abs(im()) <= erro;
	}

	@Override
	public boolean ehIgual(Complexo outro) {
		return Math.abs(re() - outro.re()) <= ERRO && Math.abs(im() - outro.im()) <= ERRO;
	}

	@Override
	public boolean ehIgual(Complexo outro, double erro) {
		return Math.abs(re() - outro.re()) <= erro && Math.abs(im() - outro.im()) <= erro;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		if (ehZero()) {// quando ambos são 0.0
			return "0.0";
		}

		if (Math.abs(im()) < ERRO) { // im é muito pequeno
			sb.append(re() >= 0 ? re() : "- " + (-re()));
		} else if (Math.abs(re()) < ERRO) { // re é muito pequeno
			sb.append(im() >= 0 ? im() + "i" : "- " + (-im()) + "i");
		} else if (re() == 0.0) { // só tem imaginaro
			sb.append(im() < 0 ? "- " + (-im()) + "i" : im() + "i");
		} else if (ehReal()) { // só tem real
			sb.append(re() < 0 ? "- " + (-re()) : re());
		} else if (re() < 0 && im() < 0) { // ambos negativos
			sb.append("- " + (-re()) + " - " + (-im()) + "i");
		} else if (re() > 0 && im() < 0) {// real posi e imag nega
			sb.append(re() + " - " + (-im()) + "i");
		} else if (re() < 0 && im() > 0) {// real nega e imag posi
			sb.append("- " + (-re()) + " + " + im() + "i");
		} else {// os dois positivos
			sb.append(re() + " + " + im() + "i");
		}

		return sb.toString();
	}

	@Override
	public String repTrigonometrica() {
		return rho() + " cis (" + theta() + ")";
	}
}