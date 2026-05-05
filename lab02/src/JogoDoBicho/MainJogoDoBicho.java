package JogoDoBicho;

public class MainJogoDoBicho {

	public static void main(String[] args) {
		
		Game jogo1 = new Game(5);
		Game jogo2 = new Game(3);
		
		int numero1 = 16;
		int numero2 = 19;
		
		jogo1.setNum(numero1);
		
		System.out.println(jogo1.getBicho(numero1));
		
		int[] bilhete1 = jogo1.getBilhete();
		jogo1.getAposta(bilhete1);
		
		System.out.println(jogo1);
	}

}
