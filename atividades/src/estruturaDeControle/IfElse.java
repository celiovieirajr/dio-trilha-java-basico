package estruturaDeControle;

public class IfElse {
    public static void main(String[] args) {

        double saldo = 10;
        double valorSacado = 5;

        if (valorSacado <= saldo) {
            saldo = saldo - valorSacado;
            System.out.println("Novo saldo é: " + saldo);

        } else System.out.println("Saldo infuficiente");


    }
}
