import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Pedro","Pablo","Maria","Juan","Marc","Concha");
        List<String> result = names.stream()
                .filter(s -> s.contains("o"))//Lambda Expresion
                .toList();

        System.out.println(result);
    }
}

