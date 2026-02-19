import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class UC6PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "civic";
        System.out.println("Input : " + input);

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

