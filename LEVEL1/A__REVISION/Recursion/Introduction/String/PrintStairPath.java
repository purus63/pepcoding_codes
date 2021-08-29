package LEVEL1.A__REVISION.Recursion.Introduction.String;

import java.util.Scanner;

public class PrintStairPath {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        printStairPaths(n,"");
    }

    public static void printStairPaths(int n, String path) {

        if(n==0)
        {
            System.out.println(path);
            return;
        }

        for(int i=1;i<=Math.min(3,n);i++) {
            printStairPaths(n - i, path + i);
        }
    }
}
