package Arrays;
import java.util.Scanner;

//LeetCode #9 - Palindrome Number
//Given an integer x, return true if x is a palindrome, and false otherwise.

public class Palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();


        boolean result = isPalindrome(num);

        if(result)
            System.out.println(num + " is a Palindrome");
        else
            System.out.println(num + " is not a Palindrome");
      
    }

     static boolean isPalindrome(int x) {
        if(x<0) 
            return false;

        int rev = 0, t = x;
        while(x != 0)
        {
            int d=x%10;
            if(rev > (Integer.MAX_VALUE-d)/10) 
                return false;
            rev = rev*10+d;
            x =x/10;
        }
        return rev==t;
    }
}
