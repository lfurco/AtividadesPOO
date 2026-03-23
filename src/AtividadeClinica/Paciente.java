package AtividadeClinica;

public class Paciente {
    private int id;
    private String nome, cpf;


    public Paciente() {
    }

    public Paciente(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "AtividadeClinica.Paciente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}