package com.java.dsa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DeletingData {
	
	private static final String url = "jdbc:mysql://localhost:3306/demo";
	private static final String user = "root";
	private static final String password = "";
	private static final String queryUpdate = 
			"DELETE FROM employees WHERE id = 1";
	private static int resultSet;
	private static final String queryOutput = "SELECT * FROM employees";

	public static void main(String[] args) {
		
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
			setResultSet(statement.executeUpdate(queryUpdate));
			ResultSet resultSet = statement.executeQuery(queryOutput);
			
			System.out.println("List of Employees");
			while(resultSet.next()) {
				int id = resultSet.getInt("id");
				String lastName = resultSet.getString("last_name");
				String firstName = resultSet.getString("first_name");
				String email = resultSet.getString("email");
				String department = resultSet.getString("department");
				double salary = resultSet.getDouble("salary");
				System.out.println("id: " + id + ", Name: " + firstName + " " + lastName + ", Email: " + email + ", Department: " + department + ", Salary: " + salary);
			}
			
			connection.close();
			statement.close();
			resultSet.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}

	}

	public static int getResultSet() {
		return resultSet;
	}

	public static void setResultSet(int resultSet) {
		DeletingData.resultSet = resultSet;
	}

}
