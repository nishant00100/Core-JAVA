package Built_In_Methods;

import java.util.Scanner;

public class Basic_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Basic Calculator");
        System.out.println("Choose operation:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");
        System.out.print("Enter choice (1-4): ");

        int choice = scanner.nextInt();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;
        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is undefined.");
                } else {
                    result = divide(num1, num2);
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    // Addition function
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction function
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication function
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division function
    public static double divide(double a, double b) {
        return a / b;
    }
}
