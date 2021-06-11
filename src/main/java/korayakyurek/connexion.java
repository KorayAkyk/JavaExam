package korayakyurek;

import java.sql.*;


public class connexion {


    Connection connexion = null;
    Statement statement = null;
    ResultSet resultat = null;

    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connexion = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/javaexamen?serverTimezone=UTC", "root", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connexion;
    }
}
