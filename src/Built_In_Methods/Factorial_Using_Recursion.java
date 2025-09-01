package Built_In_Methods;

import java.util.Scanner;

public class Factorial_Using_Recursion {
    public static void main(String[] args) {
        int number = getUserInput();
        long factorial = calculateFactorial(number);
        displayResult(number, factorial);
    }

    // Function to get input
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    // Recursive function to calculate factorial
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    // Function to display result
    public static void displayResult(int num, long factorial) {
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
