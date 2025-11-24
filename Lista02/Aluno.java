package Lista02;

public class Aluno {
    private String matricula;
    private String nome; 
    private int idade;
    private String curso;

    public Aluno(String matricula, String nome, int idade, String curso){
        validarMatricula(matricula);
        this.matricula = matricula;
        this.nome = nome; 
        this.idade = idade;
        this.curso = curso;
    }

    public Aluno(String matricula, String nome, int idade){
        this(matricula, nome, idade, "indefinido");
    }

    public Aluno(String matricula, String nome){
        this(matricula, nome, 0);
    }

    private void validarMatricula(string matricula){
        if(matricula == null || matricula.trim().isEmpty()){
            System.out.println("Matrícula inválida");
        }
    }


    public String getMatricula() { return matricula; }
    public String getNome() { return nome;}
}
