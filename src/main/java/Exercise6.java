import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercise6 {

    public static void run(){

        List<Object> elements = getList();

        elements.stream()
                .filter(e -> e instanceof String)
                .map(e -> (String) e)
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);

    }

    public static List<Object> getList(){

        return Arrays.asList("Pedro",7,"Pablo",24,"Maria",10,"Juan",30,"Marc","Concha","Pol");

    }

}