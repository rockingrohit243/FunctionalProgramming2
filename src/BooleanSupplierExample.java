import java.util.function.BooleanSupplier;

public class BooleanSupplierExample {
    public static void main(String[] args) {
        BooleanSupplier booleanSupplier=()->{
            boolean status=4%2==0;
            return status;
        };
        System.out.println("Check the status : "+booleanSupplier.getAsBoolean());
    }
}
