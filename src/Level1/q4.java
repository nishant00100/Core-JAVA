package Level1;

public class q4 {
    public static void generateException() {
        String text = null;
        // This will throw NullPointerException
        System.out.println(text.length());
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        }
    }

    public static void main(String[] args) {
        // generateException(); // Uncomment to crash
        handleException();
    }
}
