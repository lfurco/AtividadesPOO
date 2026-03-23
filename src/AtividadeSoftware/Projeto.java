package AtividadeSoftware;

import java.util.ArrayList;

public class Projeto {

    private int id;
    private String nomeProjeto;

    // Para agregar varios programadores
    private ArrayList<Programador> programadores;

    // Construtor pro ArrayList (Vazio)
    public Projeto() {
        this.programadores = new ArrayList<>();
    }

    // Construtor > Tem q mudar (Não pode ser automatico, já q o ArrayList ficaria null)
    public Projeto(int id, String nomeProjeto) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.programadores = new ArrayList<>();
    }

    // Método para contratar o programador
    public void contratarProgramador(Programador p){
        this.programadores.add(p);
        System.out.println("Programador contratado com sucesso!");
    }

    // Método para listar todos os programadores do projeto
    public void listarProgramadores(){
        // Percorre a lista de programadores
        for(Programador p : programadores){
            System.out.println(p); // Mostra cada programador (usa o toString)
        }
    }

    // GETTERS and SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public ArrayList<Programador> getProgramadores() {
        return programadores;
    }

    public void setProgramadores(ArrayList<Programador> programadores) {
        this.programadores = programadores;
    }


    @Override
    public String toString() {
        return "Projeto{" +
                "id=" + id +
                ", nomeProjeto='" + nomeProjeto + '\'' +
                ", programadores=" + programadores +
                '}';
    }
}
