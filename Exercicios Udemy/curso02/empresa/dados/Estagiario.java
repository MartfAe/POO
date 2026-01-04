package empresa.dados;

public class Estagiario {

    private String nome;
    private String matricula;
    private String curso;
    private int semestre;
    private double bolsaAuxilio;
    private int diasTrabalhados;


    //Construtores

    public Estagiario(){

    }

    public Estagiario(String nome, String matricula, String curso, int semestre, double bolsaAuxilio, int diasTrabalhados){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.semestre = semestre;
        this.bolsaAuxilio = bolsaAuxilio;
        this.diasTrabalhados = diasTrabalhados;

    }

    public Estagiario(String nome, String matricula, String curso, int semestre){
        this(nome, matricula, curso, semestre, 950.00, 24);
        
    }


    //getters e setters

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getCurso(){
        return curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public int getSemestre(){
        return semestre;
    }
    public void setSemestre(int semestre){
        this.semestre = semestre;
    }
    public double getBolsaAuxilio(){
        return bolsaAuxilio;
    }
    public void setBolsaAuxilio(double bolsaAuxilio){
        this.bolsaAuxilio = bolsaAuxilio;
    }
    public double getValeTransporte(){
        return diasTrabalhados * 6.00;
    }
    public int getDiasTrabalhados(){
        return diasTrabalhados;
    }
    public void setDiasTrabalhados(int diasTrabalhados){
        this.diasTrabalhados = diasTrabalhados;
    }

    public String obterInformEstag(){
        return "Nome: " + nome + 
               "\nMatrícula: " + matricula + 
               "\nCurso: " + curso + 
               "\nSemestre: " + semestre + 
               "\nBolsa Auxílio: R$ " + String.format("%.2f", bolsaAuxilio) + 
               "\nVale Transporte: R$ " + String.format("%.2f", getValeTransporte()) + 
               "\nDias Trabalhados: " + diasTrabalhados;
    }





}
