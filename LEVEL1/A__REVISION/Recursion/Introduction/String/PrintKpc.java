package LEVEL1.A__REVISION.Recursion.Introduction.String;

import java.util.Scanner;

public class PrintKpc {

    static String [] keypad={"","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz",};
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();

        printKPC(str,"");
    }

    public static void printKPC(String str, String asf) {

        if(str.length()==0)
        {
            System.out.println(asf);
            return;
        }

        int n=str.charAt(0)-'0';
        String s=keypad[n];

        for(int i=0;i<s.length();i++)
        {
            printKPC(str.substring(1),asf+s.charAt(i));
        }

    }
}
