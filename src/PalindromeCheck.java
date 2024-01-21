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
