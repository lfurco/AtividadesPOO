package AtividadeApartamentos;

public class TestaEdificio {

    public static void main(String[] args) {

        // Criando edifício
        Edificio ed = new Edificio("Residencial Azul", "Rua A");

        // Construindo apartamentos (COMPOSIÇÃO)
        ed.construirApartamento(101, 1);
        ed.construirApartamento(202, 2);
        ed.construirApartamento(303, 3);

        // Mostrar tudo
        System.out.println(ed);
    }
}