package Package1Arrays;

import java.net.http.HttpResponse;

public class TeamApp {
    public static void main(String[] args) {
        Player p1 = new Player("Malthe", 234);

        p1.addScore(100);
        System.out.println(p1.getScore());
    }
}
