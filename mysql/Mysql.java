import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Mysql {
    static final    String url = "jdbc:mysql://localhost:3306/";
    static final    String user = "root";
    static final    String password = "abid1234";
    public static void main(String[] args) {
        try(Connection conn=DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();)
        {

        }
        catch(SQLException e)
        {
            
        }
    }
}
