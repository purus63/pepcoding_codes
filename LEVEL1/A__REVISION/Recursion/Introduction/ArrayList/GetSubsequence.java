package LEVEL1.A__REVISION.Recursion.Introduction.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();

        ArrayList<String>al=gss(str);
        System.out.println(al);

    }

    public static ArrayList<String> gss(String str) {

        if(str.length()==0)
        {
            ArrayList<String> b=new ArrayList<>();
            b.add("");
            return b;
        }
        ArrayList<String>res = new ArrayList<>();

        ArrayList<String> al1=gss(str.substring(1));
        for(String s:al1)
        {
            res.add(s);
        }

        for(String s:al1)
        {
            res.add(str.charAt(0)+s);
        }
        return res;

    }
}
