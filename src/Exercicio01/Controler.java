package Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Controler {

    private List<Veiculo> veiculo = new ArrayList<>();

    void adicionar () {

        String marca = "";
        String modelo = "";
        String placa = "";
        String cor = "";
        float km = 00;
        int velocidadeMaxima = 0;
        double preco = 00.0;

       veiculo.add(new Veiculo(marca,modelo,placa,
               cor,km,velocidadeMaxima,preco));
    }

    public void mostrarTodos () {
        for (Veiculo veiculo:veiculo) {
            System.out.println("Marca:"+ veiculo.getMarca());
            System.out.println("Modelo:"+ veiculo.getModelo());
            System.out.println("Placa:"+ veiculo.getPlaca());
            System.out.println("Cor:"+ veiculo.getCor());
        }
    }

    public void acelerar () {
        for (Veiculo veiculo:veiculo) {
          if (veiculo.getModelo() == "Gol"){
                veiculo.acelerar();
          }
        }
    }

    public void frear () {
        for (Veiculo veiculo:veiculo) {
            if (veiculo.getModelo() == "Gol"){
                veiculo.frear();
            }
        }
    }

    public void pintar () {
        for (Veiculo veiculo:veiculo) {
            if (veiculo.getModelo() == "Gol"){
                veiculo.pintar("");
            }
        }
    }

    public void isLigar () {
        for (Veiculo veiculo:veiculo) {
            if (veiculo.getModelo() == "Gol"){
                veiculo.ligar();
            }
        }
    }

    public void isDesligar () {
        for (Veiculo veiculo:veiculo) {
            if (veiculo.getModelo() == "Gol"){
                veiculo.desligar();
            }
        }
    }

}

