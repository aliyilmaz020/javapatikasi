package throwDemo;

public class AccountManager {
  private double balance;

  public void deposit(double amount) {
    this.balance = getBalance() + amount;
  }

  public void withdraw(double amount) throws Exception {
    if (balance >= amount) {
      this.balance = getBalance() - amount;
    } else {
      throw new Exception("Bakiye yetersiz.");
    }

  }

  public double getBalance() {
    return balance;
  }
}
