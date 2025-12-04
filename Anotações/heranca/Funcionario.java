package heranca;

public class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhando;

    public Funcionario(String name, int age, char sex, String setor, boolean trabalhando){
        super(name, age, sex);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }
    public Funcionario(String name, int age, char sex, String setor){
        this(name, age, sex, setor, false );
    }
    public Funcionario(String name, int age, char sex){
        this(name, age, sex, "Indefinido");
    }

    public Funcionario(){
        super();
    }

    public void mudaTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }

    public String getSetor(){
        return this.setor;
    }

    public void setSetor(String setor){
        this.setor = setor;
    }

    public boolean isTrabalhando(){
        return this.trabalhando;
    }

    public void setTrabalhando(boolean trabalhando){
        this.trabalhando = trabalhando;
    }

}
