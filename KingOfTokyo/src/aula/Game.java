package aula;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qantos jogadores? ");
		int qtPlayers = sc.nextInt();
		
		Personagem[] players = new Personagem[qtPlayers];
		int x = 0;
		for (; x < qtPlayers; x++) {
			System.out.println("Digite o nome do jogador:");
			String nome = sc.next();
			players[x] = new Personagem(nome);
		}
		sc.nextLine();
		
		String[] linha;
		while (true) {
		System.out.println("Digite um atributo (em inglês), pontos e um jogador: ");
		linha = sc.nextLine().split(" ");
		if (linha[0].equals("encerrar")) {
			break;
		}
		String acao = linha[0];
		int valor = Integer.parseInt(linha[1]);
		
		Personagem jgQueRecebe = Personagem.findPlayer(players, linha[2]);
		
		jgQueRecebe.atualizaAtributos(acao, valor);
		}
		
		System.out.println("Estatísticas finais de cada Player: \n");
		for (int i = 0; i < qtPlayers; i++) {
			System.out.println(players[i]);
		}
		
	}

}
