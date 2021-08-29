package DynamicProgramming;

import java.util.Scanner;

public class TargetSubsetSumDp {

    private static void dptabulationapproach(int[] arr, int n, int tar) {

        boolean [][]dp =new boolean[n+1][tar+1];

        for(int i=1;i<=n;i++)
        {
            dp[i][0]=true;
        }
        for(int j=0;j<=tar;j++)
        {
            dp[0][j]=false;
        }

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=tar;j++)
            {
                if(arr[i-1]<j)
                    dp[i][j]=(dp[i-1][j-arr[i-1]] || dp[i-1][j]);
                else if(arr[i-1]>j)
                    dp[i][j]=dp[i-1][j];
                else
                    dp[i][j]= true;
            }
        }
        System.out.println(dp[n][tar]);
    }

    private static boolean rec_findtarget(int[] arr, int i, int tar) {

        boolean t1=false;
        if(tar==0)
        {
            return true;
        }
        if(i==arr.length)
            return false;

        if(tar-arr[i]>=0) {
            t1 = rec_findtarget(arr, i + 1, tar - arr[i]);
        }
         t1 = t1 || rec_findtarget(arr, i + 1, tar);

        return t1;
    }


    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int tar=sc.nextInt();

        //System.out.println(rec_findtarget(arr,0,tar));
        //dptabulationapproach(arr,n,tar);

        boolean [] dp= new boolean[tar+1];
        System.out.println(memoizationapproach(arr,0,tar,dp));


    }

    private static boolean memoizationapproach(int[] arr, int i, int tar,boolean [] dp) {

        if(tar==0)
        {
            return dp[tar]=true;
        }
        if(dp[tar])
        {
            return dp[tar];
        }
        if(i==arr.length)
        {
            return dp[tar]=false;
        }
        boolean res=false;

        if(tar-arr[i]>=0) {
            res = memoizationapproach(arr, i + 1, tar - arr[i],dp);
        }
            res =res || memoizationapproach(arr, i + 1, tar,dp);

        return dp[tar]=res;
    }


}
