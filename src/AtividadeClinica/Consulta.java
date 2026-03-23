package AtividadeClinica;

import java.time.LocalDateTime;

public class Consulta {

    private LocalDateTime data;
    private double valorConsulta;   // double = int

    // Associação com outras classes - Referências
    private Medico medico;
    private Paciente paciente;


    public Consulta() {
    }

    public Consulta(LocalDateTime data, double valorConsulta, Medico medico, Paciente paciente) {
        this.data = data;
        this.valorConsulta = valorConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "AtividadeClinica.Consulta{" +
                "data=" + data +
                ", valorConsulta=" + valorConsulta +
                ", medico=" + medico +
                ", paciente=" + paciente +
                '}';
    }
}