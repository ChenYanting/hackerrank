import java.util.Scanner;
import java.util.*;

public class JavaLoopsII {
    private int a;
    private int b;
    private int n;

    public JavaLoopsII(int a, int b, int n) {
        this.a = a;
        this.b = b;
        this.n = n;
    }

    public int calculate() {
        int sum = 0;
        for (int i = 0; i < this.n; i++) {
            sum += (int) Math.pow(2, i) * this.b;
        }
        return this.a + sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();
        for (int i = 1; i <= q; i++) {
            String input = "";
            while ((input = scanner.nextLine()).equalsIgnoreCase("")) ;

            int a = Integer.valueOf(input.split(" ")[0]);
            int b = Integer.valueOf(input.split(" ")[1]);
            int n = Integer.valueOf(input.split(" ")[2]);

            List<String> list = new ArrayList<String>();
            for (int j = 1; j <= n; j++) {
                JavaLoopsII javaLoopsII = new JavaLoopsII(a, b, j);
                list.add(String.valueOf(javaLoopsII.calculate()));
            }

            System.out.println(String.join(" ", list));
        }

        scanner.close();
    }
}