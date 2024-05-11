import java.util.function.Supplier;

public class SupplierOtp {
    public static void main(String[] args) {
        Supplier<String> supplierInteger = () -> {
            StringBuilder otp = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                otp.append((int) (Math.random() * 10));
            }
            return otp.toString();
        };
        System.out.println("Otp"+supplierInteger.get());
    }
}
