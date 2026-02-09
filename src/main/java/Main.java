import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Pedro","Pablo","Maria","Juan","Marc","Concha","Pol");
        List<String> result = names.stream()
                .filter(s -> s.contains("o") && s.length() >= 5)//Lambda Expresion
                .toList();

        System.out.println(result);
    }
}

