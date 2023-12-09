
import java.sql.*;

public class database {

  
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/";
    private static final String USER = "root";
    private static final String PASSWORD = "Sana89@";

    // Database name to be created
    private static final String DATABASE_NAME = "rawatji";

    public static void main(String[] args) {
        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            System.out.println("Connecting to database...");
            Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

            // Execute a query to create the database
            System.out.println("Creating database...");
            Statement statement = connection.createStatement();
            String createDatabaseQuery = "CREATE DATABASE " + DATABASE_NAME;
            statement.executeUpdate(createDatabaseQuery);
            System.out.println("Database created successfully");

            // Close resources
            statement.close();
            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

