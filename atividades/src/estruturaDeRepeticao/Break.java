package estruturaDeRepeticao;

public class Break {
    public static void main(String[] args) {

        for(int i = 0; i <= 9; i++) {
            if (i == 4) {
                break; // continue
            }

            System.out.println("Caiu aqui " + i);
        }
    }
}
