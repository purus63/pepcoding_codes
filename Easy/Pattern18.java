package Easy;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==j || i+j==n-1 || i==n-1 || (i+j>=n && i+j<=2*i))
                    System.out.print("*\t");
                else
                    System.out.print("\t");

            }
            System.out.println();
        }


    }
}
