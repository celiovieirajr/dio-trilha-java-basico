package orientacaoObjetos.construtores;

public class SistemaDeCadastro {
    public static void main(String[] args) {

        Pessoa marcos = new Pessoa("Marcos", "46970093808");
        marcos.setEndereco("Rua das oliveiras");

        System.out.println(marcos.getNome() + " - " + marcos.getEndereco());
        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}
