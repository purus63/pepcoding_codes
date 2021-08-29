package Recusion.string;

import java.util.Scanner;

public class PrintStairPath {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        printStairPath(n,"");
    }

    private static void printStairPath(int n,String out) {

        if(n<0)
            return;
        if(n==0)
        {
            System.out.println(out);
            return;
        }
        for(int i=1;i<=3;i++)
        {printStairPath(n-i,out+i);}

    }
}
