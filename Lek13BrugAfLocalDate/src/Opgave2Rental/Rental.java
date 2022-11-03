package Opgave2Rental;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Rental {

    private int number;

    private int days;

    private LocalDate startDate;

    private double price;

    public Rental(int number, int days, double price, LocalDate startDate){
        this.number = number;
        this.days = days;
        this.price = price;
        this.startDate = startDate;


    }

    public double getPricePrDay(){
        return price;
    }

    public void setDays(int days){
        this.days = days;
    }

    public int getNumber() {
        return number;
    }

    public int getDays() {
        return days;
    }

    public LocalDate getStartDate() {
        LocalDate startDate1;

        return startDate;
    }

    public LocalDate getEndDate(){
        LocalDate endDate = startDate.plusDays(days);
        return endDate;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice(){
        double totalPrice = price * days;
        return totalPrice;
    }
}
