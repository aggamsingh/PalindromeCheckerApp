import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

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

        // UC6: Queue + Stack Initialization
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert each character into both structures
        for (char c : input.toCharArray()) {
            queue.add(c);  // FIFO
            stack.push(c); // LIFO
        }

        // Logical Comparison
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            // Compare dequeue (front) with pop (top)
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        // Print Result
        System.out.println("Is Palindrome? : " + isPalindrome);
        
        scanner.close();
    }
}