import java.util.Objects;

public class Artist {
    private String name;
    private int birthYear;
    private String country;

    public Artist(String name, int birthYear, String country) {
        this.name = name;
        this.birthYear = birthYear;
        this.country = country;
    }

    public String getName() {
        return this.name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public String getCountry() {
        return this.country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Artist{" + "name=" + name + ", birthYear=" + birthYear + ", country=" + country + '}';
    }

    @Override
    public boolean equals(Object object) {
        Artist artist = (Artist) object;
        return this.name.equals(artist.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

