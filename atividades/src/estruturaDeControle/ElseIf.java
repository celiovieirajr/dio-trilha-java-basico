package estruturaDeControle;

public class ElseIf {
    public static void main(String[] args) {

        double nota = 7;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Nota de recuperação");
        } else System.out.println("Reprovado");
    }
}
