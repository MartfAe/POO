public class CashRegister {
    private double currentBalance;
    private int transactionCount;
    private String registerId;

    public CashRegister(double currentBalance, int transactionCount, String registerId){
        this.currentBalance = currentBalance;
        this.transactionCount = transactionCount;
        this.registerId = registerId;
    }

    public CashRegister(double currentBalance, int transactionCount){
        this(currentBalance, transactionCount, null);
    }

    public CashRegister(double currentBalance){
        this(currentBalance, 0, null);
    }
    // Métodos de pagamento
    public void processPayment(double amount){
        this.currentBalance +=amount;
        this.transactionCount++;
        System.out.println("[Pagamento] R$" + amount + ". Novo saldo: R$"+currentBalance);
    }
// Sobrecarga para pagamento com valor inteiro
    public void processPayment(int amount){
        this.processPayment((double)amount);
    }

    // Sobrecarga com descrição
    public void processPayment(double amount, String description){
        this.currentBalance += amount;
        this.transactionCount++;
        System.out.println("[Pagamento] R$" + amount + " - " + description + ". Novo saldo: R$"+currentBalance);
    }
// Métodos de reembolso
    public void processRefund(double amount){
        this.currentBalance -= amount;
        this.transactionCount++;
        System.out.println("[Reembolso] R$" + amount + ". Novo saldo: R$"+currentBalance);
    }
// Sobrecarga para reembolso com valor inteiro
    public void processRefund(int amount){
        this.processRefund((double)amount);
    }
// Sobrecarga para reembolso com descrição
    public void processRefund(double amount, String description){
        this.currentBalance -=amount;
        this.transactionCount++;
        System.out.println("[Reembolso] R$" + amount + " - "+ description + ". Novo saldo: R$" +currentBalance);
    }

    public void getDailyReport(){
        System.out.println("Relatório Diário - Conta: "+(registerId != null ? registerId : "Não informado"));
        System.out.println("Saldo Atual: R$"+currentBalance);
        System.out.println("Total de Transações: "+transactionCount);
    }
}
