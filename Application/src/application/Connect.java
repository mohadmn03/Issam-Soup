package application;

import java.sql.*;
import javax.swing.*;

public class Connect {

    public static Connection connect() {

        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:Famille.sqlite"); 
            return con;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No connect");
        }
        return null;
    }

    public static void main(String[] args) {
        Connect.connect();
    }

}
