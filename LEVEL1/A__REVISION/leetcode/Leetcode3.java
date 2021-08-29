package LEVEL1.A__REVISION.leetcode;

import java.util.HashSet;

public class Leetcode3 {
    public int lengthOfLongestSubstring(String s) {

        int i=0;
        int j=0;
        int max=0;
        HashSet<Character> hset= new HashSet();

        while(j<s.length())
        {
            if(!hset.contains(s.charAt(j)))
            {
                    hset.add(s.charAt(j));
                    max=Math.max(max,j-i+1);
                    j++;
            }
            else{
                hset.remove(s.charAt(i));
                i++;
            }
        }
        return max;

    }
}
