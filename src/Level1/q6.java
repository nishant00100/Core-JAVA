package Level1;
import java.util.Scanner;
public class q6 {
    public static void generateException(String text) {
        String s = text.substring(5, 2); // Start > End
    }

    public static void handleException(String text) {
        try {
            String s = text.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // generateException(input); // Uncomment to crash
        handleException(input);
    }
}
