package Exercicio05;

import Exercicio04.Pessoa;

import java.util.*;

public class Excluir {
    public static void main(String[] args) {
        Set<Pessoa> listaDePessoas = new TreeSet<>();
        listaDePessoas.add(new Pessoa("João",15));
        listaDePessoas.add(new Pessoa("Leandro",21));
        listaDePessoas.add(new Pessoa("Paulo",17));
        listaDePessoas.add(new Pessoa("Jessica",18));

        for (Pessoa pessoa:listaDePessoas) {
            System.out.println("Nome:"+pessoa.getNome()+" "+ String.valueOf(pessoa.getIdade()));
        }


        System.out.println("Excluir menores de 18 Anos");
        Iterator<Pessoa> pessoas = listaDePessoas.iterator();
        while (pessoas.hasNext()){
            if (pessoas.next().getIdade() < 18){
                pessoas.remove();
              }
        }

        System.out.println(listaDePessoas);


    }

}
