import java.util.Scanner;
import java.util.Stack; // Required for UC5

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");
        System.out.println("---------------------------------------------------");

        // UC3: Dynamic User Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check (UC5 Stack-Based): ");
        String input = scanner.nextLine(); 

        // UC4: Data Normalization
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // UC5: Stack-Based Logic
        Stack<Character> stack = new Stack<>();

        // 1. Push characters into stack
        for (char c : cleanInput.toCharArray()) {
            stack.push(c);
        }

        // 2. Pop and compare
        boolean isPalindrome = true;
        for (char c : cleanInput.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // 3. Print result
        if (!cleanInput.isEmpty() && isPalindrome) {
            System.out.println("Result: '" + input + "' is a Palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a Palindrome.");
        }

        scanner.close();
    }
}