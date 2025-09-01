package Level1;
import java.util.Scanner;
public class q10 {
    public static String toLowerCaseManual(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32); // Convert uppercase to lowercase
            }
            result += c;
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert manually and using built-in method
        String manualLower = toLowerCaseManual(input);
        String builtInLower = input.toLowerCase();

        // Display results
        System.out.println("Manual lowercase: " + manualLower);
        System.out.println("Built-in lowercase: " + builtInLower);

        // Compare
        boolean isEqual = compareUsingCharAt(manualLower, builtInLower);
        System.out.println("Are both strings equal? " + isEqual);
    }
}
