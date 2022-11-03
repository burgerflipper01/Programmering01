package Opg2;

public class Song {
    private String title;

    private String artist;

    private int bpm;

    public Song(String title, String artist, int bpm){
        this.artist = artist;
        this.title = title;
        this.bpm = bpm;
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public int getBpm(){
        return bpm;
    }
    public void setBpm(int i){
        bpm = this.bpm;

    }

    String result = " ";
    public String tilpas() {
        if (bpm >= 160) {
            result = "Hurtig";
        } else if (bpm >= 120)
            result = "Perfekt";
        else {
            result = "Langsom";

        }


        return result;

    }


    public void printSong(){
        System.out.println("*******************");
        System.out.println("Titel:   " + title);
        System.out.println("Kunster:      " + artist);
        System.out.println("BPM:     " + bpm);
        System.out.println("******************");
    }
}
