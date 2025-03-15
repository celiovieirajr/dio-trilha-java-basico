package estruturaDeControle;

public class SwitchCase {
    public static void main(String[] args) {
        String plano = "A";

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
                break;
            }
            case "M": {
                System.out.println("Whats e instagram grátis");
                break;
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
