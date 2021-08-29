package Easy;

import java.util.Scanner;

import static java.lang.Math.max;

public class BarChart {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]= new int[n];

        int maxi=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            maxi=max(maxi,arr[i]);
        }


        char dp[][] =new char[maxi][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<maxi;j++)
            {
                if(maxi-j<=arr[i])
                dp[j][i]='*';
            }
        }
        for(int i=0;i<maxi;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(dp[i][j]=='*')
                System.out.print(dp[i][j]+"\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

}
