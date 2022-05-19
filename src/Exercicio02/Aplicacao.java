package Exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Aplicacao {
    public static void main(String[] args) {

        VideoGame ps4 = new VideoGame("PS4",1800.00,100,"Sony","Slim",false);
        VideoGame ps4usado = new VideoGame("PS4",1000.00,7,"Sony","Slim",true);
        VideoGame xbox = new VideoGame("Xbox",1500.00,500,"Microsoft","One",false);

        Livro harrypotter = new Livro("Harry Potter",40.00,50,"K. Rowling","Fantasia",300);
        Livro senhorDosAneis = new Livro("Senhor dos Aneis",60.00,30,"J. R. R. Tolkien","Fantasia",500);
        Livro Java_POO = new Livro("Java POO",20.50,50,"GFT","educativo",500);

        List<Livro> livros = new ArrayList<>();
        livros.add(harrypotter);
        livros.add(senhorDosAneis);
        livros.add(Java_POO);

        List<VideoGame> games = new ArrayList<>();
        games.add(ps4);
        games.add(ps4usado);
        games.add(xbox);

        Loja impacts = new Loja("Impact","442548785-52",livros,games);

        harrypotter.calcularImposto();
        senhorDosAneis.calcularImposto();
        Java_POO.calcularImposto();
        System.out.println("----------------------------");

        ps4usado.calcularImposto();
        ps4.calcularImposto();
        xbox.calcularImposto();
        System.out.println("----------------------------");

        impacts.listaLIvros();
        System.out.println("----------------------------");

        impacts.listaVideoGames();
        System.out.println("----------------------------");

        impacts.calcularPatrimonio();

    }
}
