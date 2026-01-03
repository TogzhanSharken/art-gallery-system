public class Sculpture extends Artwork {
    private float height;
    private float width;
    private float weight;

    public Sculpture(String title, int year, double price, Artist artist, float height, float width, float weight) {
        super(title, year, price, artist);
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Sculpture{" +
                "height=" + height +
                ", width=" + width +
                ", weight=" + weight +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", artist=" + artist.toString() +
                '}';
    }
}
