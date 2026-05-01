
import java.util.*;
public class JogoBicho {
	String[] bichos = {"Avestruz", "Águia","Burro","Borboleta","Cachorro","Cabra", "Carneiro","Camelo", "Cobra", "Coelho","Cavalo", "Elefante", "Galo", "Gato","Jacaré", "Leão", "Macaco","Porco", "Pavão","Peru","Touro","Tigre","Urso","Veado","Vaca"};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JogoBicho jb = new JogoBicho();
		
		int n = sc.nextInt();
		String bicho = jb.pegaBicho(n);
		System.out.println(bicho);
		
		int[] bilhete = new int[5];
		bilhete = jb.randomNums(bilhete);
		System.out.println(Arrays.toString(bilhete));
		
		String[] aposta = new String[5];
		aposta = jb.bichosAposta(bilhete, aposta);
		System.out.println(Arrays.toString(aposta));
	}
	
	public String pegaBicho(int n) {
		for (int i = 0; i < bichos.length; i ++)
			if (i+1 == n)
				return bichos[i];
		return null;
	}
		
	public int[] randomNums(int[] bilhete) {
		Random random = new Random();
		
		for (int i =0; i < 5; i++)
			do {
				bilhete[i] = random.nextInt(25)+1;
			} while(repetido(bilhete[i], bilhete, i));
		Arrays.sort(bilhete);
		return bilhete;
	}
	
	public boolean repetido(int num, int[] arr, int limite) {
		for (int j = 0; j < limite; j++)
			if (num == arr[j])
				return true;
		return false;
	}
	
	public String[] bichosAposta(int[] bilhete, String[] aposta) {
		String bichoVez;
		JogoBicho jb = new JogoBicho();
		
		for (int k = 0; k < bilhete.length; k++) {
			bichoVez = jb.pegaBicho(bilhete[k]);
			aposta[k] = bichoVez;
		}
		return aposta;
	}				
}