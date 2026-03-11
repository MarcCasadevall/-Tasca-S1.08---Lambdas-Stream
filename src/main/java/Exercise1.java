import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {

    public static void run() {

        List<String> names = Arrays.asList("Pedro","Pablo","Maria","Juan","Marc","Concha","Pol");

        List<String> result = filterWithO(names);

        System.out.println(result);
    }

    public static List<String> filterWithO(List<String> list){

        return list.stream()
                .filter(name -> name.contains("o"))
                .collect(Collectors.toList());
    }

}