package Arrays;

//LeetCode 169: Majority Element
//Moore's Voting Algorithm
//Step 1: Find the candidate element that could be the majority
//Step 2: (Optional) Verify if it is indeed the majority element

public class MajorityElement {
 public int majorityElement(int[] nums) {
     int cand = 0;
     int count = 0;

     for (int i=0;i<nums.length;i++) {
         if (count==0) 
         {
             cand=nums[i];
         }
         if (cand==nums[i]) 
         {
             count++;
         } else {
             count--;
         }
     }
     return cand;
 }
}
