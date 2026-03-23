package AtividadeBiblioteca;

import java.time.LocalDateTime;

public class TestaBiblioteca {

    public static void main(String[] args) {
        // Criar leitor
        Leitor l1 = new Leitor(1, "Lucas");

        // Criar livro
        Livro livro1 = new Livro(10, "Introdução à Programação com Python", "Nilo Ney");

        // Criar datas
        LocalDateTime dataEmprestimo = LocalDateTime.now();
        LocalDateTime devolucao = LocalDateTime.of(2026, 5, 30, 10, 0);

        // Criar empréstimo
        Emprestimo e1 = new Emprestimo(dataEmprestimo, devolucao, l1, livro1);

        // Mostrar
        System.out.println(e1);
    }
}