import java.math.BigDecimal;
import java.math.BigInteger;

public class Toplama {
    static BigDecimal toplama (String a, String b) {
        int[] reqemler1 = new int[a.length()];
        int[] reqemler2 = new int[b.length()];
        BigDecimal sumReqem;

        for (int i = 0; i < a.length(); i++) {
            reqemler1[i] = Integer.parseInt(String.valueOf(a.charAt(i)));
        }
        for (int i = 0; i < b.length(); i++) {
            reqemler2[i] = Integer.parseInt(String.valueOf(b.charAt(i)));
        }
        int maxLenght = Math.max(a.length(), b.length());

        int reqem1, reqem2;
        while () {

        }
        sumReqem = new BigDecimal();
        return sumReqem;
    }
}
