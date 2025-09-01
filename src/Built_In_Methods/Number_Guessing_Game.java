package Built_In_Methods;

import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game {
    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");
        startGame();
    }

    // Main game loop
    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int low = 1;
        int high = 100;
        boolean found = false;

        while (!found) {
            int guess = generateGuess(low, high, random);
            System.out.println("Is your number " + guess + "? (Enter: high / low / correct)");
            String feedback = getUserFeedback(scanner);

            switch (feedback) {
                case "high":
                    high = guess - 1;
                    break;
                case "low":
                    low = guess + 1;
                    break;
                case "correct":
                    System.out.println("Hooray! I guessed your number: " + guess);
                    found = true;
                    break;
                default:
                    System.out.println("Invalid input. Please enter: high / low / correct");
            }

            if (low > high) {
                System.out.println("Hmm, seems like there was an error in the feedback. Let's try again!");
                break;
            }
        }

        scanner.close();
    }

    // Function to generate guess between given bounds
    public static int generateGuess(int low, int high, Random random) {
        return random.nextInt(high - low + 1) + low;
    }

    // Function to get user feedback
    public static String getUserFeedback(Scanner scanner) {
        System.out.print("Your feedback: ");
        return scanner.nextLine().toLowerCase().trim();
    }
}
