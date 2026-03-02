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
        System.out.print("Enter a string to check: ");
        String originalInput = scanner.nextLine(); 

        // UC4: Data Normalization (Cleaning)
        // This removes all non-alphanumeric characters and converts to lowercase
        String cleanInput = originalInput.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // UC2 Logic: Reverse the cleaned string
        String reversed = "";
        for (int i = cleanInput.length() - 1; i >= 0; i--) {
            reversed += cleanInput.charAt(i);
        }

        // Comparison logic using the cleaned version
        if (!cleanInput.isEmpty() && cleanInput.equals(reversed)) {
            System.out.println("Result: '" + originalInput + "' is a Palindrome.");
        } else {
            System.out.println("Result: '" + originalInput + "' is NOT a Palindrome.");
        }
        
        scanner.close();
    }
}