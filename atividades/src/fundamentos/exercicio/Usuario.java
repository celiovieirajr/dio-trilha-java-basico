package fundamentos.exercicio;

public class Usuario {
    public static void main(String[] args) {

        SmartTV smartTv = new SmartTV();
//        smartTv.ligada = true;

        smartTv.ligar();
        smartTv.desligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);
        smartTv.aumentarDeCanal();
        smartTv.diminuirCanal();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Qual é o som? " + smartTv.volume);
    }
}
