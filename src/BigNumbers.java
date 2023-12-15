import java.math.BigDecimal;

public class BigNumbers {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(5.4);
        BigDecimal b = new BigDecimal(3.2);

        System.out.println("result: " + a.divide(b).doubleValue());
    }
}
