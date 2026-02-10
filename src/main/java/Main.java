import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList
                ("Pedro", "Pablo", "Maria", "Juan", "Marc", "Concha", "Pol");
        List<String> result = names.stream()
                .filter(s -> s.contains("o") && s.length() >= 5)//Lambda Expresion
                .toList();
        System.out.println(result);

        List<String> months = Arrays.asList
                ("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        months.forEach(System.out::println);

        PiValue piValue = () -> 3.1415;
        System.out.println(piValue.getPiValue());


        List<Object> elements = Arrays.asList
                ("Pedro",7, "Pablo",24, "Maria", 10, "Juan", 30,"Marc", "Concha", "Pol");
        elements.stream()
                .filter(element -> element instanceof  String)
                .map(element -> (String) element)
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }

    @FunctionalInterface
    public interface PiValue{
        double getPiValue();
    }
}

