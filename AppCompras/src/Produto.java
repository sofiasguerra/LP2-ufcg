public class Produto {
	
	private String nome;
	private int quantidade;
	private double preço;
	
	public Produto(int qt, String nome, double preço) {
		this.nome = nome;
		this.quantidade = qt;
		this.preço = preço;
	}
	
	public String getNome() {
		return this.nome;
	}
	public double getPreço() {
		return this.preço;
	}
	public int getQuantidade() {
		return this.quantidade;
	}
	public void atualizaQt(int qt) {
		this.quantidade = qt;
	}
	public double getValorTotal() {
		return preço*quantidade; 
	}
}