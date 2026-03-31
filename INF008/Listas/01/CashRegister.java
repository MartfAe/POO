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
    

}
