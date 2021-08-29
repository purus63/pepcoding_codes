package DynamicProgramming;

import java.util.Scanner;

public class MinCostInMazeTraversal {

    private static int recursion(int i, int j, int[][] arr,int n,int m) {

        if(i==n-1 && j==m-1)
        {
            return arr[i][j];
        }
        int right= (int) 1e9;
        int down= (int) 1e9;

        if(j+1<m)
            right=recursion(i,j+1,arr,n,m);
        if(i+1<n)
            down=recursion(i+1,j,arr,n,m);

        return Math.min(down,right)+arr[i][j];

    }
    private static void tabulation(int n, int m, int[][] arr) {
        int dp[][]=new int[n][m];

        dp[0][0]=arr[0][0];

        for(int i=1;i<m;i++)
        {
            dp[0][i]=dp[0][i-1]+arr[0][i];
        }
        for(int i=1;i<n;i++)
        {
            dp[i][0]=dp[i-1][0]+arr[i][0];
        }

        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+arr[i][j];
            }
        }

        System.out.println(dp[n-1][m-1]);
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        //tabulation(n,m,arr);
        //System.out.println(recursion(0,0,arr,n,m));
        int [][]dp= new int[n][m];
        System.out.println(memoizationdp(arr,0,0,n,m,dp));

    }

    private static int memoizationdp(int[][] arr, int i,int j,int n, int m, int[][] dp) {

        if(i==n-1 && j==m-1)
        {
            dp[i][j]=arr[i][j];
            return dp[i][j];
        }
        if(dp[i][j]!=0)
        {
            return dp[i][j];
        }

        int right= (int) 1e9;
        int down= (int) 1e9;

        if(j+1<m)
            right=memoizationdp(arr,i,j+1,n,m,dp);
        if(i+1<n)
            down= memoizationdp(arr,i+1,j,n,m,dp);

        dp[i][j]=Math.min(right,down)+arr[i][j];
        return dp[i][j];
    }


}
