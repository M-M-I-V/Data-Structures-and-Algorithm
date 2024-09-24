package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SubmittingSQLQuery {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/mcst";
        String username = "root"; 
        String password = ""; 
        String query = "SELECT * FROM students";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int year = resultSet.getInt("year");
                String program = resultSet.getString("program");
                double gwa = resultSet.getDouble("gwa");
                System.out.println("ID: " + id + ", Name: " + name + ", Year: " + year + ", Program: " + program + ", GWA: " + gwa);
            }
            
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

	}

}
