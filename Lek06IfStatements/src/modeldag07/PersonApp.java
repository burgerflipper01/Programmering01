package modeldag07;

public class PersonApp {

    public static void main(String[] args) {
        Person p = new Person("Bent", "Janus", "Christensen", 30, 5, 2001);
        p.printPerson();
        System.out.println("Initialer: " + p.getInit());
        System.out.println("Username: " + p.getUserName());
        Person p1 = new Person("a", "b",12 , 12, 12);

        System.out.println("Age: " + p.age(19, 9, 2022)); // p's age today
        int year = 2017;
        System.out.println("Er " + year + " skudår: " + p.leapYear(year));



    }
}
