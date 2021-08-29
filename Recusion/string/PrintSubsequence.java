package Recusion.string;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PrintSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        printSubseq(str,"");
    }

    private static void printSubseq(String str,String out) {

        if(str.length()==0)
        {
            System.out.println(out);return;
        }
        String pre= String.valueOf(str.charAt(0));
        String post=str.substring(1);

        printSubseq(post,out+pre);
        printSubseq(post,out);
    }
}
