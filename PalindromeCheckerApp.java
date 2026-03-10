import java.util.Scanner;
import java.util.LinkedList; // Required for UC8

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

        // UC8: Linked List Based Palindrome Checker
        LinkedList<Character> list = new LinkedList<>();

        // 1. Convert string to linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // 2. Compare halves by removing from both ends
        boolean isPalindrome = true;
        while (list.size() > 1) {
            // Linked list supports double-ended operations
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // 3. Print result
        System.out.println("Is Palindrome? : " + isPalindrome);
        
        scanner.close();
    }
}