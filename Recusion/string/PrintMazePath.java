package Recusion.string;

import java.util.Scanner;

public class PrintMazePath {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        printmazepath(0,0,n-1,m-1,"");
    }

    private static void printmazepath(int sr, int sc, int dr, int dc,String out) {

        if(sr==dr && sc ==dc)
        {
            System.out.println(out);
            return;
        }
        if(sr>dr || sc>dc)
            return;

        printmazepath(sr,sc+1,dr,dc,out+"h");
        printmazepath(sr+1,sc,dr,dc,out+"v");

    }
}
