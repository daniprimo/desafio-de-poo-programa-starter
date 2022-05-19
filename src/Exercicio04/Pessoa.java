package Exercicio04;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && nome.equals(pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }


    @Override
    public int compareTo(Pessoa pessoa) {
        int idade = Integer.compare(this.getIdade(), pessoa.getIdade());
        if (idade != 0) return idade;

        return this.getNome().compareTo(pessoa.getNome());
    }

    @Override
    public String toString() {
        return "Nome: "+ nome +" "+" Idade:"+ idade;
    }
}
