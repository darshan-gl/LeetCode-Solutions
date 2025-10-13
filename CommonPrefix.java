package Arrays;

import java.util.Arrays;


//LeetCode #14 - Longest Common Prefix
//Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string.

public class CommonPrefix {
    public String longestCommonPrefix(String[] strs) {
         if (strs == null || strs.length == 0) 
         return "";
       StringBuilder result= new StringBuilder();
       Arrays.sort(strs);

       char[] first = strs[0].toCharArray();
       char[] last = strs[strs.length-1].toCharArray();

        for(int i=0;i<first.length;i++)
        {
            if(first[i]!=last[i])
            break;
            result.append(first[i]);
        }
        return result.toString();

        }


}
