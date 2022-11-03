package Copier;

public class CopierApp {
    public static void main(String[] args) {
        Copier c1 = new Copier(300);
        System.out.println(c1.getPaper());
        c1.insertPaper(0);
        System.out.println(c1.getPaper());
        c1.makeCopy();
        System.out.println(c1.getPaper());
        c1.makePaperJam();
        c1.fixJam();
        c1.makeCopy(12);
        System.out.println(c1.getPaper());

    }
}
