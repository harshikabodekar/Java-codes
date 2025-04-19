// create table 
import java.sql.*;

public class CreateTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database"; // Replace with your database name
        String user = "your_username"; // Replace with your username
        String password = "your_password"; // Replace with your password

        String createTableQuery = "CREATE TABLE tablename  (" +
                                  "id INT PRIMARY KEY AUTO_INCREMENT, " +
                                  "name VARCHAR(50), " +
                                  "age INT)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            stmt.execute(createTableQuery);
            System.out.println("Table created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}