package exercicio;

public class Conta {
    private String dono;
    public int numConta;
    private String tipo;
    private double saldo;
    private boolean status;


    public void estadoAtual(){
        System.out.println("---------------------------");
        System.out.println("Conta nº: "+this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("---------------------------\n\n");
    }


    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "CC") {
            this.setSaldo(50);
            
        } else if(tipo=="CP") {
            this.setSaldo(150);
            
        }
    }

    public void fecharConta(){
        if(this.getSaldo()>0){
            System.out.println("Conta não pode ser fechada pois ainda tem saldo");
        }else if(this.getSaldo()<0){
            System.out.println("Conta não pode ser fechada pois tem débito");
        }else{
            System.out.println("Conta encerrada com sucesso");
        }

    }

    public void depositar(double valor){
        if(this.status == true){
            this.setSaldo(this.getSaldo()+valor);
            System.out.println("Depósito realizado com sucesso na conta nº: "+getNumConta()+"\n");
        }else{
            System.out.println("Não foi possível realizar o depósito.\n");
        }
    }

    public void sacar(double valor){
        if(this.isStatus()){
            if(this.getSaldo()>=valor){
                this.setSaldo(this.getSaldo()-valor);
                System.out.println("Saque realizado com sucesso!\n");
            }else{
                System.out.println("Saldo insuficiente para realizar o saque.\n");
            }
    }else{
        System.out.println("Impossível sacar de uma conta fechada!\n");
        }
    }

    public void pagarMensal(){
        int v = 0;
        if(this.getTipo()=="CC"){
            v=12;
        }else if(this.getTipo()=="CP"){
            v = 20;
        }
        if(this.isStatus()){
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Mensalidade paga com sucesso pela conta nº: " + this.getNumConta());
        }else{
            System.out.println("Não é possível pagar uma conta fechada!");
        }

    }
    


    //Getters e Setters

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    //Construtores
    public Conta(){
        setSaldo(0);
        setStatus(false);        
    }



}
