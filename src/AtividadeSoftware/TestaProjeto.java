package AtividadeSoftware;

public class TestaProjeto {

    public static void main(String [] args){

        // Criando programadores
        Programador p1 = new Programador(12, "Lucas", "C+");
        Programador p2 = new Programador(13, "Bianca", "Python");

        // Criando Projeto
        Projeto proj = new Projeto(771, "Projeto X"); // Null se n tiver programadores

        // Contratando os Programadores
        proj.contratarProgramador(p1);
        proj.contratarProgramador(p2);

        // Teste
        proj.listarProgramadores();
    }
}
