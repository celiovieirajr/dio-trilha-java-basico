package estruturaDeRepeticao;
import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {

        double mesada = 50.0;
        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.printf("Doce do valor: %.2f adicionando no carrinho.%n", valorDoce);
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joaozinho gastou toda a semana em doces.");


    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
