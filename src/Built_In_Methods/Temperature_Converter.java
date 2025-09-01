package Built_In_Methods;
import java.util.Scanner;
public class Temperature_Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("Choose conversion:");
        System.out.println("1: Fahrenheit to Celsius");
        System.out.println("2: Celsius to Fahrenheit");
        System.out.print("Enter choice (1 or 2): ");

        int choice = scanner.nextInt();
        double inputTemp, convertedTemp;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Fahrenheit: ");
                inputTemp = scanner.nextDouble();
                convertedTemp = fahrenheitToCelsius(inputTemp);
                System.out.printf("%.2f Fahrenheit = %.2f Celsius%n", inputTemp, convertedTemp);
                break;

            case 2:
                System.out.print("Enter temperature in Celsius: ");
                inputTemp = scanner.nextDouble();
                convertedTemp = celsiusToFahrenheit(inputTemp);
                System.out.printf("%.2f Celsius = %.2f Fahrenheit%n", inputTemp, convertedTemp);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
