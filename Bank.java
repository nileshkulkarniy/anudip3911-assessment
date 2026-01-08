public class Bank {
    private double amount;

    public Bank(double amount) {
        this.amount = amount;
    }
    public void withdraw(double withdrawalAmount) {
       
        String message = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance";
        System.out.println(message);

       
        if (withdrawalAmount <= amount) {
            amount = amount - withdrawalAmount;
        } 
        System.out.printf("After withdraw, available balance: %.1f%n", amount);
    }

    public void deposit(double depositAmount) {
        amount = amount + depositAmount;
        System.out.printf("After deposit, available balance: %.1f%n", amount);
    }

   
    public double getAmount() {
        return amount;
    }

   
    public static void main(String[] args) {
    
        Bank account = new Bank(10000.0);

        
        account.withdraw(5000.0);
        account.deposit(5000.0);
    }
}
