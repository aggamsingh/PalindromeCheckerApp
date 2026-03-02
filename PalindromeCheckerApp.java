public class PalindromeCheckerApp {
    public static void main(String[] args) {
        

        // UC2: Hardcoded Palindrome Check
        String input = "madam"; // Hardcoded value for this use case
        
        // Logic to reverse the string
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Comparison logic
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("The string '" + input + "' is a Palindrome.");
        } else {
            System.out.println("The string '" + input + "' is NOT a Palindrome.");
        }
    }
}