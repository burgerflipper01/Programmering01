package HJEMMEARBEJD.PigGame;

public class PigGameApp {
    public static void main(String[] args) {
        PigGame game = new PigGame(
                new Player("Egon"),
                new Player("Carl"));
        game.startGame();
    }
}
