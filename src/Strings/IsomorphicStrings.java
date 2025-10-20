package Strings;

//LeetCode 205. Isomorphic Strings
import java.util.HashMap;

public class IsomorphicStrings {

    public static void main(String[] args) {
        String s="egg";
        String t="add";

        boolean result=isIsomorphic(s,t);
        System.out.println("Isomorphic: "+result);
    }

    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) 
        	return false;

        HashMap<Character,Character> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);

            if(map.containsKey(c1)){
                if(map.get(c1)!=c2)
                	return false;
            }else{
                if(map.containsValue(c2)) 
                	return false;
                map.put(c1,c2);
            }
        }
        return true;
    }
}
