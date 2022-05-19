package Exercicio07;

public class Gerente extends Funcionario{

    public Gerente(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public String toString() {
        return mostrar("Gerente")+
                " Bonificacaoo: 10000.00"+
                " Salario Bruto: "+ bonificação(10000.00);


    }
}
