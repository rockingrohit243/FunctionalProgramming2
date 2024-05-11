import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> f=(i,j)->i+j;
        //primitive version of Binary operator
        IntBinaryOperator intBinaryOperator=(i,j)->i*j;
        LongBinaryOperator longBinaryOperator=(i,j)->{
            i++;
            return i*j;
        };
        DoubleBinaryOperator doubleBinaryOperator=(i,j)->++i/j;

        System.out.println(f.apply(10,20));
        System.out.println(intBinaryOperator.applyAsInt(2,8));
        System.out.println(longBinaryOperator.applyAsLong(2,3));
        System.out.println(doubleBinaryOperator.applyAsDouble(5,2));
    }
}
