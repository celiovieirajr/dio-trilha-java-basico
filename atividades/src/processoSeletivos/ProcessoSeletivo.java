package processoSeletivos;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
//        selecaoCadidatos();
//        imprimirSelecionado();
        String [] candidatos = {"FELIPE", "MARCIA", "CELIO", "JOAO", "VIEIRA"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    }

    public static void entrandoEmContato(String candidato) {
        int tentativaRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativaRealizadas++;
            } else System.out.println("CONTATO REALIZADO COM SUCESSO!");
        }while (continuarTentando && tentativaRealizadas < 3);

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativaRealizadas + " TENTATIVAS");
        }else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " NUMERO DE TENTATIVAS " + tentativaRealizadas);
    }

    public static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    public static void selecaoCadidatos() {
        String [] candidatos = {"FELIPE", "MARCIA", "CELIO", "JOAO", "VIEIRA", "JUNIOR", "ANA", "LIVIA", "SOFIA", "CELEIDE", "GEORGIA", "RICARDO", "CELIO"};
        int candidatosSelecionado = 0; // nenhum selecionado ainda
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionado < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();


            if(salarioPretendido >= salarioBase) {
                candidatosSelecionado++;
                System.out.println("O candidato selecionado " + candidato + "Solicitou esse salário: " + salarioPretendido);
            }
            candidatoAtual++;
        }
    }

    public static  void imprimirSelecionado() {
        String [] candidatos = {"FELIPE", "MARCIA", "CELIO", "JOAO", "VIEIRA"};
        System.out.println("IMPRIMINDO LISTA DE CADIDATOS INFORMANDO O INDICE.");
//        int indice = 0;
        for (String candidato : candidatos)
            System.out.println("O CANDIDATO É O " + candidato);
    }

    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.00, 2200.0);
    }

    public static void propostaSalario(double salario){
        double salarioBase = 2000.0;

        if (salario > salarioBase) {
            System.out.println("LIGAR PARA O CANDIDATO.");
        }
        else if (salario == salarioBase) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
