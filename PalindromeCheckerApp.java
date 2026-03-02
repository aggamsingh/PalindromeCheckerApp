import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

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
        String input = scanner.nextLine(); 

        // UC7: Deque Initialization
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Logic: Compare front and rear elements until one or zero remain
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            // Remove from both ends and compare
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // Print Result
        System.out.println("Is Palindrome? : " + isPalindrome);
        
        scanner.close();
    }
}