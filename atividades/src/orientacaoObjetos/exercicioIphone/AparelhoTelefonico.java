package orientacaoObjetos.exercicioIphone;

public class AparelhoTelefonico implements Iphone {

    public void ligar() {
        System.out.println("Ligando o aparelho");
    }

    public void desligar() {
        System.out.println("Desligando o aparelho");
    }

    public void atender() {
        System.out.println("Atendendo a ligação");
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando o correio de voz");
    }
}
