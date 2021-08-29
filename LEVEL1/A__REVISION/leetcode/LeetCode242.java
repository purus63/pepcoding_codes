package LEVEL1.A__REVISION.leetcode;

import java.util.Scanner;

public class LeetCode242 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String t = sc.nextLine();

        System.out.println(isAnagram(s,t));
    }

    private static boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
            return false;


        int arr[] =new int[26];


        boolean flag=true;
        for(int i=0;i<s.length();i++)
        {
            int ch =s.charAt(i)-'a';
            arr[ch]++;
        }

        for(int i=0;i<t.length();i++)
        {
            int ch =t.charAt(i)-'a';
            arr[ch]--;
        }

        for(int i:arr)
        {
            if(i!=0)
            {return false;}
        }
        return true;
    }
}
