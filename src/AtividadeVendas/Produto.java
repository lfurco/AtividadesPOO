package AtividadeVendas;

public class Produto {

    private int id;
    private String nome;
    private double preco;   // double pra valores

    public Produto() {
    }
    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    // Devolve o preço do produto
    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " (R$ " + preco + ")";
    }
}