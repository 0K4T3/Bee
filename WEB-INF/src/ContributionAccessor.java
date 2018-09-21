package Bee;

import java.util.*;
import java.sql.*;

public class ContributionAccessor {
  private Connection con;
  private List<Contribution> contributionList;

  public ContributionAccessor() {
    contributionList = new ArrayList<>();

    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost/Bee", "bee", "password");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public boolean execute() {
    try {
      Statement st = con.createStatement();

      ResultSet rs = st.executeQuery(createSelectQuery());

      while (rs.next()) {
        Contribution c = new Contribution();
        c.setId(rs.getInt("id"));
        c.setContributorId(rs.getInt("contributor_id"));
        c.setTitle(rs.getString("title"));
        c.setText(rs.getString("text"));
        c.setOfferNum(rs.getInt("offer_num"));
        c.setGitUrl(rs.getString("git_url"));

        contributionList.add(c);
      }
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }

    return true;
  }

  public String createSelectQuery() {
    return "select * from contribution;";
  }

  public List<Contribution> getContributionList() {
    return contributionList;
  }
}
