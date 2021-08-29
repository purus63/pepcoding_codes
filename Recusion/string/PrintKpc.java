package Recusion.string;

import java.util.Scanner;

public class PrintKpc {
    public static String arr[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str= sc.nextLine();
        
        printKpc(str,"");
        
    }

    private static void printKpc(String str,String out) {
        if(str.length()==0)
        {
            System.out.println(out);
            return;
        }
        int a=str.charAt(0)-'0';
        String code=arr[a];

        String s=str.substring(1);
        for(int i=0;i<code.length();i++)
        {
            printKpc(s,out+code.charAt(i));
        }

    }
}
