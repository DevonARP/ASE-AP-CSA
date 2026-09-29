public class Main {
    
  public static void main(String args[]) {
      
    BankAccount accountA = new BankAccount("Maya", 0);
    
    System.out.println(accountA.getBalance()); 
    
    
    
}

    static public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double startingBalance) {
        this.owner = owner;
        balance = startingBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void setOwner(String newOwner) {
        owner = newOwner;
    }
}

}
