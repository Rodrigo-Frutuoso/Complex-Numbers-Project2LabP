package project;

/**
 * Especifica o TDA Complexo.
 * 
 * @author Docentes de LabP
 */
public interface Complexo {
    /**
     * Erro usado em comparacoes de igualdade envolvendo double
     */
	double ERRO = 0.00001;
    /**
     * Mostra o valor do erro usado em comparacoes de igualdade envolvendo double
     * @return constante ERRO em vigor neste TDA
     */
    static double getErro() {
    	return ERRO;
    }
    /**
     * Devolve a parte real do complexo
     * @return a parte real do complexo
     */
    double re();
    /**
     * Devolve a parte imaginaria do complexo
     * @return a parte imaginaria do complexo
     */
    double im();
    /**
     * Devolve o comprimento do complexo no plano de Argan
     * @return o mesmo que {@link #norma()}
     */
    double rho();
    /**
     * Devolve o angulo do complexo no plano de Argan
     * @return a angulo do complexo
     */
    double theta();
    /**
     * Devolve o comprimento do complexo no plano de Argan
     * @return a norma do complexo
     */
    double norma();

    /**
     * Devolve a soma deste complexo com outro
     * @param outro o outro complexo
     * @return o complexo que eh a soma deste complexo com outro
     * @requires outro != null
     */
    Complexo soma(Complexo outro);
    /**
     * Devolve o produto deste complexo com outro
     * @param outro o outro complexo
     * @return o complexo que eh o produto deste complexo com outro
     * @requires outro != null
     */
    Complexo produto(Complexo outro);
     /**
     * Calcula uma potencia deste complexo
     * @param x o expoente da potencia
     * @requires x >= 0
     * @return this^x
     */
    Complexo potencia(double x);
    /**
     * Devolve o quociente deste complexo com outro
     * @param outro o outro complexo
     * @return o complexo que eh o quociente deste com complexo com outro
     * @requires outro != null && !outro.ehZero()
     */
    Complexo quociente(Complexo outro);
    /**
     * Devolve o conjugado do complexo
     * @return o conjugado do complexo
     */
    Complexo conjugado();
    /**
     * Representa um numero real?
     * Usa o valor do erro por omissao do TDA Complexo.
     * @return true se a parte imaginaria eh 0 a menos de delta, false caso contrario
     */
    boolean ehReal();
    /**
     * Representa um numero real?
     * Usa um valor de erro passado pelo invocador do metodo.
     * @param erro valor maximo do erro aceite
     * @return true se a parte imaginaria eh 0 a menos de delta, false caso contrario
     * @requires erro > 0
     */
    boolean ehReal(double erro);
    /**
     * Representa o complexo zero?
     * Usa o valor do erro por omissao do TDA Complexo.
     * @return true sse this == 0 a menos de delta
     */
    boolean ehZero();
    /**
     * Representa o complexo zero?
     * Usa um valor de erro passado pelo invocador do metodo.
     * @param erro valor maximo do erro aceite
     * @return true sse this == 0 a menos de delta
     * @requires erro > 0
     */
    boolean ehZero(double erro);
    /**
     * Diz se este complexo eh igual a outro
     * Usa o valor do erro por omissao do TDA Complexo.
     * @param outro o outro complexo
     * @return true sse este complexo eh igual a outro a menos de delta
     * @requires outro != null
     */
    boolean ehIgual(Complexo outro);
    /**
     * Diz se este complexo eh igual a outro
     * Usa um valor de erro passado pelo invocador do metodo.
     * @param outro  outro complexo
     * @param erro valor maximo do erro aceite
     * @return true sse este complexo eh igual a outro a menos de delta
     * @requires outro != null
     * @requires erro > 0
     */
    boolean ehIgual(Complexo outro, double erro);
    /**
     * Devolve uma representacao do complexo na forma a + bi
     * @return a string que representa este complexo
     */
    String toString();
    /**
     * Devolve uma representacao do complexo na forma r cis (t)
     * @return a string que representa este complexo na forma trignometrica
     */
    String repTrigonometrica();
}