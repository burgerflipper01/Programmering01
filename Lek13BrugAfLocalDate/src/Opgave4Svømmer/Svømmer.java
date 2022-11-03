package Opgave4Svømmer;


import java.time.LocalDate;
import java.util.ArrayList;

public class Svømmer {
    private String navn;
    private String klub;
    private LocalDate fødselsdag;
    private ArrayList<Double> tider;

    /**
     * Initialiserer en ny svømmer med navn, fødselsdag, klub
     * og tider.
     */

    public Svømmer(String navn, String klub, LocalDate fødselsdag, ArrayList<Double> tider) {
        this.navn = navn;
        this.klub = klub;
        this.fødselsdag = fødselsdag;
        this.tider = tider;
    }

    /**
     * Returnerer svømmerens navn.
     */
    public String getNavn() {
        return navn;
    }

    /**
     * Returnerer svømmerens årgang.
     */
    public LocalDate getFødselsdag() {
        return fødselsdag;
    }

    /**
     * Returnerer svømmerens klub.
     */
    public String getKlub() {
        return klub;
    }

    /**
     * Registrerer svømmerens klub
    * @param klub
    */
    public void setKlub(String klub){
        this.klub = klub;
    }

    /**
     * Returnerer den hurtigste tid svømmeren har opnået
     * Pre: Der er registreret mindst to tider for svømmeren
     */
    public double bedsteTid() {
        int bedsteTid = 100000000;
        return 0;
    }

    /**
     * Returnerer gennemsnittet af de tider svømmeren har
     * opnået
     * Pre: Der er registreret mindst to tider for svømmeren
     */
    public double gennemsnitAfTid() {
        return 0;
    }

    /**
     * Returnerer gennemsnittet af de tider svømmeren har
     * opnået idet den langsomste tid ikke er medregnet
     * Pre: Der er registreret mindst to tider for svømmeren
     */
    public double snitUdenDårligste() {
        return 0;
    }
}


