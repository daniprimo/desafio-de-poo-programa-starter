package Exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem {
	

	private List<String> magia = new ArrayList<>();
	 
	public Mago(String nome) {
		super(nome);
		setQuantidadePersonagem(nome);
	}
	
	
	
	
	public List<String> getMagia() {
		return magia;
	}




	public void setMagia(String string) {
		
		this.magia.add(string);
		System.out.println("Magia adicionada");
	}




	public void attack() {
		Random random = new Random();
	 int attack = (this.getInteligencia() * this.getLevel()) + random.nextInt(300); 
	 System.out.println("Ataque de:"+ attack);
	}
	
	public void aprenderMagia (String string) {
		
		setMagia(string);
		
		
	}
	
	public void lvlUp () {
		this.setMana(10);
		this.setXp(15);
		this.setInteligencia(10);
		this.setVida(50);
		this.setForca(25);
		this.setLevel(1);
    }
	
	public void mostrarAsMagias () {
		System.out.println("Magia do "+ this.getNome());
		for (String lista : magia) {
			System.out.println(lista);
		}
	}
    
	

		
	
	
}
