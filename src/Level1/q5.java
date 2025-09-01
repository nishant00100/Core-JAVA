package Level1;
import java.util.Scanner;
public class q5 {
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length())); // Out of bounds
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // generateException(str); // Uncomment to crash
        handleException(str);
    }
}
