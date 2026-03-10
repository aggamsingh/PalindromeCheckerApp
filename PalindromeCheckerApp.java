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

        // You can swap 'new DequeStrategy()' with 'new RecursiveStrategy()' 
        // without changing any other code! This is the power of UC12.
        PalindromeStrategy strategy = new DequeStrategy(); 
        
        System.out.println("Is Palindrome? : " + strategy.check(input));
        scanner.close();
    }
}