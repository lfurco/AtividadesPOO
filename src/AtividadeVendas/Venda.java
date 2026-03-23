package AtividadeVendas;

import java.util.ArrayList;

public class Venda {

    private Cliente cliente;    // Agregação
    private ArrayList<ItemVenda> itemVendas;    // Composição

    // Construtor
    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.itemVendas = new ArrayList<>();
    }

    // Método de COMPOSIÇÃO
    public void adicionarItem(int id, int quantidade, Produto produto){

        // Cria o item dentro da venda
        ItemVenda item = new ItemVenda(id, quantidade, produto);

        this.itemVendas.add(item);

        System.out.println("Item adicionado!");
    }


    @Override
    public String toString() {
        return "Venda{" +
                "cliente=" + cliente +
                ", itemvendas=" + itemVendas +
                '}';
    }
}
