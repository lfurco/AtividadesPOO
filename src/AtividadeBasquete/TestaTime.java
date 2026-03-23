package AtividadeBasquete;

public class TestaTime {

    public static void main(String[] args) {
        // Criei Atleta
        Atleta a1 = new Atleta(1, "Lucas", "Armador");

        // Criei Time
        Time t1 = new Time(10, "Franca Basquete", "Fulano");

        // Quando contrata o Atleta = Vira um a1 (atleta)
        t1.contratarAtleta(a1);

        t1 = null;   // Ao apagar o time, o atleta continua existindo (AGREGAÇÃO)

        // Teste
        System.out.println(a1);
    }
}