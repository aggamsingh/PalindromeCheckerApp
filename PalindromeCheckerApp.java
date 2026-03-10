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
        String input = scanner.nextLine(); 

        // UC9: Recursive Logic Call
        // Starting at index 0 and length - 1
        boolean isPalindrome = check(input, 0, input.length() - 1);

        // Print Result
        System.out.println("Is Palindrome? : " + isPalindrome);
        scanner.close();
    }

    /**
     * Recursively checks whether a string is a palindrome.
     * @param s Input string
     * @param start Starting index
     * @param end Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Base Condition: prevents infinite recursion
        if (start >= end) {
            return true;
        }

        // Recursive call compares start & end characters
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Call the method again with moving indices
        return check(s, start + 1, end - 1);
    }
}