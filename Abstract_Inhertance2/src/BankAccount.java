public abstract class BankAccount {
   private int  accountNumber;
   private String holderName;
   private double balance;

   public BankAccount(int accountNumber, String holderName, double balance) {
      this.accountNumber = accountNumber;
      this.holderName = holderName;
      this.balance = balance;
   }

   //Getter Setter
   public double getBalance() {
      return balance;
   }

   public void setBalance(double balance) {
      this.balance = balance;
   }

   public String getHolderName() {
      return holderName;
   }

   public void setHolderName(String holderName) {
      this.holderName = holderName;
   }

   public int getAccountNumber() {
      return accountNumber;
   }

   public void setAccountNumber(int accountNumber) {
      this.accountNumber = accountNumber;
   }

   // Abstract methods
   public abstract void deposit(double amount);
   public abstract void withdraw(double amount);

   // Method to display account details
   public void displayAccountDetails() {
      System.out.println("Account Number: " + accountNumber);
      System.out.println("Holder Name: " + holderName);
      System.out.println("Balance: " + balance);
   }
   static void plusminus(){
      System.out.println("this is super plus minus.");
   }
}
