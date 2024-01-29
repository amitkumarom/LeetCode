/**
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 *
 *
 * Example 1:
 *
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * Example 2:
 *
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 *
 *
 * Constraints:
 *
 * 1 <= haystack.length, needle.length <= 104
 * haystack and needle consist of only lowercase English characters.
 */
public class StrStr {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0; // Empty needle matches at index 0
        }

        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break; // Characters don't match, move to next position in haystack
                }
            }
            if (j == m) {
                return i; // Found a match, return the index
            }
        }

        return -1; // No match found
    }

    public static void main(String[] args) {
        StrStr solution = new StrStr();

        // Example 1
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        int index1 = solution.strStr(haystack1, needle1);
        System.out.println("Example 1: Index of first occurrence = " + index1);

        // Example 2
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        int index2 = solution.strStr(haystack2, needle2);
        System.out.println("Example 2: Index of first occurrence = " + index2);
    }
}
