import java.util.Date;
import java.util.function.Supplier;

public class SupplierDate {
    public static void main(String[] args) {
        Supplier<Date> dateSupplier= Date::new;
        System.out.println("current Date"+dateSupplier.get());
    }
}
