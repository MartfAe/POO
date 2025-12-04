package heranca;

public class Professor extends Pessoa {
    private float salario;
    private String especialidade;

    public Professor(String name, int age, char sex, float salario, String especialidade){
        super(name, age, sex);
        this.salario = salario;
        this.especialidade = especialidade;
    }


    public Professor(String name, int age, char sex, float salario){
        this(name, age, sex, salario, "Indefinida");
    }

    public Professor(String name, int age, char sex){
        this(name, age, sex, 0);
    }

    public Professor(){
        super();
    }

    public void receberAumento(int percentualAumento){
        float novoSalario;
        novoSalario = this.salario+ (this.salario*(percentualAumento*0.01f));
        setSalario(novoSalario);
    }

        public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }




}
