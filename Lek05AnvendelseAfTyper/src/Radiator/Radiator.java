package Radiator;

public class Radiator {
    private int temperatur;

    public Radiator(){
        temperatur = 20;

    }

    public Radiator(int temperatur){
        this.temperatur = temperatur;
    }
    public int getTemperatur(){
        return temperatur;
    }

    public void skruOp(int grader){
        temperatur = temperatur + grader;

    }
    public void skruNed(int grader){
        temperatur = temperatur - grader;
    }

}

