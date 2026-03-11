import java.util.List;

public class Exercise4 {

    public static void run(){

        List<String> months = Exercise3.getMonths();

        months.forEach(System.out::println);

    }
}