package Built_In_Methods;
import java.time.LocalDate;
import java.util.Scanner;
public class Date_Comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take first date input
        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(scanner.nextLine());

        // Take second date input
        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate date2 = LocalDate.parse(scanner.nextLine());

        // Compare the dates
        if (date1.isBefore(date2)) {
            System.out.println("First date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is after the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("Both dates are equal.");
        }

        scanner.close();
    }
}
