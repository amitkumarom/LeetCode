/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 * Constraints:
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take the first string as a reference for comparison
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            // Compare each character of the current string with the corresponding character in the reference string
            while (j < prefix.length() && j < strs[i].length() && prefix.charAt(j) == strs[i].charAt(j)) {
                j++;
            }

            // Update the prefix based on the common characters
            prefix = prefix.substring(0, j);

            // If the prefix becomes empty, there is no common prefix
            if (prefix.isEmpty()) {
                break;
            }
        }

        return prefix;
    }

    public static String longestCommonPrefixOptimised(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take the first string as a reference for comparison
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // Find the index of the first mismatch or the end of the shorter string
            int j = 0;
            while (j < prefix.length() && j < strs[i].length() && prefix.charAt(j) == strs[i].charAt(j)) {
                j++;
            }

            // Update the prefix based on the common characters
            prefix = prefix.substring(0, j);

            // If the prefix becomes empty, there is no common prefix
            if (prefix.isEmpty()) {
                break;
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] example1 = {"flower", "flow", "flight"};
        System.out.println("Example 1: " + longestCommonPrefixOptimised(example1));

        String[] example2 = {"racdog", "racecar", "racar"};
        System.out.println("Example 2: " + longestCommonPrefix(example2));
    }
}
