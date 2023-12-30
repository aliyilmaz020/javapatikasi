package throwDemo;

public class BalanceInsufficentExpection extends Exception {
  String message;

  public BalanceInsufficentExpection(String message) {
    this.message = message;
  }

  @Override
  public String getMessage() {
    return this.message;
  }
}
