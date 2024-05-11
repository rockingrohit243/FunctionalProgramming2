import java.util.function.BiPredicate;

public class Bipredicate {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> biPredicateInteger=(i,j)->(i+j)%2==0;
        System.out.println("Test even of sum "+biPredicateInteger.test(10,2));
    }
}
