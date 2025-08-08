public class BankAccount {
    private String accountHolderName;
    private Double bankBalance;

public BankAccount(String accountHolderName , Double bankBalance){
this.accountHolderName = accountHolderName;
this.bankBalance =bankBalance;

}
public double getBalance(){
    return  bankBalance;
}
private void setBankBalance(double bankBalance){
    this.bankBalance =bankBalance;
}
public void deposit(double amount){
    if(amount>0){
    setBankBalance(getBalance() + amount);}
}

public void withdraw(double amount){
    if(amount<bankBalance){
    setBankBalance(getBalance() - amount);
}
}


    public void displayInfo(){
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: $" + bankBalance);
    }

}