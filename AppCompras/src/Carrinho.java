import java.util.*;

public class Carrinho {
	
	Scanner sc = new Scanner(System.in);
	private String[] listaDeProdutos;
	private double valorTotal;
	private int quantidadeDeItens;
	
	public Carrinho() {
		this.listaDeProdutos = new String[1];
		this.valorTotal = 0;
		this.quantidadeDeItens = 0;
	}
	
	public void adicionaProduto(Produto prod) {
		double preco = prod.getValorTotal() ;
		this.valorTotal += preco;
		int qt = prod.getQuantidade();
		
		if (quantidadeDeItens + qt > listaDeProdutos.length) {
			String[] novoArray = new String[quantidadeDeItens + qt];
			
			for (int i = 0; i < listaDeProdutos.length; i++ ) 
				novoArray[i] = listaDeProdutos[i];
			
			listaDeProdutos = novoArray;
		}
		
		for (int j = quantidadeDeItens; j < quantidadeDeItens + qt; j ++) {
			listaDeProdutos[j] = prod.getNome();
		}
		this.quantidadeDeItens += qt;
	}
	
	public double getValorTotal() {
		return this.valorTotal;
	}
	
	public String[] getLista() {
		return this.listaDeProdutos;
	}
	
	public int getQuantidadeDeItens() {
		return this.quantidadeDeItens;
	}
	
	public String toString() {
		String out = "";
		out += "Seu carrinho atual tem " + quantidadeDeItens + " itens.";
		out += "\nOs produtos são: " + Arrays.toString(listaDeProdutos);
		out += "\nO valor total do seu carrinho é: R$ " + valorTotal;
		return out;
	}
	
	public void fazerCompras() {
		while (true) {
			String[] ent = sc.nextLine().split(" ");
			if (ent[0].equals("encerrar")) break;
			
			int qt = Integer.parseInt(ent[0]);
			String nome = ent[1];
			double preco = Double.parseDouble(ent[2]);
			
			Produto px = new Produto(qt, nome, preco);
			adicionaProduto(px);
			}
	}
	public void finalizarCompra() {
		System.out.println("Tem certeza que deseja finalizar a compra?");
		String resp = sc.nextLine();
		
		if (resp.equals("sim")) 
			System.out.println("Sua compra de R$ " + valorTotal + " foi finalizada com sucesso, parabéns!");
		else { 
			System.out.println("Continue sem problemas :)");
			fazerCompras();
			finalizarCompra();
		}
	}	
}
