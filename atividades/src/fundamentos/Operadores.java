package fundamentos;

public class Operadores {
    public static void main(String[] args) {

        int numero = 5;

        System.out.println(+ numero);
        numero = - numero;
//        System.out.println(numero);

        numero = numero * -1;
//        System.out.println(numero);

        //repetição / incremento
        int numeroDois = 5;
        numeroDois = ++numeroDois;
        System.out.println(numeroDois);

        boolean variavel = true;
        System.out.println(!variavel);

//        variavel = !variavel;
        System.out.println(variavel);

        int a, b;
        a = 6;
        b = 6;

        String resultado = a==b ? "verdadeira":"falsa";
        System.out.println(resultado);

    }
}
