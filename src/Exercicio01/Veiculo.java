package Exercicio01;

public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private float km;
    private boolean isLigado = false;
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
        this.litrosCombustivel += litrosCombustivel;
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
    	if (velocidade < velocidadeMaxima && velocidade > 80 && this.litrosCombustivel > 0 && this.isLigado == true) {
    		setVelocidade(50);
            System.out.println("Acelerando Turbo acionado: "+ String.valueOf(getVelocidade()));
            this.litrosCombustivel = this.litrosCombustivel-1;
    	}else if (velocidade < velocidadeMaxima && this.litrosCombustivel > 0){
            setVelocidade(20);
            System.out.println("Acelerando: "+ String.valueOf(getVelocidade()));
            this.litrosCombustivel = this.litrosCombustivel-2;	
    	}else if (this.litrosCombustivel <= 0 || this.isLigado == false){
    	    System.out.println("Impossivel acelerar estamos sem combustivel ou Esta desligado");
    	    this.velocidade = 0;
    	}else{
            System.out.println( "Impossivel Acelerar "+ String.valueOf(getVelocidade())+ " é a velocidade maxima");
        }
    }
    
    public void abastecer (int combustivel){
        if (litrosCombustivel < 60){
            setLitrosCombustivel(combustivel);
            System.out.println("Foi abastecido mais "+ combustivel +" litros quantidade de combustivel atual : "+ this.litrosCombustivel+" litros");
            
        }else if (this.litrosCombustivel <= 0) {
        	System.out.println(this.modelo+" esta sem combustivel");
        }else{
            System.out.println("Impossivel abastercer tanque está cheio");
        }
    }
    
   public void frear (){
	   if (velocidade >= 20 && velocidade > 80) {
		   this.velocidade = getVelocidade()-60;
           System.out.println("Freiando utilizando os discos Especial: "+String.valueOf(getVelocidade()));
	   }if (velocidade >= 20 && velocidade <= 80){
            this.velocidade = getVelocidade()-20;
            System.out.println("Freaiando "+String.valueOf(getVelocidade()));
        }else if (velocidade > 0 && velocidade <= 10){
        	this.velocidade = 0;
        	System.out.println( "Veiculo ja esta devagar");
        }else if (velocidade <= 0){
        	System.out.println( "Veiculo ja esta parado");
        }
    }
    
    public void pintar (String cor){
    	if (cor == this.cor) {
    		System.out.println("Pintando da mesma cor que é: "+ this.cor);
    		setCor(cor);
    	}else {
    		setCor(cor);
    		System.out.println("O "+ this.modelo +" foi pintado de "+ this.cor +" com sucesso.");
    	}
        
    }
    public void ligar (){
        if (isLigado == false){
            this.isLigado = true;
            System.out.println("Vruuumm");
        }else {
            System.out.println("Automovel ja está ligado");
        }
    }
    public void desligar (){
        if (isLigado != false){
            
        this.isLigado = false;
        System.out.println("Motor desligada");
        }else {
            System.out.println("Automovel ja está Desligado");
        }
    }

    
    
}
