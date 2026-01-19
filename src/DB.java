import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

    private static final String URL =
            "jdbc:postgresql://localhost:5432/art_gallery_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "05052007";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Database connection failed", e);
        }
    }
}
