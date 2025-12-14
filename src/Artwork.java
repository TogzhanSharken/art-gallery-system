public class Artwork {
    private String title;
    private int year;
    private double price;
    private Artist artist;

    public Artwork(String title, int year, double price, Artist artist) {
        this.title = title;
        this.year = year;
        this.price = price;
        this.artist = artist;
    }

    public void getInfo(){
        System.out.println("Info about artwork:");
        System.out.println("Title: " + this.title);
        System.out.println("Year: " + this.year);
        System.out.println("Price: " + this.price);
        artist.getInfo();
    }

    public String comparePrice(Artwork artwork){
        if(this.price == artwork.price){
            return this.title + "'s price is equal to " + artwork.title + "'s price.";
        }
        else if(this.price < artwork.price){
            return this.title + "'s price is less than " + artwork.title + "'s price.";
        }
        else {
            return this.title + "'s price is more than " + artwork.title + "'s price.";
        }
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
}
