package Bee;

import java.sql.*;

public class Registrator {
  Connection con;

  public Registrator() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost/Bee", "bee", "password");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public boolean execute(UserBean userBean) {
    Statement st = null;
    boolean result = true;

    try {
      st = con.createStatement();
      String insertQuery = "insert into user (name, age, email, password, location, failed) values (";
      insertQuery += pack(userBean.getName()) + ", ";
      insertQuery += String.valueOf(userBean.getAge()) + ", ";
      insertQuery += pack(userBean.getEmail()) + ", ";
      insertQuery += pack(SHA256.execute(userBean.getPassword())) + ", ";
      insertQuery += pack(userBean.getLocation()) + ", ";
      insertQuery += String.valueOf(0) + ");";

      st.executeUpdate(insertQuery);

      st.close();
    } catch (Exception e) {
      e.printStackTrace();
      result = false;

      if (st != null) {
        try {
          st.close();
        } catch (Exception ee) {
          e.printStackTrace();
        }
      }
    }

    return result;
  }

  public String pack(String s) {
    return "\"" + s + "\"";
  }
}

