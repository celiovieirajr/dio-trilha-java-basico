package sozinho;

import java.util.Scanner;

public class Cardapio {
    public static void main(String[] args) {

        Produto produto;

        System.out.println("Seja bem vindo ao sistema de mercado.");
        while (true) {
            menu();
            selecionaMenu();
        }

    }

    public static void menu() {
        System.out.println("1 - Incluir produto.");
        System.out.println("0 - Sair do sistema.");
    }

    public static void selecionaMenu() {
        Scanner entrada = new Scanner(System.in);
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println();
                break;
        }
    }
}
