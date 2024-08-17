public class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start merging from the end of nums1 and nums2
        int i = m - 1;  // Last element of the first array
        int j = n - 1;  // Last element of the second array
        int k = m + n - 1;  // Last position in nums1 array

        // Compare elements from the end of nums1 and nums2 and place the largest element at the end of nums1
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If any elements left in nums2, add them to nums1
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        // No need to check nums1 since its remaining elements are already in place
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        // Merge nums1 and nums2
        merge(nums1, m, nums2, n);

        // Print the merged array
        System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
