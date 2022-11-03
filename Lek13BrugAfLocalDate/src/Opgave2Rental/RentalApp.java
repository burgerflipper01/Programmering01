package Opgave2Rental;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class RentalApp {
    public static void main(String[] args) {
        LocalDate dat1 = LocalDate.now().plusMonths(1).withDayOfMonth(1);
        LocalDate dat2 = LocalDate.now().plusMonths(32);

        Rental r1 = new Rental(1, 50, 100, dat1);
        Rental r2 = new Rental(2, 20, 1000, dat2);


        //System.out.println("The rental of car 1 starts on " + r1.getStartDate());
        //System.out.println("The rental of car 1 ends on " + r1.getEndDate());
        System.out.println("The total price of car 1 is " + r1.getTotalPrice()
                + " and started the day after " + r1.getStartDate().minusDays(1)
                + " And ended " + r1.getEndDate());


        //System.out.println("The rental of car 2 starts on " + r2.getStartDate());
        //System.out.println("The rental of car 2 ends on " + r2.getEndDate());
        System.out.println("The total price of car 2 is " + r2.getTotalPrice()
                + " and started the day after " + r2.getStartDate().minusDays(1)
                + " And ended " + r2.getEndDate());


        //Udskriv antallet af år, måneder og dage mellem startdatoen for den første udlejning og startdatoen
        //på den anden udlejning.
        System.out.println("-------------------------------------");
        System.out.println("Y = Years  M = Months  D = Days");
        //System.out.println(r1.getStartDate().until(r2.getEndDate()));
        Period period = r1.getStartDate().until(r2.getStartDate());
        System.out.println(period.getYears() + "Y " + period.getMonths() + "M " + period.getDays() + "D");


        Period bet = dat1.until(dat2);

        long days = bet.getDays();
        long months = bet.getMonths();
        long years = bet.getYears();

        days = ChronoUnit.DAYS.between(dat1, dat2);
        months = ChronoUnit.MONTHS.between(dat1, dat2);
        years = ChronoUnit.YEARS.between(dat1, dat2);

        System.out.println("Der er " + days + " dage eller " + months + " måneder eller " + years + " år " + "mellem rental 1 og rental 2");


    }

}

