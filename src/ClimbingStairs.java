/**
 *
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 *
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 *
 *
 * Constraints:
 *
 * 1 <= n <= 45
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        if (n <= 2) {
            return n; // Base cases: 1 step -> 1 way, 2 steps -> 2 ways
        }

        // Initialize an array to store the number of ways to climb to each step
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        // Calculate the number of ways for each step starting from step 3
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        ClimbingStairs solution = new ClimbingStairs();

        // Example 1
        int n1 = 2;
        int ways1 = solution.climbStairs(n1);
        System.out.println("Example 1: " + ways1);

        // Example 2
        int n2 = 4;
        int ways2 = solution.climbStairs(n2);
        System.out.println("Example 2: " + ways2);
    }
}
