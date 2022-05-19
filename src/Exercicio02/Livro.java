package Exercicio02;

public class Livro extends  Produto implements Imposto {

    private String autor;
    private String tema;
    private int quantidadeDePagina;

    public Livro(String nome, double preco, int quantidade, String autor, String tema, int quantidadeDePagina) {
        super(nome, preco, quantidade);
        this.autor = autor;
        this.tema = tema;
        this.quantidadeDePagina = quantidadeDePagina;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQuantidadeDePagina() {
        return quantidadeDePagina;
    }

    public void setQuantidadeDePagina(int quantidadeDePagina) {
        this.quantidadeDePagina = quantidadeDePagina;
    }

    @Override
    public void calcularImposto() {
        if (this.tema == "educativo"){
            System.out.println("Isento de Imposto");
        }else if (this.tema == "Educativo"){
            System.out.println("Isento de Imposto");
        }else {
            double valorImposto = (this.getPreco()*10)/100;
            System.out.println("R$"+valorImposto+" de imposto foi cobrado sobre o livro "+this.getNome());
        }
    }
}
