package Arrays;

import java.util.HashMap;
import java.util.Arrays;

// LeetCode #1 - Two Sum
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

public class two_sum{
    public static void main(String[] args)
    {
        int[] nums={2,7,11,15};
        int target=9;
        
        int[] result=twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
  static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

/*
    static int[] twoSum(int[] nums,int target)
    {
    	for(int i =0;i<nums.length;i++) {
    		for(int j=i+1;j<nums.length;j++) {
    			if(nums[i]+nums[j]==target) {
    				return new int[] {i,j};
    			}
    		}
    	}
    	return nums;
    }
    
    static int two sum( int [] nums,int target)
    {
     int high =nums.length,low=0;
     while(low<high)
     {
     int csum= nums[low]+nums[high];
        if( csum==target)
        {
        	return {low,high}
     	}
     	else if(csum<target){
     	left++
     	else
     	right++;
    
    }
   */ 
    
}
