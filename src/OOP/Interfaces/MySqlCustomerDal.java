package oop.interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepository {

  @Override
  public void add() {
    System.out.println("MySQL eklendi");
  }

}
