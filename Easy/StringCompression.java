package Easy;

import java.util.Scanner;

public class StringCompression {
    public static String compression1(String str){
        StringBuilder sbr=new StringBuilder();
        int n=str.length();
        int i=0;
        for( i=0;i<n-1;i++)
        {
            if(str.charAt(i)!=str.charAt(i+1))
                sbr.append(str.charAt(i));
        }
        sbr.append(str.charAt(i));
        return sbr.toString();
    }

    public static String compression2(String str){
        StringBuilder sbr=new StringBuilder();
        int n=str.length();
        int i=1;
        int count=1;
        for(i=1;i<n;i++)
        {
            if(str.charAt(i)==str.charAt(i-1))
                count++;
            else if(count>1)
            {sbr.append(Character.toString(str.charAt(i-1))+count);count=1;}
            else
            {sbr.append(Character.toString(str.charAt(i-1)));count=1;}
        }
        if(count>1)
            sbr.append(Character.toString(str.charAt(i-1))+count);
        else
            sbr.append(Character.toString(str.charAt(i-1)));
        return sbr.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }
}
