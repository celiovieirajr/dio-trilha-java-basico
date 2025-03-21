package orientacaoObjetos.lanchonete.atendimento.cozinha;

import orientacaoObjetos.lanchonete.Atendente;

public class Cozinheiro {

    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE NATURAL NO BALCÃO");
    };

    public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }

    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    public void prepararLanche() {
        System.out.println("PREPARANDO HAMBUER");
    }

    public void prepararVitamina() {
        System.out.println("PREPARANDO VITAMINAS");
    }

    public void selecionarIngredientesLanche() {
        System.out.println("SELECIONANDO PÃO HAMBURGUER OVO CHEDDAR E POUCO DE BACON");
    }

    public void selecionarIngredientesSuco() {
        System.out.println("UM SUCO DE LARANJA É MUITO BOM!");
    }

    public void selecionarIngredientesVitamina() {
        System.out.println("UMA VITA DE MARACUJA");
    }

    public void baterVitaminasNoLiquidificador() {
        System.out.println("PEGA TUDO E BATE!");
    }

    public void limparIngredientes() {
        System.out.println("LAVA TUDO OS INGREDIENTES");
    }

    public void fritarIngredientesDoLanche() {
        System.out.println("FRITA TUDOO");
    }

    public void pedirTrocarGas(Atendente amigo) {
        amigo.trocarGas();
    }

    public void pedirTrocarGas(Almoxarife almoxarife) {
        almoxarife.trocarGas();
    }

    public void entregarIngredientes(Almoxarife almoxarife) {
        System.out.println("ENTREGA");
    }




}
