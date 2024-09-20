package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mcst";
        String username = "root"; 
        String password = ""; 
        String query = "INSERT INTO students(name, year, program, gwa) VALUES('Juan Dela Cruz', 2, 'Information Systems', 1.04)";
        // To confirm if it worked, run the query "SELECT * FROM students" in the terminal.

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            int insert = statement.executeUpdate(query);
            
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
}
