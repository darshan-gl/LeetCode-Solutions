package Arrays;

// LeetCode 189: Rotate Array
public class RotateArray {

    // Main method at the top
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; // number of positions to rotate right

        rotate(nums, k); // call rotate method

        System.out.println("Rotated array:");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }

    // Method to rotate the array by k steps to the right
    public static void rotate(int[] nums, int k) {

        // If k is greater than array length, take modulo
        if (k > nums.length) {
            k = k % nums.length;
        }

        // Step 1: Reverse the entire array
        reverse(nums, 0, nums.length - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the remaining n - k elements
        reverse(nums, k, nums.length - 1);
    }

    // Helper method to reverse a portion of the array
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
