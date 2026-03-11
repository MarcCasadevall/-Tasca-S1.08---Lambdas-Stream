import java.util.Comparator;
import java.util.List;

public class Exercise7 {

    public static void run(){

        List<Object> elements = Exercise6.getList();

        elements.stream()
                .filter(e -> e instanceof String)
                .map(e -> (String) e)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .forEach(System.out::println);

    }
}