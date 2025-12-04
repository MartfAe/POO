package heranca;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public Aluno(String name, int age, char sex, int matricula, String curso){
        super(name, age, sex);
        this.matricula = matricula;
        this.curso = curso;
    }

    public Aluno(String name, int age, char sex, int matricula){
        this(name, age, sex, matricula, "Indeterminado");
    }

    public Aluno(String name, int age, char sex){
        this(name, age, sex, 0);
    }
    public Aluno(){
        super();
    }

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade de aluno");
    }

    public void cancelarMatricula(){
        System.out.println("Matricula cancelada!");

    }

    public int getMatricula(){
        return this.matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String getCurso(){
        return this.curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }


}
