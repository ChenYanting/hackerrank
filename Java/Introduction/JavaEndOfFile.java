import java.util.*;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, String> lines = new HashMap<>();
        int numberOfLines = 0;
        while (scanner.hasNext()) {
            lines.put(++numberOfLines, scanner.nextLine());
        }

        lines.forEach((key, value) -> System.out.printf("%d %s\n", key, value));
    }
}