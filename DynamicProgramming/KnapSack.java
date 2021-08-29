package DynamicProgramming;

import java.util.Scanner;

public class KnapSack {

    private static int knapsack(int[] val, int i,int[] wt, int bagwt,int max) {

        if(bagwt==0)
        {
            return max;
        }
        if(i==val.length)
        {
            return max;
        }

        int res=0;
        if(bagwt-wt[i]>=0)
        {
            res=knapsack(val,i+1,wt,bagwt-wt[i],max+val[i]);
        }
        res=Math.max(res,knapsack(val,i+1,wt,bagwt,max));

        return res;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int  val[] = new int[n];
        int  wt[]  = new int[n];

        for(int i=0;i<n;i++)
        {
            val[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            wt[i]=sc.nextInt();
        }

        int bagwt=sc.nextInt();

        //System.out.println(knapsack(val,0,wt,bagwt,0));
        int dp[][] =new int[n+1][bagwt+1];
        System.out.println(memoizedapproach(val,0,wt,bagwt,0,dp));
        //tabulationapproach(val,wt,bagwt);

    }

    private static int memoizedapproach(int[] val, int i, int[] wt, int bagwt, int max,int[][] dp) {
        if(bagwt==0)
        {
            return dp[i+1][bagwt]=max;
        }
        if(i==val.length)
        {
            return dp[i+1][bagwt];
        }

        int res=0;
        if(bagwt-wt[i]>=0)
        {
            res=memoizedapproach(val,i+1,wt,bagwt-wt[i],max+val[i],dp);
        }
        res=Math.max(res,memoizedapproach(val,i+1,wt,bagwt,max,dp));

        return dp[i+1][bagwt]=res;
    }


    private static void tabulationapproach(int[] val, int[] wt, int bagwt) {
        int n=val.length;
        int dp[][]=new int[n+1][bagwt+1];

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=bagwt;j++)
            {
                if(j-wt[i-1]>=0)
                {
                    dp[i][j]=Math.max(Math.max(dp[i-1][j-wt[i-1]]+val[i-1],dp[i-1][j]),dp[i][j-1]);
                }
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        System.out.println(dp[n][bagwt]);
    }


}
