/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 *
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 *
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums contains distinct values sorted in ascending order.
 * -104 <= target <= 104
 *
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        // If target is not found, return the index where it would be inserted
        return left;
    }

    public static void main(String[] args) {
        SearchInsertPosition solution = new SearchInsertPosition();

        // Example 1
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        int index1 = solution.searchInsert(nums1, target1);
        System.out.println("Example 1: Insert position = " + index1);

        // Example 2
        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        int index2 = solution.searchInsert(nums2, target2);
        System.out.println("Example 2: Insert position = " + index2);

        // Example 3
        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        int index3 = solution.searchInsert(nums3, target3);
        System.out.println("Example 3: Insert position = " + index3);
    }
}
