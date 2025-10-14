
package Arrays;
public class Palindrome {
    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int[] ans = obj.searchRange(nums, target);

        System.out.println("[" + ans[0] + ", " + ans[1] + "]");
    }

    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};

        for (int i=0;i<nums.length;i++) {
            if (nums[i]==target) {
                res[0]=i;
                break;
            }
        }

        for (int j=nums.length-1;j>=0;j--) {
            if (nums[j]==target) {
                res[1]=j;
                break;
            }
        }
        return res;
    }
}
