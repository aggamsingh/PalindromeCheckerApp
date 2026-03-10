
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

import java.util.*;

// 1. THE INTERFACE: Defines the "Strategy"
interface PalindromeStrategy {
    boolean check(String input);
}

// 2. STRATEGY A: Deque Logic (From UC7)
class DequeStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : clean.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) return false;

        }
        return true;
    }
}

// 3. STRATEGY B: Recursive Logic (From UC9)
class RecursiveStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return isPalindrome(clean, 0, clean.length() - 1);
    }
    private boolean isPalindrome(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindrome(s, start + 1, end - 1);
    }
}

// 4. THE MAIN APP: Injects the strategy at runtime
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("--- Advanced Palindrome System (UC12) ---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Print Result
        System.out.println("Is Palindrome? : " + isPalindrome);

        // You can swap 'new DequeStrategy()' with 'new RecursiveStrategy()' 
        // without changing any other code! This is the power of UC12.
        PalindromeStrategy strategy = new DequeStrategy(); 
        
        System.out.println("Is Palindrome? : " + strategy.check(input));
   scanner.close();

    }
}