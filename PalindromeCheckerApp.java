import java.util.*;

// Interface from UC12
interface PalindromeStrategy {
    boolean check(String input);
}

// Concrete Strategy A: Deque
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

// Concrete Strategy B: Recursive
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

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("--- UC13: Performance Benchmarking System ---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Strategy to test
        PalindromeStrategy strategy = new DequeStrategy();

        // Capture Start Time
        long startTime = System.nanoTime();

        // Run the algorithm
        boolean result = strategy.check(input);

        // Capture End Time and Calculate Duration
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + duration + " ns"); // Display in nanoseconds
        
        scanner.close();
    }
}