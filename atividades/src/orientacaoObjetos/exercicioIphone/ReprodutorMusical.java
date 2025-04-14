package orientacaoObjetos.exercicioIphone;

public class ReprodutorMusical implements Iphone {

    public void tocar() {
        System.out.println("Tocando aparelho");
    }

    public void pausar() {
        System.out.println("Pausando aparelho");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica " + musica);
    }
}
