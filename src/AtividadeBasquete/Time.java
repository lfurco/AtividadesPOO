package AtividadeBasquete;

import java.util.ArrayList;

public class Time {

    private int id;             // ID do time
    private String nome;        // Nome do time
    private String tecnico;     // Técnico do time

    // Lista de atletas (AGREGAÇÃO)
    private ArrayList<Atleta> atletas;

    // Construtor Vazio
    public Time() {
        this.atletas = new ArrayList<>(); // Aloca espaço na memória
    }

    // Construtor
    public Time(int id, String nome, String tecnico) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
        this.atletas = new ArrayList<>();
    }

    // Método de agregação (recebe o atleta pronto)
    public void contratarAtleta(Atleta a){
        this.atletas.add(a);
        System.out.println("Atleta contratado com sucesso!");
    }

    // GETTERS e SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public ArrayList<Atleta> getAtletas() {
        return atletas;
    }

    // toString
    @Override
    public String toString() {
        return "Time{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tecnico='" + tecnico + '\'' +
                ", atletas=" + atletas +
                '}';
    }
}