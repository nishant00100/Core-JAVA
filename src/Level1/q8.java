package Level1;
import java.util.Scanner;
public class q8 {
    public static void generateException(String[] names) {
        System.out.println(names[5]); // Out of bounds if size < 6
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }
        // generateException(names); // Uncomment to crash
        handleException(names);
    }
}
