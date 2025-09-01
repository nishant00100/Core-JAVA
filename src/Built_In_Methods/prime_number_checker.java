package Built_In_Methods;
import java.util.Scanner;
public class prime_number_checker {
    public static void main(String[] args) {
        int number = getUserInput();
        boolean isPrime = checkPrime(number);
        displayResult(number, isPrime);
    }

    // Function to get number from user
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    // Function to check if a number is prime
    public static boolean checkPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    // Function to display result
    public static void displayResult(int num, boolean isPrime) {
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

}
