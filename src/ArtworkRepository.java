import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ArtworkRepository {

    public List<String> getAllArtworks() {
        List<String> artworks = new ArrayList<>();

        String sql = "SELECT title, year, price, style FROM public.artworks";

        try (
                Connection conn = DB.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()
        ) {
            while (rs.next()) {
                String title = rs.getString("title");
                int year = rs.getInt("year");
                double price = rs.getDouble("price");
                String style = rs.getString("style");

                artworks.add(
                        title + " (" + year + "), " + style + ", $" + price
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return artworks;
    }
}
