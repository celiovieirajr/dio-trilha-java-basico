package orientacaoObjetos.lambdaKeywords;
import orientacaoObjetos.lambdaKeywords.keyword.Client;
import orientacaoObjetos.lambdaKeywords.keywordDois.Cliente;

public class Main {
    public static void main(String[] args) {
//
//        var user = new Client();
//        user.setName("Célio");
//        System.out.println(user.getName());


        var cliente = new Cliente();
        cliente.setName("Célio");
        cliente.setStaticName("Celio Statico");

        System.out.println(cliente.getName());
        System.out.println(cliente.getStaticName());
        System.out.println("---------------------------------------");

        var cliente2 = new Cliente();
        cliente2.setName("Abobora");
        cliente2.setStaticName("Abobora Statico");

        System.out.println(cliente2.getName());
        System.out.println(cliente2.getStaticName());
    }
}
