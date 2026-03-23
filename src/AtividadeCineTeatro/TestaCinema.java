package AtividadeCineTeatro;

import java.time.LocalDateTime;

public class TestaCinema {

    public static void main(String[] args) {

        // Criando filmes (independentes)
        Filme f1 = new Filme(1, 120, "Batman", "Ação");
        Filme f2 = new Filme(2, 150, "Duna", "Ficção");

        // Criando sessão (data futura)
        LocalDateTime data = LocalDateTime.of(2026, 7, 20, 20, 0);

        Sessao s1 = new Sessao(1, data, 1);
        Sessao s2 = new Sessao(2, data, 2);

        // AGREGAÇÃO → vincular filme
        s1.vincularFilme(f1);   // Batman
        s2.vincularFilme(f2);   // Duna

        // COMPOSIÇÃO → vender ingressos
        s1.venderIngresso(1, "A1", "Inteira", 30);
        s1.venderIngresso(2, "A2", "Meia", 15);
        s1.venderIngresso(3, "A3", "Inteira", 30);
        s2.venderIngresso(4, "A33", "Meia", 15);

        // Mostrar tudo
        System.out.println(s1);
        System.out.println("\n" + s2);
    }
}