package jdbcIntro;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
  public static void main(String[] args) throws SQLException {
    Connection connection = null;
    DbHelper helper = new DbHelper();
    Statement statement = null; // Sql cümlesi ile ilgili işlemleri yapar
    ResultSet resultSet; // İşlem sonucundaki veriseti
    try {
      connection = helper.getConnection();
      // System.out.println("Bağlantı oluştu");
      statement = connection.createStatement(); // Bağlantıdan statement oluşturdu
      resultSet = statement.executeQuery("select code,name,continent,region from country"); // query i çalıştırır
      while (resultSet.next()) { // Datayı tek tek geziyor
        System.out.println(resultSet.getString("continent")); // continent sütunu yazdırır
      }
    } catch (SQLException exception) {
      helper.showErrorMessage(exception);
    } finally {
      connection.close();
    }
  }
}
