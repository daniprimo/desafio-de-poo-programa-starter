package Exercicio07;

public abstract class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double bonificação(double salario) {
            return this.salario += salario;
    }

    public String mostrar (String cargo) {
        return "Cargo: "+ cargo+
                " Nome: "+ getNome()+
                " Idade: "+ getIdade()+
                " Salario: "+ this.getSalario();
    }
}
