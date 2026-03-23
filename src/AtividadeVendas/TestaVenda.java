package AtividadeVendas;

public class TestaVenda {

    public static void main(String[] args) {

        // Produtos (independentes)
        Produto p1 = new Produto(1, "Arroz", 20);
        Produto p2 = new Produto(2, "Feijão", 10);

        // Cliente (independente)
        Cliente c1 = new Cliente(1, "Lucas");

        // Venda
        Venda v1 = new Venda(c1);

        // Adicionando itens (COMPOSIÇÃO)
        v1.adicionarItem(1, 2, p1);
        v1.adicionarItem(2, 3, p2);

        // Mostrar tudo
        System.out.println(v1);
    }
}