package projectJava;
import java.sql.*;

import javax.swing.JOptionPane;
public class sqliteConnectonStock {
	Connection stock = null;
	public static Connection dbConnectionNumber() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection stock = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\66954\\eclipse-workspace\\projectJava\\Stock.db");
			return stock;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}

	}
}