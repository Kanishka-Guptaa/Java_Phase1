package Assisted_Practice_L2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	private static final String URL = "jdbc:mysql://localhost:3306/ecom_db";
    private static final String USER = "root";
    private static final String PASSWORD = "kanishka";
    
    public static Connection getConnection() 
    {
        Connection connection = null;
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } 
        catch (ClassNotFoundException | SQLException e) 
        {
            e.printStackTrace();
        }
        return connection;
    }
}
