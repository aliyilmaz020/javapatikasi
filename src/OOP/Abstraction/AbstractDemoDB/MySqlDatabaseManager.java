package OOP.Abstraction.AbstractDemoDB;

public class MySqlDatabaseManager extends BaseDatabaseManager {

  @Override
  public void getData() {
    System.out.println("Veri getirildi: My SQL");
  }

}
