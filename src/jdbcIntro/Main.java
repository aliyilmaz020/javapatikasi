package jdbcIntro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) throws SQLException {
    Connection connection = null;
    DbHelper helper = new DbHelper();
    PreparedStatement statement = null; // Sql cümlesi ile ilgili işlemleri yapar
    ResultSet resultSet; // İşlem sonucundaki veriseti
    try {
      connection = helper.getConnection();
      String sql = "update city set population=80000,district='Pamukkale' where id = 4098";
      statement = connection.prepareStatement(sql);
      int result = statement.executeUpdate();
      // System.out.println(result);
      System.out.println("Kayıt güncellendi");
    } catch (SQLException exception) {
      helper.showErrorMessage(exception);
    } finally {
      statement.close();
      connection.close();
    }
  }

  public static void insertData() throws SQLException {
    Connection connection = null;
    DbHelper helper = new DbHelper();
    PreparedStatement statement = null; // Sql cümlesi ile ilgili işlemleri yapar
    ResultSet resultSet; // İşlem sonucundaki veriseti
    try {
      connection = helper.getConnection();
      String sql = "insert into city (Name,CountryCode,District,Population) values(?,?,?,?)";
      statement = connection.prepareStatement(sql);
      statement.setString(1, "Denizli");
      statement.setString(2, "TUR");
      statement.setString(3, "Denizli");
      statement.setInt(4, 1200000);
      int result = statement.executeUpdate();
      // System.out.println(result);
      System.out.println("Kayıt eklendi");
    } catch (SQLException exception) {
      helper.showErrorMessage(exception);
    } finally {
      statement.close();
      connection.close();
    }
  }

  public static void selectDemo() throws SQLException {
    Connection connection = null;
    DbHelper helper = new DbHelper();
    Statement statement = null; // Sql cümlesi ile ilgili işlemleri yapar
    ResultSet resultSet; // İşlem sonucundaki veriseti
    try {
      connection = helper.getConnection();
      // System.out.println("Bağlantı oluştu");
      statement = connection.createStatement(); // Bağlantıdan statement oluşturdu
      resultSet = statement.executeQuery("select code,name,continent,region from country"); // query i çalıştırır
      ArrayList<Country> countries = new ArrayList<Country>();
      while (resultSet.next()) { // Datayı tek tek geziyor
        countries.add(new Country(
            resultSet.getString("code"),
            resultSet.getString("name"),
            resultSet.getString("continent"),
            resultSet.getString("region")));
        // System.out.println(resultSet.getString("continent")); // continent sütunu
        // yazdırır
      }

      System.out.println(countries.size());
    } catch (SQLException exception) {
      helper.showErrorMessage(exception);
    } finally {
      connection.close();
    }
  }
}
