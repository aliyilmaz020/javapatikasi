package OOP.Interfaces;

public class OracleCustomerDal implements ICustomerDal {

  @Override
  public void add() {
    System.out.println("Oracle eklendi");
  }

}
