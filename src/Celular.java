public class Celular {
    private String marca;
    private String modelo;
    private boolean ligado;
    
    public Celular(String marca, String modelo, String numero) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = false;
    }
    
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O celular está ligando.");
        } else {
            System.out.println("O celular já está ligado.");
        }
    }
    
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O celular está desligando.");
        } else {
            System.out.println("O celular já está desligado.");
        }
    }
    
    public void enviarMensagem(String mensagem) {
        if (ligado) {
            System.out.println("Enviando mensagem: " + mensagem);
        } else {
            System.out.println("O celular precisa estar ligado para enviar mensagens.");
        }
    }
    
    public void fazerChamada(String numero) {
        if (ligado) {
            System.out.println("Fazendo chamada para o número: " + numero);
        } else {
            System.out.println("O celular precisa estar ligado para fazer chamadas.");
        }
    }
}
