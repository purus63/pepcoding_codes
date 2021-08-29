package DynamicProgramming;

import java.util.Scanner;

public class PaintHouse {
    public static void main(String[] args) throws Exception     {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int arr[][]= new int[n][3];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        int dp[][]=new int[n+1][3];

        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<3;j++)
            {
                dp[i][j]=Math.min(dp[i-1][(j+1)%3],dp[i-1][(j+2)%3])+arr[i-1][j];
            }
        }
        int ans=-1;
        if(dp[n][0]<dp[n][1] && dp[n][0]<dp[n][2])
            ans=dp[n][0];
        else if(dp[n][1]<dp[n][0] && dp[n][1]<dp[n][2])
            ans=dp[n][1];
        else if(dp[n][2]<dp[n][0] && dp[n][2]<dp[n][1])
            ans=dp[n][2];

        System.out.println(ans);

    }
}
