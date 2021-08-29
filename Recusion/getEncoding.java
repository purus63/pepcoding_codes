package Recusion;

import java.util.ArrayList;
import java.util.Scanner;

public class getEncoding {
    static String arr[]={"","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();

        ArrayList<String> al=getencoding(str);
        System.out.println(al);
    }

    private static ArrayList<String> getencoding(String str) {

        if(str.length()==0)
        {
            ArrayList<String> baseal= new ArrayList<>();
            baseal.add("");
            return baseal;
        }
        int i= str.charAt(0)-'0';
        if(i==0)
        {return new ArrayList<>();}
        ArrayList<String> res =new ArrayList<>();
        ArrayList<String> al1 =new ArrayList<>();
        ArrayList<String> al = getencoding(str.substring(1));
        for(String s:al)
        {
            res.add(arr[i]+s);
        }
        if(str.length()>1)
        {
            int j=str.charAt(1);
            if(i*10+j<27)
            {
                al1=getencoding(str.substring(2));
            }
            for(String s:al1)
            {
                res.add(arr[i*10+j]+s);
            }
        }
        return res;
    }
}
