package Recusion.arraylist;

import com.sun.xml.internal.stream.Entity;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        String str= sc.nextLine();

        ArrayList<String> al= gss(str);
        System.out.print("[");
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i));
            if(i<al.size()-1)
            {
                System.out.print(", ");
            }

        }System.out.print("]");
    }

    public static ArrayList<String> gss(String str) {

        if(str.length()==0)
        {
            ArrayList<String> bres= new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch=str.charAt(0);
        String s= str.substring(1);
        ArrayList<String> al=gss(s);
        ArrayList<String> res= new ArrayList<>();
        for(String s1:al)
        {
            res.add(""+s1);
        }
        for(String s1:al)
        {
            res.add(ch+s1);
        }
        return res;
    }

}
