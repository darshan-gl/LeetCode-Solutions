package Arrays;

import java.util.*;

//LeetCode #136 - Single Number
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

public class Single_number {
    public static void main(String[] args) {
        Single_number s1 = new Single_number();
        int[] nums = {4,1,2,1,2};  
        System.out.println("Single Number " +s1.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sumSet=0,sumArr=0;
        
        for(int num: nums){
            if(set.add(num)) {
                sumSet =sumSet+num;
            }
            sumArr=sumArr+num;
        }
        
        return 2*sumSet-sumArr;
    }
}