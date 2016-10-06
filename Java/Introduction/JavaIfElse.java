import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();

        if ((input % 2) == 1) {
            System.out.println("Weird");
        } else {
            if (input >= 2 && input <= 5) {
                System.out.println("Not Weird");
            } else if (input >= 6 && input <= 20) {
                System.out.println("Weird");
            } else if (input > 20) {
                System.out.println("Not Weird");
            }
        }
    }
}