public class Painting extends Artwork {
    private String style;

    public Painting(String title, int year, double price, Artist artist, String style) {
        super(title, year, price, artist);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Painting{title='" + title + ", year=" + year + ", price=" + price + ", artist=" + artist.toString() + ", style='" + style + '}';
    }

}
