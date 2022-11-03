package Opgave03CarRental;

public class Car {

    private String license;

    private double pricePerDay;

    private int purchaseYear;


    public Car(String license, int year){
        this.license = license;

    }
    public void setDayPrice(){

    }

    public double getPricePerDay(){
        return pricePerDay;
    }

    public String getLicense(){
        return license;
    }

    public int getPurchaseYear(){
        return purchaseYear;
    }


}
