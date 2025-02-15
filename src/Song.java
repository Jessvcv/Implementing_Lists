public class Song{

    String title;
    String artist;
    Double length;

    // Constructor
    public Song(String title, String artist, double length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    // Accessors
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public Double getLength() {
        return length;
    }

    // Mutators
    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Method to display song details
    @Override
    public String toString() {
        return "Title: " + title + ", Artist: " + artist + ", Length: " + length + " minutes";
    }

    // Main method to test the class
    public static void main(String[] args) {
        Song song = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);
        song.toString();
    }
}