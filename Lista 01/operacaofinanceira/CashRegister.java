package operacaofinanceira;

public class CashRegister {
    private double currentBalance;
    private int transactionCount;
    private String registerId;

    public CashRegister(double currentBalance, int transactionCount, String registerld){
        this.currentBalance = currentBalance;
        this.transactionCount = transactionCount;
        this.registerId = registerld;
    }

    public CashRegister(double currentBalance, int transactionCount){
        this(currentBalance, transactionCount, "DEFAULT-ID");
    }

    public CashRegister(double currentBalance){

    this(currentBalance, 0, "DEFAULT-ID");
    }

    public CashRegister(){
        this(0.0, 0, "DEFAULT-ID");
    }

    public void processPayment(double amount){
        if(amount> 0){
            currentBalance+=amount;
            transactionCount++;
            System.out.println("processPayment of $ "+amount + "processed");
        }else{
            System.out.println("Invalid value");
        }

    }

    public void processPayment(int amount){
        processPayment((double) amount);
    }

    public void processPayment(double amount, String description){
        if (amount >0){
            currentBalance += amount;
            transactionCount++;
            System.out.println("processPayment of $ "+ amount +" - " + description);
        }else{
            System.out.println("Invalid value");
        }

    }


    public void processRefund(double amount){
        if(amount >0 && amount <=currentBalance){
            currentBalance -=amount;
            transactionCount++;
            System.out.println("Process refund of $ "+amount+" processed");
        }else{
            System.out.println("Invalid value");
        }
    }


    public String getDailyReport(){
        return "\n===DAILY RePORT===\n"
        +"ID: "+ registerId
        +"\nCurrent Balance: $ "+currentBalance
        +"\nTransaction: "+transactionCount;
    }

    public double getCurrentBalance(){
        return currentBalance;
    }

    public int getTransactionCount(){
        return transactionCount;
    }

    public String getRegisterId(){
        return registerId;
    }


}
