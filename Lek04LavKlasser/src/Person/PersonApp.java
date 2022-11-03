package Person;

public class PersonApp {
    public static void main(String[] args) {
        Person p1 = new Person("Hans", "Baldersgade 39",32753.5);
        p1.PrintPeron();
        System.out.println(p1.getYearlySalary());
    }
}
