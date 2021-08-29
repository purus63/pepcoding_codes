package Medium;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x=n/2;

        for(int i=0;i<n;i++)
        {for(int j=-1;j<=n;j++)
            {
                if(i+j<x || i+j>=n+x || i-j>x || j-i>x)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();}
    }
}
