import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String[] output = scanner.nextLine().split(" ");
            System.out.printf("%-15s%03d\n", output[0], Integer.valueOf(output[1]));
        }
        System.out.println("================================");

        scanner.close();
    }
}