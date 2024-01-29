public class RemoveElementFromArray {

    public static void main(String[] args) {
        RemoveElementFromArray solution = new RemoveElementFromArray();

        // Example 1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = solution.removeElement(nums1, val1);
        System.out.println("Example 1: Remaining elements = " + k1);

        // Example 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int k2 = solution.removeElement(nums2, val2);
        System.out.println("Example 2: Remaining elements = " + k2);
    }

    public int removeElement(int[] nums, int val) {
        int k = 0; // Initialize the counter for elements not equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i]; // Update the array with elements not equal to val
            }
        }

        return k;
    }

    // Helper method to sort the first k elements of the array
   /* public void sort(int[] nums, int begin, int end) {
        Arrays.sort(nums, begin, end);
    }*/
}
