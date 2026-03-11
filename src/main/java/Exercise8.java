public class Exercise8 {

    public static void run(){

        Reverse reverse = text -> new StringBuilder(text).reverse().toString();

        System.out.println(reverse.reverse("Lambda"));

    }
}