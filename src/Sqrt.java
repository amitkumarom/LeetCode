/**
 *
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
 *
 * You must not use any built-in exponent function or operator.
 *
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 *
 *
 * Example 1:
 *
 * Input: x = 4
 * Output: 2
 * Explanation: The square root of 4 is 2, so we return 2.
 * Example 2:
 *
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 *
 *
 * Constraints:
 *
 * 0 <= x <= 231 - 1
 */
public class Sqrt {

    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x; // Base case: sqrt(0) = 0, sqrt(1) = 1
        }

        long left = 1;
        long right = x / 2; // Start with half of x as the upper bound

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == x) {
                return (int)mid; // Found the exact square root
            } else if (square < x) {
                left = mid + 1; // Square too small, search in the right half
            } else {
                right = mid - 1; // Square too large, search in the left half
            }
        }

        return (int)right; // Return the floor of the square root
    }

    public static void main(String[] args) {
        Sqrt solution = new Sqrt();

        // Example 1
        int x1 = 4;
        int sqrt1 = solution.mySqrt(x1);
        System.out.println("Example 1: " + sqrt1);

        // Example 2
        int x2 = 82;
        int sqrt2 = solution.mySqrt(x2);
        System.out.println("Example 2: " + sqrt2);
    }
}
