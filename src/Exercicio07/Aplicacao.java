package Exercicio07;

public class Aplicacao {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Enzo Perez",42, 5000.00);
        Funcionario supervisor = new Supervisor("Julio Casares",32, 3000.00);
        Funcionario vendedor = new Vendedor("Adrieli",25, 1200.00);

        System.out.println(gerente);
        System.out.println(supervisor);
        System.out.println(vendedor);

    }
}
