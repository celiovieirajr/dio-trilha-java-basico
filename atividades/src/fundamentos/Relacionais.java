package fundamentos;

public class Relacionais {
    public static void main(String[] args) {

        String nomeUm = "CELIO";
        String nomeDois = new String("CELIO");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("Numero um é igual numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero um é diferente de numeroDois? " + simNao);

        simNao = numero1 >= numero2;
        System.out.println("Numero um é maior ou igual a numeroDois? " + simNao);

        simNao = numero1 <= numero2;
        System.out.println("Numero um é maior ou igual a numeroDois? " + simNao);


    }
}
