public class CurrentAccount extends BankAccount{
    double WITHDRAWAL_LIMIT = 5000;

    public CurrentAccount(int accountNumber,String holderName,double balance){
        super(accountNumber,holderName,balance);
    }

    @Override
    public  void deposit(double amount) {
     setBalance(getBalance()+amount);
        System.out.println("Deposited " + amount + ". New Balance: " + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        setBalance(getBalance()-amount);
        System.out.println("Withdrawal : " + amount + ". New Balance: " + getBalance());
    }




}
