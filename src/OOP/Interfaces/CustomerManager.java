package OOP.Interfaces;

public class CustomerManager {
  private ICustomerDal customerDal;

  public CustomerManager(ICustomerDal customerDal) {
    this.customerDal = customerDal;
  }

  public void add() {
    // İş kodları yazılır
    this.customerDal.add();
  }
}
