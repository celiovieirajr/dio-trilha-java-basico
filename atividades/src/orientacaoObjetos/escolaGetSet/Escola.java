package orientacaoObjetos.escolaGetSet;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();

        felipe.setNome("Célio Júnior");
        felipe.setIdade(8);
        felipe.setSexo("M");
        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos");
        System.out.println(felipe.getSexo());
        //
//        felipe.nome = "FELIPE";
//        felipe.idade = 8;
//
//        System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos");
    }
}
