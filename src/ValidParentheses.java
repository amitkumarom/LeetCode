import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */
public class ValidParentheses {

    public static boolean isValid(String s) {

//        if (s == null || s.length() == 0) {
//            return true; // Empty string is valid
//        }

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static boolean isValidOptimised(String s) {
        if (s == null || s.length() == 0) {
            return true; // Empty string is valid
        }

        char[] stack = new char[s.length()];
        int top = -1;

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch; // Push open brackets onto the stack
            } else if (ch == ')' && top >= 0 && stack[top] == '(') {
                top--; // Pop matching '('
            } else if (ch == '}' && top >= 0 && stack[top] == '{') {
                top--; // Pop matching '{'
            } else if (ch == ']' && top >= 0 && stack[top] == '[') {
                top--; // Pop matching '['
            } else {
                return false; // Unmatched closing bracket or invalid character
            }
        }

        return top == -1; // If stack is empty, the parentheses are valid
    }
    public static void main(String[] args) {
        String example1 = "()";
        System.out.println("Example 1: " + isValid(example1));

        String example2 = "{()[]{}}";
        System.out.println("Example 2: " + isValid(example2));

        String example3 = "(]";
        System.out.println("Example 3: " + isValid(example3));

        String example4 = "()";
        System.out.println("Example 4: " + isValidOptimised(example4));

        String example5 = "{()[]{}}";
        System.out.println("Example 5: " + isValidOptimised(example5));

        String example6 = "()";
        System.out.println("Example 6: " + isValidOptimised(example6));

    }
}

