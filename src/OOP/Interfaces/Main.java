package oop.interfaces;

public class Main {
  public static void main(String[] args) {
    CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
    customerManager.add();
  }
}
// NullPointerException
// Operasyonu implement edilmesi gerektiğinde kullanılır
// SQL server