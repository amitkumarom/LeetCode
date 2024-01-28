/**
 * Given an integer x, return true if x is a
 * palindrome
 * , and false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 *
 * Constraints:
 *
 * -231 <= x <= 231 - 1
 *
 *
 * Follow up: Could you solve it without converting the integer to a string?
 */
public class PalindromeCheck {

    /**
     *
      * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            // Negative numbers are not palindromes
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        int x1 = 121;
        int x2 = -121;
        int x3 = 10;

        System.out.println(x1 + " is a palindrome: " + isPalindrome(x1));
        System.out.println(x2 + " is a palindrome: " + isPalindrome(x2));
        System.out.println(x3 + " is a palindrome: " + isPalindrome(x3));
    }
}
