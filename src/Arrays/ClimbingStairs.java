package Arrays;
//LeetCode 70: Climbing Stairs
//Time Complexity: O(n)
//Space Complexity: O(1)

public class ClimbingStairs {
 public int climbStairs(int n) {
     if(n<=3) 
    return n;
     
     int a=3,b=2;
     for(int i=0;i<n-3;i++){
         a=a+b;
         b=a-b;
     }
     return a;
 }
}
