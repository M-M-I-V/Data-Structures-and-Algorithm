public class StudentInformationSystem {
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

                System.out.println("ID: " + id + ", Name: " + name + ", Year: " + year + ", Program: " + program);
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}