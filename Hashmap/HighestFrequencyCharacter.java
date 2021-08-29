package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HighestFrequencyCharacter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        HashMap<Character,Integer> hmap=new HashMap<>();
        char ans=0;
        int max=-1;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            hmap.put(ch,hmap.get(ch)==null?1:hmap.get(ch)+1);
            if(hmap.get(ch)>max)
            {
                ans=ch;
                max=hmap.get(ch);
            }
        }
        System.out.println(ans);
    }
}
