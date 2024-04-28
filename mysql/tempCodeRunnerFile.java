import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysql {
    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/course";
        String user = "root";
        String password = "abid1234";

        // Try-with-resources to automatically close the connection
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Check if connection is successful
            if (connection != null) {
                System.out.println("Connected to the MySQL database.");


                System.out.println("Disconnected from the MySQL database.");
            } else {
                System.out.println("Failed to connect to the MySQL database.");
            }
        } catch (SQLException e) {
            // Handle any SQL exceptions
            e.printStackTrace();
        }
    }
}
