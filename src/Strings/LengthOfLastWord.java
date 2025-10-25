package Strings;


//LeetCode 58: Length of Last Word
public class LengthOfLastWord {
 public static void main(String[] args) {
     String s = "Hello World";
     System.out.println(lengthOfLastWord(s));
 }

 public static int lengthOfLastWord(String s) 
 {
     int count=0;
     String str=s.trim();
     for (int i=str.length()-1;i>=0;i--) {
         if (str.charAt(i)!=' ') 
         {
             count++;
         } else {
             break;
         }
     }
     return count;
 }
}
