import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ArtworkRepository {

    public List<String> getAllArtworks() {
        List<String> artworks = new ArrayList<>();

        String sql = "SELECT title, year, price, style FROM artworks";

        try (
                Connection conn = DB.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()
        ) {
            while (rs.next()) {
                artworks.add(
                        rs.getString("title") + " (" +
                                rs.getInt("year") + "), " +
                                rs.getString("style") + ", $" +
                                rs.getDouble("price")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return artworks;
    }

    public void addArtwork(String title, int year, double price, String style, int artistId) {

        String sql =
                "INSERT INTO artworks (title, year, price, style, artist_id) VALUES (?, ?, ?, ?, ?)";

        try (
                Connection conn = DB.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setString(1, title);
            stmt.setInt(2, year);
            stmt.setDouble(3, price);
            stmt.setString(4, style);
            stmt.setInt(5, artistId);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
