package Recusion.string;

import java.util.Scanner;

public class PrintEncoding {
    static String arr[]={"","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();

        printencoding(str,"");
    }

    private static void printencoding(String str,String out) {

        if(str.length()==0)
        {
            System.out.println(out);
            return;
        }

        int i=i =str.charAt(0)-'0';int j=0;
        if(i==0)
            return;
        printencoding(str.substring(1),out+arr[i]);
        if(str.length()>1){
            j=str.charAt(1)-'0';
            if(i*10+j<27){
                printencoding(str.substring(2),out+arr[i*10+j]);}
        }

    }
}
