package LEVEL1.A__REVISION.Recursion.Introduction.String;

import java.util.Scanner;

public class printpermutations {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();

        printPermutations(str,"");
    }

    public static void printPermutations(String str, String asf) {

        if(str.length()==0)
        {
            System.out.println(asf);return;
        }

        for(int i=0;i<str.length();i++)
        {
            char c= str.charAt(i);
            printPermutations(str.substring(0,i)+str.substring(i+1),asf+c);
        }
    }
}
