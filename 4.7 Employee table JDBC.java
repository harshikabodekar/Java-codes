// employee  table 
import java.sql.*;

public class EmployeeDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "your_username";
        String password = "your_password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            // Create table
            conn.createStatement().execute("CREATE TABLE IF NOT EXISTS Employee (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50), salary FLOAT)");
            System.out.println("Table created.");

            // Insert records
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO Employee (name, salary) VALUES (?, ?)");// ?? is placeholder for values
            String[][] employees = {{"Hershey", "50000"}, {" Ada", "60000"}, {"Pratz", "55000"}, {"amm", "70000"}, {"konitari", "65000"}};
            for (String[] emp : employees) {
                pstmt.setString(1, emp[0]);// for 1st ? add name 
                pstmt.setFloat(2, Float.parseFloat(emp[1]));// for 2nd ? add salary
                pstmt.executeUpdate();
            }
            System.out.println("Records inserted.");

            // Display records
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM Employee");
            while (rs.next()) {// rs holds values , acts like a pointer 
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Salary: " + rs.getFloat("salary"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}