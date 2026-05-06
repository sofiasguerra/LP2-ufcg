import java.util.*;

public class AppDeCompras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Carrinho carrinho1 = new Carrinho();
		
		System.out.println("Digite para adicionar produto (quantidade, nome, preço)");
		
		carrinho1.fazerCompras();
		System.out.println(carrinho1);
		carrinho1.finalizarCompra();
	}
}


