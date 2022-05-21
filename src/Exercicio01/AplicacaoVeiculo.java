package Exercicio01;

public class AplicacaoVeiculo {
	public static void main(String[] args) {
		Veiculo  veiculo = new Veiculo("Nissam","GT","Preto","BKW-2462", 0, 250,79000.00);

		System.out.println("\nFuncao para ligar e desligar o "+ veiculo.getModelo());
		veiculo.abastecer(40);
		veiculo.abastecer(20);
		veiculo.abastecer(10);
		System.out.println("\nFuncao para ligar e desligar o "+ veiculo.getModelo());
		veiculo.ligar();
		veiculo.ligar();
		veiculo.ligar();
		veiculo.desligar();
		veiculo.desligar();
		veiculo.ligar();
		veiculo.desligar();
		veiculo.ligar();
	
		
		System.out.println("\nAcelerando o "+ veiculo.getModelo());
		veiculo.acelerar();
		veiculo.acelerar();
		veiculo.acelerar();
		veiculo.acelerar();
		veiculo.acelerar();
		veiculo.acelerar();
		veiculo.acelerar();		
		veiculo.acelerar();
		veiculo.acelerar();
		veiculo.acelerar();
		System.out.println("\nFreiando o "+ veiculo.getModelo());
		veiculo.frear();
		veiculo.frear();
		veiculo.frear();
		veiculo.frear();
		veiculo.frear();
		veiculo.frear();
		veiculo.frear();
		veiculo.frear();
		System.out.println("\nPintar o "+ veiculo.getModelo());
		veiculo.pintar("Azul");
		veiculo.pintar("Azul");
		veiculo.pintar("Laranja");
		veiculo.pintar("Amarelo");
		veiculo.pintar("Laranja");
		
	}
	
}