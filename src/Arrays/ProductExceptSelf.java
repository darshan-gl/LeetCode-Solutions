package Arrays;


//LeetCode 238: Product of Array Except Self
public class ProductExceptSelf {

 public static void main(String[] args) {
     int[] nums = {1, 2, 3, 4};
     int[] result = productExceptSelf(nums);

     System.out.print("Output: ");
     for (int val : result) {
         System.out.print(val + " ");
     }
 }

 public static int[] productExceptSelf(int[] nums) {
     int n = nums.length;
     int[] ans = new int[n];
     int left = 1, right = 1;

     for (int i = 0; i < n; i++) {
         ans[i] = left;
         left *= nums[i];
     }

     for (int i = n - 1; i >= 0; i--) {
         ans[i] *= right;
         right *= nums[i];
     }

     return ans;
 }
}
