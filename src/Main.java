void main() {
    Artist artist1 = new Artist("Leonardo da Vinci", 1452, "Italy");
    Artist artist2 = new Artist("Édouard Manet", 1832, "France");

    Artwork artwork1 = new Artwork("Mona Lisa", 1503, 1000000, artist1);;
    Artwork artwork2 = new Artwork("Vitruvian Man", 1490, 15000000, artist1);;

    System.out.println("------------------");
    System.out.println(artwork1.getTitle());
    artwork1.setTitle("The Last Supper");
    System.out.println(artwork1.getTitle());
    System.out.println("------------------");

    Artwork artwork3 = new Artwork("Olympia", 1863, 1500000, artist2);;
    Artwork artwork4 = new Artwork("The Railway", 1873, 20000000, artist2);;

    System.out.println(artwork1.comparePrice(artwork2));
    System.out.println(artwork3.comparePrice(artwork4));

    Artwork[] artworks = {artwork1, artwork2, artwork3, artwork4};

    ArtGallery artGallery = new ArtGallery("Louvre", artworks);

    artGallery.showArtworks();
}
