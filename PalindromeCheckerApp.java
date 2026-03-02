public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // --- UC1: Application Entry & Welcome Message ---
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");
        System.out.println("---------------------------------------------------");

        // --- UC2: Hardcoded Palindrome Check ---
        // We keep UC1 above so the user still sees the welcome message!
        String input = "madam"; 
        
        // Logic to reverse the string
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Comparison logic
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("Result: The string '" + input + "' is a Palindrome.");
        } else {
            System.out.println("Result: The string '" + input + "' is NOT a Palindrome.");
        }
    }
}