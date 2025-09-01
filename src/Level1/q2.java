package Level1;
import java.util.Scanner;
public class q2 {
    public static String substringUsingCharAt(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    public static boolean compareUsingCharAt(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String userSubstring = substringUsingCharAt(text, start, end);
        String builtInSubstring = text.substring(start, end);

        boolean same = compareUsingCharAt(userSubstring, builtInSubstring);

        System.out.println("User-defined substring: " + userSubstring);
        System.out.println("Built-in substring: " + builtInSubstring);
        System.out.println("Are they equal? " + same);
    }
}
