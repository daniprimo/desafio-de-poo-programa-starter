package Exercicio02;

import java.util.Iterator;
import java.util.List;

public class Loja {
    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> games;

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> games) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.games = games;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getGames() {
        return games;
    }

    public void setGames(List<VideoGame> games) {
        this.games = games;
    }

    public void listaLIvros () {
        System.out.println("A loja "+ this.getNome() + " possui estes livros para venda");
        for (Livro produto:livros) {
            System.out.println("Titulo: "+ produto.getNome()+
                    ", Preco: "+ produto.getPreco()+
                    ", Quantidade: "+ produto.getQuantidade()+" em estoque");
        }
    }

     public void listaVideoGames () {
         System.out.println("A loja "+ this.getNome() + " possui estes Video Games para venda");
         for (VideoGame produto:games) {
             System.out.println("vido-Game: "+ produto.getModelo()+
                     ", Preco: "+ produto.getPreco()+
                     ", Quantidade: "+ produto.getQuantidade()+" em estoque");
         }
    }

    public String calcularPatrimonio () {
        Iterator<Livro> patrimonioLivro = livros.iterator();
        double somaLivro = 0.0;
        while (patrimonioLivro.hasNext()){
           Double valor = patrimonioLivro.next().getTotsl();
            somaLivro += valor;
            
        }
        Iterator<VideoGame> patrimonioGame = games.iterator();
        double somaGame = 0.0;
        while (patrimonioGame.hasNext()){
            Double valor = patrimonioGame.next().getTotal();
            somaGame += valor;
        }
        
        double patrimonio = somaLivro+somaGame;

        return "O patrimonio da loja "+this.nome+ " é de R$"+ patrimonio ;
    }

}
