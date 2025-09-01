package Built_In_Methods;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        int terms = getUserInput();
        System.out.println("Fibonacci sequence up to " + terms + " terms:");
        generateFibonacci(terms);
    }

    // Function to get user input
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = scanner.nextInt();
        scanner.close();
        return terms;
    }

    // Function to generate and print Fibonacci sequence
    public static void generateFibonacci(int terms) {
        int a = 0, b = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println(); // Line break
    }
}
