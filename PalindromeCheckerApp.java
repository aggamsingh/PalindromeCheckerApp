import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");
        System.out.println("---------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        String input = scanner.nextLine(); 

        // UC11: Using the Encapsulated Service
        PalindromeService service = new PalindromeService();
        boolean result = service.checkPalindrome(input);

        System.out.println("Is Palindrome? : " + result);
        scanner.close();
    }
}

/**
 * Service class that contains the encapsulated palindrome logic.
 * Demonstrates the Single Responsibility Principle.
 */
class PalindromeService {
    /**
     * Checks whether the input string is a palindrome.
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {
        if (input == null || input.isEmpty()) return false;

        // Apply UC10 Normalization
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Optimized symmetric check
        for (int i = 0; i < clean.length() / 2; i++) {
            if (clean.charAt(i) != clean.charAt(clean.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}