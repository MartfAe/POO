package Lista02;



public class ContaBancaria {
    private String numero;
    private double saldo;
    private String tipo; // "CORRENTE" ou "POUPANCA"


    public ContaBancaria(String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = 0.0;
    }


    public ContaBancaria(String numero, String tipo, double saldoInicial) {

        this(numero, tipo);
        if(saldoInicial<0){
            System.out.println("Valor inválido.");
        }
        this.saldo= saldoInicial;
    }

    private boolean validarValor(double valor){
        return valor >0;
    }

    public void depositar(double valor){
        if(validarValor(valor)){
            this.saldo += valor;
        }else{
            System.out.println("Valor de depósito inválido");
        }

    }

    public void depositar(double valor, String descricao){
        if(validarValor(valor)){
            this.saldo += valor;
            System.out.println("Depósito: " + descricao);
        }else{
            System.out.println("Valor de depósito inválido.");
        }
    }


    //Getters

    public String getNumero(){return numero;}
    public double getSaldo(){return saldo;}


}