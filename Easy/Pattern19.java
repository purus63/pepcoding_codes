package Easy;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int x=n/2;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(x==i || x==j || (i==n-1 && j>x) || (j==0 && i>x) || (j==n-1 && i<x) ||(i==0 && j<x))
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
