package Built_In_Methods;

import java.util.Scanner;

public class GCD_LCM_CALCULATOR {
    public static void main(String[] args) {
        int[] numbers = getUserInput();
        int num1 = numbers[0];
        int num2 = numbers[1];

        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);

        displayResult(num1, num2, gcd, lcm);
    }

    // Function to get two numbers from the user
    public static int[] getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[2];

        System.out.print("Enter first number: ");
        nums[0] = scanner.nextInt();

        System.out.print("Enter second number: ");
        nums[1] = scanner.nextInt();

        scanner.close();
        return nums;
    }

    // Function to calculate GCD using Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM
    public static int calculateLCM(int a, int b, int gcd) {
        return (a / gcd) * b;  // Avoid overflow by dividing first
    }

    // Function to display results
    public static void displayResult(int num1, int num2, int gcd, int lcm) {
        System.out.println("For numbers " + num1 + " and " + num2 + ":");
        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }
}
