package fundamentos;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TiposVariaveis {
    public static void main(String[] args) {

        // Tipos Primitivos
        // estudem a classe String que representa texto na aplicação

        String meuNome = "Célio João Vieira";
        String meuNomeCompleto = meuNome.toUpperCase(Locale.of(meuNome));

        byte idade = 123;
        short ano = 2021;
        int cep = 16078273;
        long cpf = 825008200;
        float pi = 3.14F;
        double salarioMinimo = 2500.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 10;

        int numero2 = numero;

        numero2 = 11;

        final double PI = 3.14;
        }
}