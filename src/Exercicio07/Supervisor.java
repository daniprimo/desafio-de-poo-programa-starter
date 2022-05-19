package Exercicio07;

public class Supervisor extends Funcionario {
    public Supervisor(String nome, int idade, double salario) {
        super(nome, idade, salario);
        bonificação(5000.00);
    }

    @Override
    public String toString() {
        return mostrar("Supervisor")+
        " Bonificacao: 5000.00"+
                " Salario Bruto: "+ bonificação(5000.00);
    }
}
