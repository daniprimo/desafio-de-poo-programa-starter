package Exercicio01;

public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private float km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;

    private int velocidadeMaxima;
    private double preco;

    public Veiculo (String Marca,String Modelo, String Placa,String cor, float km,int velocidadeMaxima, double preco){
        this.marca = Marca;
        this.modelo = Modelo;
        this.placa = Placa;
        this.cor = cor;
        this.km = km;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade += velocidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void acelerar (){
        if (velocidade < velocidadeMaxima){
            setVelocidade(20);
            System.out.println(String.valueOf(getVelocidade()));
        }else{
            System.out.println( "Impossivel Acelerar "+ String.valueOf(getVelocidade())+ " é a velocidade maxima");
        }
    }
    
    public void abastecer (int combustivel){
        if (litrosCombustivel < 50){
            setLitrosCombustivel(combustivel);
        }else{
            System.out.println("Impossivel Abastecer");
        }
    }
    
   public void frear (){
        if (velocidade > 0){
            this.velocidade = getVelocidade()-20;
            System.out.println(String.valueOf(getVelocidade()));
        }else{
            System.out.println( "Veiculo ja esta parado");
        }
    }
    
    public void pintar (String cor){
        setCor(cor);
    }
    public void ligar (){
        if (isLigado == false){
            this.isLigado = true;
        }else {
            System.out.println("Automovel ja está ligado");
        }
    }
    public void desligar (){
        if (isLigado != false){
            this.isLigado = false;
        }else {
            System.out.println("Automovel ja está Desligado");
        }
    }

    
    
}
