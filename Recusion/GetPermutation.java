package Recusion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetPermutation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.next();

        ArrayList<String> al=getpermutation(str);
        System.out.println(al);
    }

    private static ArrayList<String> getpermutation(String str) {

        if(str.length()==0)
        {
            ArrayList<String> alist=new ArrayList<>();
            alist.add("");
            return alist;
        }

        ArrayList<String> res= new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            String pre= String.valueOf(str.charAt(i));
            String post =str.substring(0,i)+str.substring(i+1);
            ArrayList<String> al=getpermutation(post);
            for(String s:al)
            {
                res.add(pre+s);
            }
        }
        return res;
    }
}
