import java.util.Objects;

public abstract class Artwork {
    protected String title;
    protected int year;
    protected double price;
    protected Artist artist;

    public Artwork(String title, int year, double price, Artist artist) {
        this.title = title;
        this.year = year;
        this.price = price;
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public double getPrice() {
        return this.price;
    }

    public Artist getArtist() {
        return this.artist;
    }

    @Override
    public boolean equals(Object object) {
        Artwork artwork = (Artwork) object;
        return this.title.equals(artwork.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
