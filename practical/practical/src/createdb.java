import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
 class createdb {
    public static void main(String[] args) {
       
        String url = "jdbc:mysql://localhost:3306/vipinrawat";
        String username = "root@localhost";
        String password = "";

       
        try {
    
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM student");

            while (resultSet.next()) {
                int age = resultSet.getInt("age");
                String name = resultSet.getString("name");
                System.out.println("ID: " + age + ", Name: " + name);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
