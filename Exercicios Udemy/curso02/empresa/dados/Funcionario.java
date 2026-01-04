package empresa.dados;

public class Funcionario {
    private String nome;
    private int idade;
    private String cargo;
    private double salario;
    private int tempoDeServico;
    private int diasTrabalhados;

//Contrutores
    public Funcionario(){

    }

    public Funcionario(String nome, int idade, String cargo, double salario, int tempoDeServico, int diasTrabalhados){
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
        this.tempoDeServico = tempoDeServico;
        this.diasTrabalhados = diasTrabalhados;
    }

    public Funcionario(String nome, int idade, String cargo, double salario, int diasTrabalhados){
        this(nome, idade, cargo, salario, 1, diasTrabalhados);
    }


//Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if(salario < 0){
            System.out.println("Salário não pode ser negativo.");
            return;
        }
        this.salario = salario;
    }

    public int getTempoDeServico() {
        return tempoDeServico;
    }
    public void setTempoDeServico(int tempoDeServico) {
        this.tempoDeServico = tempoDeServico;
    }
    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }
    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }
    public double getBonus() {
        return (tempoDeServico >= 3) ? salario * 0.25 : salario * 0.10;
    }

    public double getValeTransporte(){
        return (diasTrabalhados * 6.00);
    }

    public double getSalarioFinal(){
        return salario + getBonus() + getValeTransporte();
    }

    public void aumentarSalario(int percentual){
        if(percentual>0){
            setSalario(this.salario +(this.salario * percentual/100));
        }
    }

    public void aumentarSalario(double valorAumento){
        if(valorAumento>0){
            setSalario(this.salario + valorAumento);
        }
    }

    public static void alterarSalario(Funcionario funcionario, double novoSalario){
        if(novoSalario >= 0){
            funcionario.setSalario(novoSalario);
        } else {
            System.out.println("Salário não pode ser negativo.");
        }
    }
    

}
