import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {

    public static void run(){

        List<String> names = Arrays.asList("Pedro","Pablo","Maria","Juan","Marc","Concha","Pol");

        List<String> result = filter(names);

        System.out.println(result);
    }

    public static List<String> filter(List<String> list){

        return list.stream()
                .filter(name -> name.contains("o") && name.length() > 5)
                .collect(Collectors.toList());
    }
}