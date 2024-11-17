import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample {
    static final String DB_URL = "jdbc:mysql://localhost:3306/testdb";
    static final String USER = "root"; 
    static final String PASS = "nabin";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS users (" +
                         "id INT PRIMARY KEY AUTO_INCREMENT, " +
                         "name VARCHAR(50), " +
                         "email VARCHAR(50))";
            stmt.executeUpdate(sql);
            System.out.println("Table created successfully...");

            sql = "INSERT INTO users (name, email) VALUES ('Alice', 'alice@example.com')";
            stmt.executeUpdate(sql);
            System.out.println("Inserted record...");

            sql = "SELECT * FROM users";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
//output
//Connecting to the database...
//Creating table in the database...
//Table created successfully...
//Inserting records into the table...
//Records inserted successfully...
//Fetching records from the table...
//ID: 1, Name: Alice, Email: alice@example.com
//ID: 2, Name: Bob, Email: bob@example.com
//Goodbye!
//javac -cp .;lib/mysql-connector-java-8.0.28.jar src/JDBCExample.java -d bin
//java -cp bin;lib/mysql-connector-java-8.0.28.jar JDBCExample


