package sozinho;

public class Produto {
    public String nome;
    public double preco;
    public int qtd;


    Produto(Double preco) {
        this.preco = preco;
    }

    Produto(String nome, Double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public double produtoTotal(Double preco, int qtd) {
        return (preco * qtd);
    }


}

