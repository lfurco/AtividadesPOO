package AtividadeComputador;

public class Computador {

    private int id;
    private String marca;
    private Processador processador; // Composição

    public Computador() {
    }

    // Construtor (Com os Strings do Processador, já q vamos criar ele)
    public Computador(int id, String marca, String marcaProc, String modeloProc, String freqProc) {
        this.id = id;
        this.marca = marca;

        // 🔥 COMPOSIÇÃO:
        // Processador criado DENTRO do computador
        this.processador = new Processador(marcaProc, modeloProc, freqProc);
    }

    // Até poderia colocar GETTERS, mas SETTERS faria com que colocasse processadores de fora = agragação ❌

    @Override
    public String toString() {
        return "Computador{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", processador=" + processador +
                '}';
    }
}