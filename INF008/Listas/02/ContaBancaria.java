public class ContaBancaria {

    private String numero;
    private double saldo;
    private String tipo;

    public ContaBancaria(String numero, String tipo){
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = 0.0;
    }

    public ContaBancaria(String numero, String tipo, double saldoInicial){
        this(numero, tipo);
        if(saldoInicial<=0){
            return;
        }
        this.saldo = saldoInicial;
    }


    private boolean validarValor(double valor){
       return valor >0;
    }

    
    public void depositar(double valor){
        if(validarValor(valor) == false) return;
        this.saldo+=valor;
    }

    public void depositar(double valor, String descricao){
        this.depositar(valor);
        if(validarValor(valor)){
            System.out.println("Descrição: " + descricao);
        }
    }


    public String getNumero(){
        return numero;
    }

    public String getTipo(){
        return tipo;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }



}
