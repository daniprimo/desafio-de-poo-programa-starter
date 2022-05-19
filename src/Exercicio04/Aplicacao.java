package Exercicio04;

import java.util.*;

public class Aplicacao {
    public static void main(String[] args) {

        List<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(new Pessoa("João",15));
        listaDePessoas.add(new Pessoa("Leandro",21));
        listaDePessoas.add(new Pessoa("Paulo",17));
        listaDePessoas.add(new Pessoa("Jessica",18));

        for (Pessoa pessoa:listaDePessoas) {
            System.out.println("Nome:"+pessoa.getNome()+" "+ String.valueOf(pessoa.getIdade()));
        }

            System.out.println();
            String nome = Collections.max(listaDePessoas).getNome();
            String idade = String.valueOf(Collections.max(listaDePessoas).getIdade());
            System.out.print("O mais velho é o"+nome+" de "+ idade+" anos");


    }
}
