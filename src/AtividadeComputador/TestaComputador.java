package AtividadeComputador;

public class TestaComputador {

    public static void main(String[] args) {

        // Criando o computador (o processador nasce dentro dele, então colocamos ambos)
        Computador pc = new Computador(
                1,
                "Dell",
                "Intel",
                "i7",
                "3.5GHz"
        );

        // Mostrando o computador (já mostra o processador junto)
        System.out.println(pc);
    }
}