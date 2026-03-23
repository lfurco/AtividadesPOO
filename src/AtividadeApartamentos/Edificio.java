package AtividadeApartamentos;

import java.util.ArrayList;

public class Edificio {
    private String nome, endereco;

    // Para agregar varios apartamentos
    private ArrayList<Apartamento> apartamentos;

    // Construtor no ArrayList
    public Edificio() {
        this.apartamentos = new ArrayList<>();
    }

    // Construtor já mudado e completo
    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    // Método de COMPOSIÇÃO
    public void construirApartamento(int num, int andar){

        // Criando o apartamento DENTRO do edifício
        Apartamento ap = new Apartamento(num, andar);

        // Adicionando na lista
        this.apartamentos.add(ap);

        System.out.println("Apartamento construído com sucesso!");
    }


    @Override
    public String toString() {
        return "Edificio{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", apartamentos=" + apartamentos +
                '}';
    }
}
