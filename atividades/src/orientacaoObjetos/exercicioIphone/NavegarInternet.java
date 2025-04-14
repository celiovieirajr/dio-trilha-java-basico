package orientacaoObjetos.exercicioIphone;

public class NavegarInternet implements Iphone{

    public void exeibirPagina(String url) {
        System.out.println("Abrindo página");
        System.out.println(url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }
}
