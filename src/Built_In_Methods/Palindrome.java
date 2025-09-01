package Built_In_Methods;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String input = getUserInput();
        boolean isPalindrome = checkPalindrome(input);
        displayResult(input, isPalindrome);
    }

    // Function to get user input
    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine().toLowerCase().replaceAll("\\s+", "");
        scanner.close();
        return input;
    }

    // Function to check if string is a palindrome
    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Function to display result
    public static void displayResult(String input, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}
