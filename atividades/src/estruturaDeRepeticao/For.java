package estruturaDeRepeticao;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("O valor é: " + i);

            String alunos [] = {"João", "Maria", "José", "Pedro", "Ana"};

            for (int a = 0; a < alunos.length; a++) {
                System.out.println("O aluno é: " + alunos[a]);
            }


            for(String aluno : alunos) {
                System.out.println("O aluno é: " + aluno);
            }
        }
    }
}
