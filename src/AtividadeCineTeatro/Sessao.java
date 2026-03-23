package AtividadeCineTeatro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Sessao {

    private int id;
    private LocalDateTime horario;
    private int sala;

    // AGREGAÇÃO (filme vem pronto)
    private Filme filme;

    // COMPOSIÇÃO (lista de ingressos)
    private ArrayList<Ingresso> ingressos;

    // Construtor
    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.ingressos = new ArrayList<>();
    }

    // 🔹 AGREGAÇÃO
    public void vincularFilme(Filme f){
        this.filme = f;  // recebe objeto pronto
    }

    // 🔹 COMPOSIÇÃO
    public void venderIngresso(int id, String assento, String tipo, float preco){

        // cria o ingresso DENTRO da sessão
        Ingresso ing = new Ingresso(id, assento, tipo, preco);

        this.ingressos.add(ing);

        System.out.println("Ingresso vendido!");
    }



    @Override
    public String toString() {
        // Para deixar o LocalData de forma BR
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'mm");
        return "Sessao{" +
                "id=" + id +
                ", horario=" + horario.format(formatoBR) +
                ", sala=" + sala +
                ", filme=" + filme +
                ", ingressos=" + ingressos +
                '}';
    }
}