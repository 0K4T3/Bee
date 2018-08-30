package Bee;

import java.util.*;
import java.sql.*;

public class ContributionAccessor {
    private static List<Contribution> contributionList;

    public static boolean execute() {
        contributionList = new ArrayList<>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Bee", "root", "cham-0430");
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery(createSelectQuery());

            while (rs.next()) {
                Contribution c = new Contribution();
                c.setId(String.valueOf(rs.getInt("id")));
                c.setContributorId(String.valueOf(rs.getInt("contributor_id")));
                c.setText(rs.getString("text"));
                c.setOfferNum(String.valueOf(rs.getInt("offer_num")));
                c.setGitUrl(rs.getString("git_url"));

                contributionList.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public static String createSelectQuery() {
        return "select * from contribution;";
    }

    public static List<Contribution> getContributionList() {
        return contributionList;
    }
}
