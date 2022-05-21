package Exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Personagem {

    private String nome;
    private int vida;
    private int mana;
    private float xp;
    private int inteligencia;
    private int forca;
    private int level;
    private static List<String> quantidadePersonagem = new ArrayList<>();

    public Personagem(String nome) {
        this.nome = nome;
        
    }
    
    
    
    
  

	public static String getQuantidadePersonagem() {
		
		for (String lista :quantidadePersonagem ) {
			System.out.println(lista);
		}
		
		
		
		return quantidadePersonagem.size() +" personagens criados";
		
	}






	public static void setQuantidadePersonagem(String string) {
				
		quantidadePersonagem.add(string);
		
	}






	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome += nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida += vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana += mana;
    }

    public float getXp() {
        return xp;
    }

    public void setXp(float xp) {
        this.xp += xp;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia += inteligencia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca += forca;
    }

    public int getLevel() {
        return level;
    }
 

    public void setLevel(int level) {
        this.level += level;
    }

    
    
   
    
    
}
