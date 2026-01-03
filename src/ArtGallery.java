import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArtGallery {
    private String name;
    private List<Artwork> artworks = new ArrayList<Artwork>();

    public ArtGallery(String name, List<Artwork> artworks) {
        this.name = name;
        this.artworks = artworks;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Artwork> getArtworks() {
        return this.artworks;
    }

    public void setArtworks(List<Artwork> artworks) {
        this.artworks = artworks;
    }

    public Artwork findByTitle(String title) {
        for (Artwork art :  this.artworks) {
            if (art.getTitle().equals(title)) {
                return art;
            }
        }
        return null;
    }

    public List<Artwork> filterByYear(int year) {
        return artworks.stream()
                .filter(a -> a.getYear() == year)
                .toList();
    }

    public void sortByPrice() {
        artworks.sort(Comparator.comparingDouble(Artwork::getPrice));
    }


}
