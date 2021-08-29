package DynamicProgramming;

import java.util.Scanner;

public class Goldmine {

    private static int recursion(int[][] arr, int i, int j, int n, int m) {

        if(j==m-1)
        {
            return arr[i][j];
        }

        int up,right,down;
        up=right=down=Integer.MIN_VALUE;

        if(i-1>=0)
            up=recursion(arr,i-1,j+1,n,m);

        right=recursion(arr,i,j+1,n,m);
        if(i+1<n)
            down=recursion(arr,i+1,j+1,n,m);

        return Math.max(up,Math.max(right,down))+arr[i][j];

    }

    private static void tabulapproach(int[][] arr, int x, int y,int n,int m,int[][] dp) {


        for(int j=y;j<m;j++)
        {
            for(int i=0;i<n;i++)
            {
                if(i==0)
                {
                    dp[i][j]=arr[i][j]+Math.max(dp[i][j-1],dp[i+1][j-1]);
                }
                else if(i==n-1)
                {
                    dp[i][j]=arr[i][j]+Math.max(dp[i-1][j-1],dp[i][j-1]);
                }
                else
                {
                    dp[i][j]=arr[i][j]+Math.max(Math.max(dp[i][j-1],dp[i+1][j-1]),dp[i][j-1]);
                }
            }

        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,dp[i][m-1]);
        }
        System.out.println(max);

    }

    public static void main(String[] args) {
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

        /*int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            maxi = Math.max(maxi,recursion(arr,i,0,n,m));
        }
        System.out.println(maxi);*/

        int [][]dp=new int[n][m];
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            maxi = Math.max(maxi,memoizedapproach(arr,i,0,n,m,dp));
        }
        System.out.println(maxi);



       /* int [][]dp=new int[n][m];
        for(int i=0;i<n;i++)
        {
            dp[i][0]=arr[i][0];
        }
        tabulapproach(arr,0,1,n,m,dp);*/



    }

    private static int memoizedapproach(int[][] arr, int i, int j, int n, int m, int[][] dp) {
        if(j==m-1)
        {
            return dp[i][j]=arr[i][j];
        }
        if(dp[i][j]!=0)
        {
            return dp[i][j];
        }

        int up,right,down;
        up=right=down=Integer.MIN_VALUE;

        if(i-1>=0)
            up=memoizedapproach(arr,i-1,j+1,n,m,dp);

        right=memoizedapproach(arr,i,j+1,n,m,dp);
        if(i+1<n)
            down=memoizedapproach(arr,i+1,j+1,n,m,dp);

        return dp[i][j]=Math.max(up,Math.max(right,down))+arr[i][j];

    }


}
