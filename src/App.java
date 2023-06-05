public class App {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fiat", "Uno", 2020);
        meuCarro.ligar();
        meuCarro.acelerar();
        meuCarro.desligar();
        
        Garrafa minhaGarrafa = new Garrafa("Azul", 500);
        minhaGarrafa.encher();
        minhaGarrafa.beber();
        minhaGarrafa.lavar();
        
        Celular meuCelular = new Celular("Samsung", "Galaxy S10", "123456789");
        meuCelular.ligar();
        meuCelular.desligar();
        meuCelular.fazerChamada("987654321");
    }
}
