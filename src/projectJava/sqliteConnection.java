package projectJava;
import java.sql.*;

import javax.swing.*;
public class sqliteConnection {
	Connection con = null;
	public static Connection dbConnection() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\66954\\eclipse-workspace\\projectJava\\Database.db");
			JOptionPane.showMessageDialog(null, "Connection Successful");
			return con;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
}
