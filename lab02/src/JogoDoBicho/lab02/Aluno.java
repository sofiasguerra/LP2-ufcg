package lab02;

/**
* Representação de um estudante, especificamente de computação, matriculado da * UFCG. Todo aluno precisa ter uma matrícula e é identificado unicamente
* por esta matrícula.
* 
* @author Sofia Guerra
*/
public class Aluno {
	
	/** 
	* Nome do aluno.
	*/
	private String nome;
	/** 
	* Ano de nascimento do aluno.
	*/
	private int anoNascimento;
	/** 
	* CRA é o Coeficiente de Rendimento Anual do aluno no curso.
	*/
	private double cra;
	/** 
	* Matrícula do aluno. No formato "XXXXYYYZZZZ" onde XXXX é o ano,
	*  YYY é o semestre de entrada e ZZZZ é um identificador 
	*  do aluno no curso.
	*/
	private String matricula;
	
	
	/**
	* Constrói um aluno a partir do seu nome, matícula e ano de nascimento.
	* Todo aluno começa com o campo CRA como nulo.
	*
	* @param matricula a matrícula do aluno, no formato "00000000000"
	* @param nome o nome do aluno
	* @param anoNascimento o ano do nascimento do aluno
	*/
	public Aluno(String nome, String matricula, int anoNascimento) {
		this.nome = nome;
		this.cra = 0.0;
		this.matricula = matricula;
		this.anoNascimento = anoNascimento; 
	}
	
	/**
	* Atualiza o CRA do aluno.
	* @param cra 
	*/
	public void setCra(double cra) {
		this.cra = cra;
	}
	
	/**
	* Retorna o int que representa a idade do aluno.
	* @return a representação em int da idade de um aluno.
	*/
	public int getIdade() {
		return 2026 - anoNascimento;
	}
	
	/**
	* Retorna a String que representa o aluno. A representação segue o 
	* formato “Aluno - Nome do Aluno: MATRICULA”.
	*
	* @return a representação em String de um aluno.
	*/
	public String toString() {
		return "Aluno - " + this.nome + ": " + this.matricula;
	}
}