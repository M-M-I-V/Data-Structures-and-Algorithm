package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateConnection {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mcst";
        String username = "root"; 
        String password = ""; 

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            System.out.println("Connected successfully");
            
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
}
