import java.math.BigDecimal;
import java.math.BigInteger;

public class Toplama {
    static BigDecimal toplama (String a, String b) {
        BigDecimal result = null;
        int digit1, digit2;

        int sum;
        int cem = 0;
        int tmp = 0;
        String str = "";
        for (int i = 0; i <  Math.min(a.length(), b.length()); i++) {
            digit1 = Integer.parseInt(String.valueOf(a.charAt(a.length() - i - 1)));
            digit2 = Integer.parseInt(String.valueOf(b.charAt(b.length() - i - 1)));

            sum = digit1 + digit2;
            tmp = sum/10; //soldaki (yadda)
            sum %= 10; //sagdaki
            sum += tmp;
            str = str + String.valueOf(sum);
        }

        System.out.println(new StringBuilder(str).reverse().toString());
        System.out.println();

        return result;
    }
}
