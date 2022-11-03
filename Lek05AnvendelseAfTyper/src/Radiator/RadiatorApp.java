package Radiator;

public class RadiatorApp {
    public static void main(String[] args) {
        Radiator r1 = new Radiator();
        Radiator r2 = new Radiator(22);
        r1.skruOp(0);
        //System.out.println(r1.getTemperatur());
        r1.skruNed(4);
        System.out.println(r1.getTemperatur());
        r2.skruOp(0);
        //System.out.println(r2.getTemperatur());
        r2.skruNed(3);
        System.out.println(r2.getTemperatur());
    }
}
