package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mcst";
        String username = "root"; 
        String password = ""; 
        String query = "UPDATE students SET name = 'Maria Clara' WHERE id = 15";
        // To confirm if it worked, run the query "SELECT * FROM students" in the terminal.

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            int update = statement.executeUpdate(query);
            
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
}
