import java.lang.StringBuilder;
import java.math.BigInteger;
import java.util.*;

public class JavaDatatypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            List<String> summary = new ArrayList<String>();

            BigInteger n = new BigInteger(scanner.next());
            if (n.compareTo(new BigInteger(String.valueOf(Byte.MIN_VALUE))) >= 0  && n.compareTo(new BigInteger(String.valueOf(Byte.MAX_VALUE))) <= 0) {
                summary.add("* byte");
            }
            if (n.compareTo(new BigInteger(String.valueOf(Short.MIN_VALUE))) >= 0 && n.compareTo(new BigInteger(String.valueOf(Short.MAX_VALUE))) <= 0) {
                summary.add("* short");
            }
            if (n.compareTo(new BigInteger(String.valueOf(Integer.MIN_VALUE))) >= 0 && n.compareTo(new BigInteger(String.valueOf(Integer.MAX_VALUE))) <= 0) {
                summary.add("* int");
            }
            if (n.compareTo(new BigInteger(String.valueOf(Long.MIN_VALUE))) >= 0 && n.compareTo(new BigInteger(String.valueOf(Long.MAX_VALUE))) <= 0) {
                summary.add("* long");
            }

            if (summary.size() == 0) {
                System.out.println(n.toString() + " can't be fitted anywhere.");
            } else {
                summary.add(0, n.toString() + " can be fitted in:");
                System.out.println(String.join("\n", summary));
            }
        }

        scanner.close();
    }
}