package Exercicio03;

public class Aplicacao {

	public static void main(String[] args) {
	
		System.out.println("Mago");
	Mago mago = new Mago("Dumbodor");
	mago.aprenderMagia("Cura");
	mago.aprenderMagia("Mudar o tempo");
	mago.lvlUp();
	mago.lvlUp();
	mago.attack();
	mago.mostrarAsMagias();
	
	System.out.println("\n\nGuerreiro");
	
	Guerreiro guerreiro = new Guerreiro ("Naruto");
	guerreiro.aprenderHabilidade("Força Bruta");
	guerreiro.aprenderHabilidade("Raposa de Nove Caldas");
	guerreiro.lvlUp();
	guerreiro.lvlUp();
	guerreiro.lvlUp();
	guerreiro.attack();
	guerreiro.mostrarHabilidades();
	
	
	System.out.println("\n\nPersonagens:");
	
	System.out.println(Personagem.getQuantidadePersonagem());
	
	
	}

}
