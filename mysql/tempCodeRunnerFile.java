import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysql {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/course";
        String user = "root";
        String password = "abid1234";

        
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            
            if (connection != null) {
                System.out.println("Connected to the MySQL database.");


                System.out.println("Disconnected from the MySQL database.");
            } else {
                System.out.println("Failed to connect to the MySQL database.");
            }
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
    }
}
