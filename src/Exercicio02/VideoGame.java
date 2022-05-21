package Exercicio02;

public class VideoGame extends Produto implements Imposto {
    private String marca;
    private String modelo;
    private boolean isUsado;
    private double total;


    public VideoGame(String nome, double preco, int quantidade,String marca, String modelo, boolean usado) {
        super(nome, preco, quantidade);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = usado;
        this.total = preco*quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }

    
    public double getTotal() {
        return total;
    }

    
    @Override
    public void calcularImposto() {
        if (this.isUsado == true){
            double valorImposto = (this.getPreco()*25)/100;
            System.out.println("Imposto do PS4 SLIN Usado, R$"+ valorImposto);
        }else{
            double valorImposto = (this.getPreco()*45)/100;
            System.out.println("Imposto do PS4 SLIN NOVO, R$"+ valorImposto);
        }
   }
}
