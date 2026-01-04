public class salaDeAulaTest {
    public static void main(String[] args) {
        
        SalaDeAula sala1 = new SalaDeAula();
        SalaDeAula sala2 = new SalaDeAula();
        SalaDeAula sala3 = new SalaDeAula();

        sala1.adicionarAluno();

        System.out.println("Sala 1:");
        sala1.exibirQtdAlunos();

        sala2.exibirQtdAlunos();

    }

}
