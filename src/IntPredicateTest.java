import java.util.function.IntPredicate;


public class IntPredicateTest {
    public static void main(String[] args) {
        int[] intArray={
                10,30,40,59,34
        };
        IntPredicate integerPredicate= integer -> integer%2==0;
        for (int x1:intArray)
        {
            System.out.println(integerPredicate.test(x1));
        }
    }
}
