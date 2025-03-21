package orientacaoObjetos.lanchonete;

import orientacaoObjetos.lanchonete.atendimento.cozinha.Almoxarife;
import orientacaoObjetos.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {

        Cozinheiro cozinheiro = new Cozinheiro();

        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarComboNoBalcao();
        cozinheiro.baterVitaminasNoLiquidificador();
        cozinheiro.fritarIngredientesDoLanche();
        cozinheiro.limparIngredientes();

        // Cozinheiro precisa se mostrar-se no balcão?
        cozinheiro.adicionarComboNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();


        Almoxarife almoxarife = new Almoxarife();

//        almoxarife.trocarGas();
        almoxarife.controlarSaida();
        almoxarife.controlarEntrada();

        // Almoxarife precisa se mostrar-se no balcão?
        cozinheiro.entregarIngredientes(almoxarife);

        Atendente atendente = new Atendente();

        //
        cozinheiro.pedirTrocarGas(almoxarife);
        cozinheiro.pedirTrocarGas(atendente);
    }
}
