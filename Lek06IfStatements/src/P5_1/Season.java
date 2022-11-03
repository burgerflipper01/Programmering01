package P5_1;

import java.time.Month;

public class Season {
    private String season;
    private int day;
    private int month;

    public Season() {
    }

    public String getSeason(int month, int day) {
        if (month >= 1 && month <= 3) {
            season = "Winter";
        } else if (month >= 4 && month <= 6) {
            season = "Spring";

        } else if (month >= 7 && month <= 9) {
            season = "Summer";
        } else {
            season = "Fall";
        }
        if (month % 3 == 0 && day >= 21) {

        }
        return season;
    }
}
