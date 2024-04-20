package project;

/**
 * Especifica o TDA Polinomio de coeficientes complexos.
 * 
 * @author Docentes de LabP
 */
public interface Polinomio {
	/**
	 * Devolve o grau deste polinomio
	 * @return o grau deste polinomio
	 */
	int grau();
	/**
	 * Devolve o coeficiente de expoente i deste polinomio
	 * @return o coeficiente de expoente i deste polinomio
	 * @requires i <= grau()
	 */
	Complexo coef(int i);
	/**
	 * Eh o polinomio constante e igual a zero?
	 * Usa o valor do erro por omissao do TDA Complexo.
	 * @return true sse this == 0 a menos de delta (como polinomio)
	 */
	boolean ehZero();	
	/**
	 * Eh o polinomio constante e igual a zero?
	 * Usa um valor de erro passado pelo invocador do metodo.
	 * @param erro valor maximo do erro aceite
	 * @return true sse this == 0 a menos de delta (como polinomio)
	 * @requires erro > 0
	 */
	boolean ehZero(double erro);
	/**
	 * Eh o polinomio constante?
	 * @return true sse grau == 0
	 */
	boolean ehConstante();
	/**
	 * Devolve o polinomio que resulta de multiplicar este por uma constante
	 * @param f o escalar
	 * @return o polinomio correspondente a f * this
	 * @requires f != null
	 */
	Polinomio escalar(Complexo f);
	/**
	 * Devolve o polinomio simetrico deste polinomio
	 * @return -this
	 */
	Polinomio simetrico();
	/**
	 * Devolve o polinomio que eh a soma deste com outro
	 * @param p o polinomio a somar
	 * @return this + p
	 * @requires p != null
	 */
	Polinomio soma(Polinomio p);
	/**
	 * Devolve o polinomio que eh a diferenca deste com outro
	 * @param p o polinomio a subtrair
	 * @return this - p
	 * @requires p != null
	 */
	Polinomio subtraccao(Polinomio p);
	/**
	 * Devolve o polinomio que eh o produto deste por outro
	 * @param p o polinomio a multiplicar
	 * @return this * p
	 * @requires p != null
	 */
	Polinomio produto(Polinomio p);
	/**
	 * Avalia este polinomio num dado valor
	 * @param x o valor para avaliar o polinomio
	 * @return this(x)
	 * @requires x != null
	 */
	Complexo avalia(Complexo x);
	/**
	 * Devolve a derivada deste polinomio.
	 * Se este polinomio for constante, eh devolvido o polinomio zero.
	 * @return a derivada
	 */
	Polinomio derivada();
	/**
	 * Devolve uma copia deste polinomio
	 * @return uma copia do polinomio
	 */
	Polinomio copia();
	/**
	 * Verifica se este polinomio eh igual a um outro
	 * Usa o valor do erro por omissao do TDA Complexo.
	 * @param p o outro polinomio
	 * @return true sse os polinomios tem o mesmo grau e os respectivos coeficientes sao todos iguais a menos de delta
	 */
	boolean ehIgual(Polinomio p);
	/**
	 * Verifica se este polinomio eh igual a um outro
	 * Usa um valor de erro passado pelo invocador do metodo.
	 * @param p o outro polinomio
     * @param erro valor maximo do erro aceite
	 * @return true sse os polinomios tem o mesmo grau e os respectivos coeficientes sao todos iguais a menos de delta
	 * @requires erro > 0
	 */
	boolean ehIgual(Polinomio p, double erro);
}
