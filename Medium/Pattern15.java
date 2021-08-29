package Medium;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = n / 2;
        int dp[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j < x || i + j >= n + x || j - i > x || i - j > x) {
                    continue;
                } else {
                    if (i <= x)
                    {dp[i][j] = i + 1;}
                    else
                    {dp[i][j] = dp[i - 1][j] - 1;}
                }
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j < x || i + j >= n + x || j - i > x || i - j > x || j==0) {continue;}
                else if(dp[i][j-1]!=0)
                    dp[i][j]=dp[i][j-1]+1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j < x || i + j >= n + x || j - i > x || i - j > x || j<=x) {continue;}
                else
                {dp[i][j]=dp[i][n-1-j];}
            }
        }

        for(int i=0;i<n;i++)
        {for(int j=0;j<n;j++)
            {
                if (i + j < x || i + j >= n + x || j - i > x || i - j > x) {
                    System.out.print("\t");
                }
                else{
                    System.out.print(dp[i][j]+"\t");
                }
            }
        System.out.println();}
    }
}
