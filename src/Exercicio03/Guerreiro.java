package Exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {
	
	

	private List<String> habilidade = new ArrayList<>();
	
	public Guerreiro(String nome) {
		super(nome);
		setQuantidadePersonagem(nome);
		
	}

	public List<String> getHabilidade() {
		return habilidade;
	}
 
	public void setHabilidade(String string) {
		this.habilidade.add(string);
		System.out.println("Habilidade adicionada");
	}
	
	public void attack() {
		Random random = new Random();
		 int attack = (this.getForca() * this.getLevel()) + random.nextInt(300); 
		 System.out.println("Ataque de:"+ attack);
	}
	
	public void aprenderHabilidade (String string) {
		setHabilidade(string);
	}
	
	public void lvlUp () {
		this.setMana(25);
		this.setXp(15);
		this.setInteligencia(25);
		this.setVida(25);
		this.setForca(10);
		this.setLevel(1);
    }
	
	public void mostrarHabilidades () {
		System.out.println("Habilidades do "+ this.getNome());
		for (String lista : habilidade) {
			System.out.println(lista);
		}
	}
    
	
	

	
	
}
