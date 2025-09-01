package Level1;
import java.util.Scanner;
public class q3 {
    public static char[] customToCharArray(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] userArray = customToCharArray(text);
        char[] builtInArray = text.toCharArray();

        boolean isSame = compareCharArrays(userArray, builtInArray);

        System.out.println("Are character arrays equal? " + isSame);
    }
}
