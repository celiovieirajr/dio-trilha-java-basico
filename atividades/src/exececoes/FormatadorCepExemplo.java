package exececoes;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formartarCep("237064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não está correto");
        }
    }

    public static String formartarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();

        }
            return  "23.765-065";
    }
}
