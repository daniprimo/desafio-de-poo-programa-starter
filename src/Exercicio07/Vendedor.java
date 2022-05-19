package Exercicio07;

public class Vendedor extends Funcionario {
    public Vendedor (String nome, int idade, double salario) {
        super(nome, idade, salario);
        bonificação(3000.00);
    }

    @Override
    public String toString() {
        return mostrar("Vendedor")+
                " Bonificacao: 3000.00"+
                " Salario Bruto: "+ bonificação(3000.00);
    }
}
