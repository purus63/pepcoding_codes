package Recusion.string;

import java.util.Scanner;

public class PrintMazePathWithJump {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        printmazepathwithjump(0,0,n-1,m-1,"");
    }

    private static void printmazepathwithjump(int sr, int sc, int dr, int dc,String out) {

        if(sr==dr && sc== dc)
        {
            System.out.println(out);
            return;
        }
        if(sr>dr || sc>dc)
            return;

        for(int i=1;i<=dc;i++)
        {
            printmazepathwithjump(sr,sc+i,dr,dc,out+"h"+i);
        }
        for(int i=1;i<=dr;i++)
        {
            printmazepathwithjump(sr+i,sc,dr,dc,out+"v"+i);
        }
        for(int i=1;i<=dc && i<=dr;i++)
        {
            printmazepathwithjump(sr+i,sc+i,dr,dc,out+"d"+i);
        }

    }
}
