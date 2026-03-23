package AtividadeClinica;

import java.time.LocalDateTime;

public class TestaClinica {

    public static void main(String[] args) {
        // Criei Médico
        Medico m1 = new Medico(27, "Gerego", "Atendente");

        // Criei AtividadeClinica.Paciente
        Paciente p1 = new Paciente(88, "Lucas", "123.123.123-95");

        // Marquei AtividadeClinica.Consulta
        LocalDateTime data = LocalDateTime.of(2026, 5, 20, 10, 0);

        // Criei AtividadeClinica.Consulta
        Consulta c1 = new Consulta(data, 180, m1, p1);

        // Teste de vdd
        System.out.println(c1);
    }

}