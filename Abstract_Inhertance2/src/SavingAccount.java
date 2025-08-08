public class SavingAccount extends BankAccount {
    private static final double WITHDRAWAL_LIMIT = 5000;

    public SavingAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }



    @Override
    public void withdraw(double amount) {
    if (amount>WITHDRAWAL_LIMIT){
        System.out.println("Withdrawal Amount must be Under 5000. ");
    }if (amount>0 && amount<WITHDRAWAL_LIMIT){
        setBalance(getBalance()-amount);
            System.out.println("Withdrawal : " + amount + ". New Balance: " + getBalance());
        }
    }

    @Override
    public void deposit(double amount) {
     if (amount>0){
         setBalance(getBalance()+ amount);
         System.out.println("Deposited " + amount + ". New Balance: " + getBalance());
     }
    }


}
