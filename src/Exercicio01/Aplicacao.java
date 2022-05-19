package Exercicio01;

public class Aplicacao {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Chevrolet","Celta","blkw-2462"
                ,"Vermelho",50254,200,78.200);

        veiculo.acelerar();
        veiculo.acelerar();
        System.out.println("Freiar");
        veiculo.frear();
        veiculo.frear();
        veiculo.ligar();
        veiculo.desligar();
        veiculo.desligar();
        veiculo.ligar();
    }
}
