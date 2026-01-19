import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        String user = "root";
        String password = "rahi";

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/",
                    user,
                    password
            );
            Statement stmt = conn.createStatement();

            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS testdb");

            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    user,
                    password
            );
            stmt = conn.createStatement();

            stmt.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS student (" +
                            "id INT PRIMARY KEY AUTO_INCREMENT, " +
                            "name VARCHAR(50)" +
                            ")"
            );

            System.out.println("Database and table created successfully.");

            String insertSQL = "INSERT INTO student(name) VALUES (?)";
            PreparedStatement ps = conn.prepareStatement(insertSQL);

            ps.setString(1, "IJK");
            ps.executeUpdate();
            System.out.println("Value inserted");


            ps.setString(1, "MLN");
            System.out.println("Value inserted");
            ps.executeUpdate();

            conn.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
