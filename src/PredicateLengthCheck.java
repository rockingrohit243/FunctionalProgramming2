import java.util.function.Predicate;

public class PredicateLengthCheck {
    public static void main(String[] args) {
        String[] stringArray = {"Rohit", "Sourabh", "Nitish"};
        Predicate<String> predicate = string -> string.length() % 2 == 0;
        for (String single : stringArray) {
            if (predicate.test(single)) {
                System.out.println(single);
            }
        }
    }
}
