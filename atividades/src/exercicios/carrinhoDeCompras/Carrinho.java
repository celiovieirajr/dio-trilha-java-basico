package exercicios.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Item> itens;

    public Carrinho() {
        this.itens = new ArrayList<>(); // instanciando o array
    }

    public void exibirItens() {
        if (!itens.isEmpty()) {
            System.out.println(itens);
        } else {
            System.out.println("Carrinho vazio!");
        }
    }

    public void adicionarCarrinho(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public double calcularValorTotal() {
        if (!itens.isEmpty()) {
            double valorTotal = 0;
            for (Item item : itens) {
                valorTotal += item.getPreco() * item.getQuantidade();
            }
            return valorTotal;
        }
        return 0;
    }

    public void removerItem(String nome) {
        List<Item> itensRemove = new ArrayList<>();
        if (!itens.isEmpty()) {
            for (Item i : itens) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensRemove.add(i);
                } else {
                    System.out.println("Produto inexistente");
                }
            }
            itens.removeAll(itensRemove);
        } else {
            System.out.println("Lista vazia!");
        }
    }


    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho();

        carrinho.exibirItens();
        carrinho.adicionarCarrinho("Primeiro", 30, 2);
        carrinho.exibirItens();
        System.out.println(carrinho.calcularValorTotal());
        carrinho.removerItem("Primeiro");
        carrinho.exibirItens();

    }
}
