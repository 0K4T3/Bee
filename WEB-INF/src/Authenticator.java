package Bee;

import java.sql.*;

public class Authenticator {
  private static UserBean resultUb;

  public static boolean execute(UserBean ub) {
    boolean okFlag = false;
    resultUb = null;

    try {
      Class.forName("com.mysql.jdbc.Driver");
      
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Bee", "bee", "password");
      Statement st = conn.createStatement();

      ResultSet rs = st.executeQuery(createSelectQuery(ub));

      if (getResultRows(rs) == 0) return false;

      while (rs.next()) {
        if (ub.getPassword().equals(rs.getString("password"))) {
          okFlag = true;

          resultUb = new UserBean();
          resultUb.setId(String.valueOf(rs.getInt("id")));
          resultUb.setName(rs.getString("name"));
          resultUb.setAge(String.valueOf(rs.getInt("age")));
          resultUb.setEmail(rs.getString("email"));
          resultUb.setPassword(rs.getString("password"));
          resultUb.setLocation(rs.getString("location"));
          resultUb.setSex(rs.getString("sex"));

          break;
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return okFlag;
  }

  public static String createSelectQuery(UserBean ub) {
    return "select * from user where name = '" + ub.getName() + "';";
  }

  public static int getResultRows(ResultSet rs) {
    int rows = 0;

    try {
      rs.last();
      rows = rs.getRow();
      rs.beforeFirst();
    } catch (Exception e) {
    }

    return rows;
  }

  public static UserBean getUserBean() {
    return resultUb;
  }
}
