package challenges.challangle02;

public class bankAccount {
    private String accountNumber;
    private String accountHolderName;
    private  double balance;

    public bankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public void depositMoney(double amount){
     if (amount > 0){
            balance += amount;
     }else {
            System.out.println("Invalid amount");
     }
    }
    public  double withdrawMoney(double amount){
        if (balance >= amount){
            balance -= amount;
            return amount;
        }
        return 0;
    }

    @Override
    public String toString() {
        return STR."Account Status : balance = \{balance}";
    }
}
