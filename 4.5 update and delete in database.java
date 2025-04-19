// update and delete from database 
import java.sql.*;
public class Database{
    public static void main(String[]args){
        String url="jdbc:mysql://localhost:3306/database name ";
        String user=" username ";
        String password=" password";
        try (Connection conn =DriverManager.getConnection(url,user,password)){// connection is class from java sql package 
        // conn is variable used for short form for connection
        // DRiver Manager is built in class used for connecting database 
            //update 
            conn.prepareStatement("UPDATE tablename SET columnname='new value'WHERE id=1").executeUpdate();
            System.out.println("Record update.");
            // prepareStatement sends  sql queries to database 
            //delete 
            conn.prepareStatement("DELETE FROM tablename WHERE id=1").executeUpdate();
            System.out.println("Record deleted.");
        }
        catch(SQLException e){
            e.printStackTrace(); // prints full error in detail if there is any .
        }
    }
}
