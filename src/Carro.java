public class Carro {
    private String marca;
    private String modelo;
    private boolean ligado;
    
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = false;
    }
    
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro está ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }
    
    public void acelerar() {
        if (ligado) {
            System.out.println("O carro está acelerando.");
        } else {
            System.out.println("O carro precisa estar ligado para acelerar.");
        }
    }
    
    
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O carro está desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }
}
