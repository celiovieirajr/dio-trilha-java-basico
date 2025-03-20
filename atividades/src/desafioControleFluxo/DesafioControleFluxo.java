package desafioControleFluxo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DesafioControleFluxo {
    public static void main(String[] args) {
        try {
            contador();
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida! Digite apenas números inteiros.");
        }
    }

    public static void contador() throws ParametrosInvalidosException {

        int[] numeros = new int[2];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i+1) + "° número.");
            numeros[i] = entrada.nextInt();

            }
        if (numeros[1] < numeros[0]) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro!");
        } else System.out.println("Valores corretos! Primeiro: " + numeros[0] + ", Segundo: " + numeros[1]);
    }
}

