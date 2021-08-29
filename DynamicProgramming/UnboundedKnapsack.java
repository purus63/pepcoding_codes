package DynamicProgramming;

import java.util.Scanner;

public class UnboundedKnapsack {

    private static int unboundedknapsack(int[] val, int[] wt, int bagwt, int i,int max) {

        if(bagwt==0)
            return max;
        if(i==val.length)
            return max;

        int res=0;
        if(bagwt-wt[i]>=0)
        {
            res=unboundedknapsack(val,wt,bagwt-wt[i],i,max+val[i]);
        }
        res=Math.max(res,unboundedknapsack(val,wt,bagwt,i+1,max));

        return res;
    }


    public static void main(String[] args) {
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


        //System.out.println(unboundedknapsack(val,wt,bagwt,0,0));
        int dp[][]=new int[n+1][bagwt+1];
        System.out.println(memoizedunboundedknapsack(val,wt,bagwt,0,0,dp));
    }

    private static int memoizedunboundedknapsack(int[] val, int[] wt, int bagwt, int i, int max, int[][] dp) {
        if(bagwt==0)
            return max;
        if(i==val.length)
            return max;

        int res=0;
        if(bagwt-wt[i]>=0)
        {
            res=unboundedknapsack(val,wt,bagwt-wt[i],i,max+val[i]);
        }
        res=Math.max(res,unboundedknapsack(val,wt,bagwt,i+1,max));

        return res;

    }



}
