package aula;

public class Personagem {	
	private String name;
	private int life;
	private int score;
	private int energy;
	
	public Personagem(String name) {
	this.name = name;
	this.life = 10;
	this.score = 0;
	this.energy = 0;
	}
	
	public String getName() {
		return this.name;
	}
	public int getLife() {
		return this.life;
	}
	public int getScore() {
		return this.score;
	}
	public int getEnergy() {
		return this.energy;
	}
	public void atualizaAtributos(String atributo, int valor) {
		if (atributo.equals("life")) 
			this.life += valor;
		else if (atributo.equals("score"))
			this.score += valor;
		else if (atributo.equals("energy"))
			this.energy += valor;
		else
			System.out.println("Atributo inválido");
	}
	public String toString() {
		String out = "";
		out += "Name: " + name;
		out += "\nLife: " + life;
		out += "\nScore: " + score;
		out += "\nEnergy: " + energy;
		out += "\n";
		return out;
	}
	
	public void attack(Personagem victim, int damage) {
		int newLife = victim.getLife() - damage;
		victim.life = newLife;
	}
	
	public void heal(Personagem perso, int value) {
		int newLife = perso.getLife() + value;
		perso.life = newLife;
	}
	
	public void power(Personagem perso, int value) {
		int newEnergy = perso.getEnergy() + value;
		perso.energy = newEnergy;
	}
	
	public static Personagem findPlayer(Personagem[] players, String nome) {
		for (int i = 0; i < players.length; i++) {
			String jg = players[i].getName();
			if (jg.equals(nome)) 
				return players[i];
			}
		System.out.println("Jogador não encontrado :(");
		return null;
		}
				
}

