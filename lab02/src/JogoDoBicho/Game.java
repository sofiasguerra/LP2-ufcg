package JogoDoBicho;
import java.util.*;

public class Game {
	
	private String[] bichos = {"Avestruz", "Águia","Burro","Borboleta","Cachorro","Cabra", "Carneiro","Camelo", "Cobra", "Coelho","Cavalo", "Elefante", "Galo", "Gato","Jacaré", "Leão", "Macaco","Porco", "Pavão","Peru","Touro","Tigre","Urso","Veado","Vaca"};
	private int num;
	private int[] bilhete;
	private String[] aposta;
	private int tamanhoDoJogo;
	
	public Game(int tamanho) {
		this.tamanhoDoJogo = tamanho;
		this.bilhete = new int[tamanhoDoJogo];
		this.aposta = new String[tamanhoDoJogo];
	}
	
	public String getBicho(int numero) {
		for (int i = 0; i < bichos.length; i ++)
			if (i+1 == numero)
				return bichos[i];
		return null;
	}
	
	public void setNum(int num) {
		this.num = num; 
	}

	public int[] getBilhete() {
		Random random = new Random();
	
		for (int i = 0; i < tamanhoDoJogo; i++)
			do {
				bilhete[i] = random.nextInt(25)+1;
			} while(repetido(bilhete[i], bilhete, i));
		Arrays.sort(bilhete);
		return bilhete;
	}
	
	public boolean repetido(int n, int[] arr, int limite) {
		for (int j = 0; j < limite; j++)
			if (n == arr[j])
				return true;
		return false;
	}
	
	public String[] getAposta(int[] bil) {
		String bichoVez = "";
	
		for (int k = 0; k < tamanhoDoJogo; k++) {
			bichoVez = getBicho(bil[k]);
			aposta[k] = bichoVez;
		}
		return aposta;
	}
	
	public String toString() {
		String out = "";
		out += "Sua aposta " + Arrays.toString(this.bilhete) + " ";
		out += "resultou nos " + Arrays.toString(this.aposta) + " bichos!";
		return out;
	}
}
