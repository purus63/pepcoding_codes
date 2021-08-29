package Recusion.string;

import java.util.Scanner;

public class PrintPermutation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.next();

        printpermutation(str,"");


    }

    private static void printpermutation(String str, String out) {

        if(str.length()==0)
        { System.out.println(out);}

        for(int i=0;i<str.length();i++) {
            String pre= String.valueOf(str.charAt(i));
            String post= str.substring(0,i)+str.substring(i+1);
            printpermutation(post, out + pre);
        }


    }
}
