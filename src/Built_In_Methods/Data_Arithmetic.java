package Built_In_Methods;

import java.time.LocalDate;
import java.util.Scanner;

public class Data_Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = scanner.nextLine();

        // Parse input to LocalDate
        LocalDate date = LocalDate.parse(input);

        // Add 7 days, 1 month, and 2 years
        LocalDate addedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks
        LocalDate finalDate = addedDate.minusWeeks(3);

        // Display results
        System.out.println("Original Date: " + date);
        System.out.println("Date after arithmetic: " + finalDate);

        scanner.close();
    }
}
