package Exercicio04;

import java.util.*;

public class Aplicacao {
    public static void main(String[] args) {
    	
    	System.out.println("Adicionando os nomes a Lista Criada");

        List<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(new Pessoa("Joao",15));
        listaDePessoas.add(new Pessoa("Leandro",21));
        listaDePessoas.add(new Pessoa("Paulo",17));
        listaDePessoas.add(new Pessoa("Jessica",18));
        System.out.println(listaDePessoas.size()+ " nomes da lista.");
        

        for (Pessoa pessoa:listaDePessoas) {
            System.out.println("Nome:"+pessoa.getNome()+" "+ String.valueOf(pessoa.getIdade()));
        }

            System.out.println("\nMostrando o mais velho da lista\n");
            String nome = Collections.max(listaDePessoas).getNome();
            String idade = String.valueOf(Collections.max(listaDePessoas).getIdade());
            System.out.print("O mais velho é o "+nome+" de "+ idade+" anos");

            	
    }
}
