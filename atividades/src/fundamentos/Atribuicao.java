package fundamentos;

import java.util.Date;

public class Atribuicao {
    public static void main(String[] args) {

        String nome = "CÉLIO";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doador = false;
        Date dataNascimento = new Date();


        //
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (70 * 7) + (20 / 4);

        //
        String nomeCompleto = "LINGUAGEM" + " JAVA";
//        System.out.println(nomeCompleto);

        String concatenacao = "?";
//        System.out.println(concatenacao);

        concatenacao = 1+1+1+1+"1";
//        System.out.println(concatenacao);

        concatenacao = 1+1+"1"+1+"1";
//        System.out.println(concatenacao);


    }
}
