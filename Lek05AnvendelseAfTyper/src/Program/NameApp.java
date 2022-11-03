package Program;

public class NameApp {
    public static void main(String[] args) {
        Name n1 = new Name("Margrethe", "Mosbæk", "Dybdahl");
        System.out.println(n1.getInfo());
        System.out.println(n1.getInit());
        System.out.println(n1.getUsername());

    }
}
