package ArraysMedToDimensioner;
import java.util.Arrays;

public class ToDimensioner {
    public static void main(String[] args) {

        //Laver et dobbelarray
        int[][] values = {
                {42,2,32}, {23,546,12}
        };
        ToDimensioner da = new ToDimensioner();

        //Printer dobbelarrayet
        System.out.println(Arrays.deepToString(values));
    }


}
