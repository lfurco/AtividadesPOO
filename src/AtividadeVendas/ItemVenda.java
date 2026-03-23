package AtividadeVendas;

public class ItemVenda {
    private int id, quantidade;

    private Produto produto;     // AGREGAÇÃO (produto vem pronto)

    public ItemVenda() {
    }

    public ItemVenda(int id, int quantidade, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    // Para calcular quantidade * preco  ||  Atividade não pediu mas quis fz
    public double calcularSubtotal() {
        return quantidade * produto.getPreco();
    }



    @Override
    public String toString() {
        return "ItemVenda{" +
                "id=" + id +
                ", quantidade=" + quantidade +
                ", produto=" + produto +
                '}';
    }
}

