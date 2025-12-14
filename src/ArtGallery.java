public class ArtGallery {
    private String name;
    private Artwork[] artworks;

    public ArtGallery(String name,  Artwork[] artworks) {
        this.name = name;
        this.artworks = artworks;
    }

    public void showArtworks() {
        for (Artwork artwork : this.artworks) {
            System.out.println("------------------");
            artwork.getInfo();
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Artwork[] getArtworks() {
        return this.artworks;
    }

    public void setArtworks(Artwork[] artworks) {
        this.artworks = artworks;
    }
}
