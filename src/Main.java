import java.util.Scanner;

void main() {
    Artist artist1 = new Artist("Leonardo da Vinci", 1452, "Italy");
    Artist artist2 = new Artist("Édouard Manet", 1832, "France");

//    Artwork artwork1 = new Artwork("Mona Lisa", 1503, 1000000, artist1);;
//    Artwork artwork2 = new Artwork("Vitruvian Man", 1490, 15000000, artist1);;

    Artwork painting1 = new Painting("Mona Lisa", 1503, 2500000, artist1, "Realistic");
    Artwork painting2 = new Painting("Cherchill", 1941, 1800000, artist2, "2D");
    Artwork sculpture = new Sculpture("Micelangelo", 1521, 2000000, artist2, 3, 2, 150);

    List<Artwork> artworks = new ArrayList<>();
    artworks.add(painting1);
    artworks.add(painting2);
    artworks.add(sculpture);

    ArtGallery gallery = new ArtGallery("Louvre", artworks);
    System.out.println(gallery.getArtworks());

//    System.out.println(gallery.findByTitle("Mona Lisa"));;
//    System.out.println(gallery.filterByYear(1941));
    gallery.sortByPrice();

    System.out.println(gallery.getArtworks());

//    System.out.println(painting.toString());
//
//    System.out.println(artist1.equals(artist2));

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter artwork title: ");
    String title = scanner.nextLine();

    System.out.print("Enter year: ");
    int year = scanner.nextInt();

    System.out.print("Enter price: ");
    double price = scanner.nextDouble();
    scanner.nextLine(); // очистка ввода

    Artist artist = new Artist("Unknown", 0, "Unknown");

    Artwork artwork = new Painting(title, year, price, artist, "Unknown");

    System.out.println(artwork);

    scanner.close();

}
