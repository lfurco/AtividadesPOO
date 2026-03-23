package AtividadeCineTeatro;

public class Ingresso {     // Objeto Parte
    private int id;
    private String assento, tipo;   // A2 e "Inteira ou Meia"
    private float preco;        // Poderia ser double mas pediu float

    public Ingresso() {
    }

    public Ingresso(int id, String assento, String tipo, float preco) {
        this.id = id;
        this.assento = assento;
        this.tipo = tipo;
        this.preco = preco;
    }



    @Override
    public String toString() {
        return "Ingresso{" +
                "id=" + id +
                ", assento='" + assento + '\'' +
                ", tipo='" + tipo + '\'' +
                ", preco=" + preco +
                '}';
    }
}
