package exececoes;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        try {
            Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o seu nome: ");
            String nome = entrada.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = entrada.next();

            System.out.println("Digite sua idade: ");
            int idade = entrada.nextInt();

            System.out.println("Digite a sua altura: ");
            double altura = entrada.nextDouble();

            System.out.println("Olá meu nome é " + nome + " meu sobrenome é +" +
                    sobrenome + ".");
            System.out.println("A minha idade é " + idade + " anos.");
            System.out.println("A minha altura é " + altura + "cm");
        }catch (InputMismatchException e) {
            System.err.println("Os campos idade e altura precisam ser númericos");
        }

    }
}
