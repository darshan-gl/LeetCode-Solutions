package Arrays;
import java.util.Arrays;

//LeetCode #26 - Remove Duplicates from Sorted Array
//Remove duplicates in-place from a sorted array and return the new length

public class Remove_Duplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int k = removeDuplicates(arr);

        System.out.println("Number of unique elements: "+ k);
        System.out.print("Unique elements: ");
        for (int i=0;i<k;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length==0) 
            return 0;

        int x=0; 

        for (int i=1;i<nums.length;i++) 
        {
            if (nums[i]!=nums[x]) 
            {
                x++;
                nums[x]=nums[i];
            }
        }

        return x+1; 
    }
}
