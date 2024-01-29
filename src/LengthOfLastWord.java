/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * <p>
 * A word is a maximal
 * substring
 * consisting of non-space characters only.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 * Example 2:
 * <p>
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.
 * Example 3:
 * <p>
 * Input: s = "luffy is still joyboy"
 * Output: 6
 * Explanation: The last word is "joyboy" with length 6.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 104
 * s consists of only English letters and spaces ' '.
 * There will be at least one word in s.
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
        LengthOfLastWord solution = new LengthOfLastWord();

        // Example 1
        String s1 = "Hello World";
        int length1 = solution.lengthOfLastWord(s1);
        System.out.println("Example 1: Length of last word = " + length1);

        // Example 2
        String s2 = "   fly me   to   the moon  ";
        int length2 = solution.lengthOfLastWord(s2);
        System.out.println("Example 2: Length of last word = " + length2);

        // Example 3
        String s3 = "luffy is still joyboy";
        int length3 = solution.lengthOfLastWord(s3);
        System.out.println("Example 3: Length of last word = " + length3);
    }

    public int lengthOfLastWord(String s) {
        // Trim trailing spaces
        s = s.trim();

        // Find the index of the last space
        int lastIndex = s.lastIndexOf(' ');

        // Calculate the length of the last word
        return s.length() - lastIndex - 1;
    }
}
