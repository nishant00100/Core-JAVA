package Built_In_Methods;
import java.util.Scanner;
public class Max_of_three {
    public static void main(String[] args) {
        // Get inputs
        int[] numbers = getUserInput();

        // Calculate max
        int max = findMaximum(numbers[0], numbers[1], numbers[2]);

        // Display result
        displayResult(max);
    }

    // Function to get input from user
    public static int[] getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3];

        System.out.print("Enter first number: ");
        nums[0] = scanner.nextInt();

        System.out.print("Enter second number: ");
        nums[1] = scanner.nextInt();

        System.out.print("Enter third number: ");
        nums[2] = scanner.nextInt();

        scanner.close();
        return nums;
    }

    // Function to find the maximum of three numbers
    public static int findMaximum(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    // Function to display the result
    public static void displayResult(int max) {
        System.out.println("The maximum of the three numbers is: " + max);
    }
}
