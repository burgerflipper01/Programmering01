package Package1Arrays;

public class Player {

    private String name;

    private int age;

    private int score = 0;


    public Player (String inputName, int inputAge){
        this.name = name;
        this.age = age;
        this.score = score;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addScore(int score){
        this.score += score;
    }
}
