package cadastro;

public class Aluno {
    
    public String nome;
    private double notaFinal;

    public Aluno(String nome, double nota){
        this.nome = nome;
        this.notaFinal = nota;
    }

    private boolean validarNota(){
        return notaFinal>= && notaFinal<=10;
    }

    public void exibirInfo(){
        System.out.println("Nome: "+nome + " | NOTA: " +notaFinal);
    }

}
