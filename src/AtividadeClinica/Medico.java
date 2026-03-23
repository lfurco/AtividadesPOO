package AtividadeClinica;

public class Medico {
    private int id;
    private String nome;
    private String especialidade;


    public Medico() {
    }

    public Medico(int id, String nome, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "AtividadeClinica.Medico{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }
}

