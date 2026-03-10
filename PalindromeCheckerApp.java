import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");
        System.out.println("---------------------------------------------------");

        // UC3: Dynamic User Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        String originalInput = scanner.nextLine(); 

        // UC10: Normalize String
        // Removes spaces/symbols and converts to lowercase
        String normalized = originalInput.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Comparison Logic: Symmetric Check
        boolean isPalindrome = true;
        for (int i = 0; i < normalized.length() / 2; i++) {
            // Compare characters from both ends moving inward
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Print Result
        System.out.println("Is Palindrome? : " + isPalindrome);
        scanner.close();
    }
}