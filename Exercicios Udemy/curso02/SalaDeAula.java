public class SalaDeAula {
    private static int qtdAlunos = 0;


    public static void adicionarAluno(){
        qtdAlunos++;
    }

    public static void exibirQtdAlunos() {
        System.out.println("Quantidade de alunos na sala: " + qtdAlunos);
    }


}
