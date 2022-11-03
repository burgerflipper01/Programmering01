package Opg2;

public class SongApp {
    public static void main(String[] args) {
        Song s1 = new Song("Lille Frække Frederik", "Bamse", 148);
        Song s2 = new Song("Wauw", "Wham!", 120);

        s1.setBpm(120);

        s1.printSong();

        s1.tilpas();
    }
}
