import java.util.Arrays;
import java.util.List;

public class Exercise3 {

    public static void run(){

        List<String> months = getMonths();

        months.forEach(month -> System.out.println(month));

    }

    public static List<String> getMonths(){

        return Arrays.asList(
                "January","February","March","April","May","June",
                "July","August","September","October","November","December"
        );
    }
}