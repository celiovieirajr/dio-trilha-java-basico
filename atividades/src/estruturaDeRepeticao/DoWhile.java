package estruturaDeRepeticao;

import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("Tocando o telefone...");
        } while (tocando());
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        return  ! atendeu;
    }

}
