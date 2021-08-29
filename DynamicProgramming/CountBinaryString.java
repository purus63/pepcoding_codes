package DynamicProgramming;

import java.util.Scanner;

public class CountBinaryString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        //System.out.println(rec_helper(n,"1"));
        int dp[][] = new int[n+1][2];
        System.out.println(memoized(n,"1",dp));
    }

    private static int memoized(int n, String s,int[][] dp) {
        if(n==0)
        {
            if(s.charAt(0)=='1')
                return 1;
            if(s.charAt(0)=='0')
                return 1;
        }
        int x=s.charAt(0)-'0';
        if(dp[n][x]!=0)
        {
            return dp[n][x];
        }

        if(s.charAt(0)=='1') {
            dp[n-1][0]=memoized(n-1,"0",dp);//1 0
            dp[n-1][1]=memoized(n-1,"1",dp);//1 1
        }
        else
            return dp[n-1][1]=memoized(n-1,"1",dp);

        return dp[n-1][1]+dp[n-1][0];
    }

    private static int rec_helper(int n,String s) {

        if(n==0)
        {
            return 1;
        }
        if(s.charAt(0)=='1') {
           return rec_helper(n-1,"0")+rec_helper(n-1,"1");
        }
        else
            return rec_helper(n-1,"1");
    }

}
