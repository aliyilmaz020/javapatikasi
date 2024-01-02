package jdbcIntro;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
  public static void main(String[] args) throws SQLException {
    Connection connection = null;
    DbHelper helper = new DbHelper();
    Statement statement = null;
    ResultSet resultSet;
    try {
      connection = helper.getConnection();
      // System.out.println("Bağlantı oluştu");
      statement = connection.createStatement();
      resultSet = statement.executeQuery("select code,name,continent,region from country");
      while (resultSet.next()) {
        System.out.println(resultSet.getString("continent"));
      }
    } catch (SQLException exception) {
      helper.showErrorMessage(exception);
    } finally {
      connection.close();
    }
  }
}
