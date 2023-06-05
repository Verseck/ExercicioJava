public class Garrafa {
    private String cor;
    private double capacidade;
    private boolean cheia;
    
    public Garrafa(String cor, double capacidade) {
        this.cor = cor;
        this.capacidade = capacidade;
        this.cheia = false;
    }
    
    public void encher() {
        if (!cheia) {
            cheia = true;
            System.out.println("A garrafa está sendo enchida.");
        } else {
            System.out.println("A garrafa já está cheia.");
        }
    }
    
    public void beber() {
        if (cheia) {
            System.out.println("Você está bebendo água da garrafa.");
            cheia = false;
        } else {
            System.out.println("A garrafa está vazia. Encha-a antes de beber.");
        }
    }
    
    public void esvaziar() {
        if (cheia) {
            cheia = false;
            System.out.println("A garrafa está sendo esvaziada.");
        } else {
            System.out.println("A garrafa já está vazia.");
        }
    }
    
    public void lavar() {
        System.out.println("A garrafa está sendo lavada.");
    }
}
