package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class ClimbStairsWithMinimumMoves {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int dp[]= new int[n];
        Arrays.fill(dp,Integer.MAX_VALUE-1);
        for(int i=n-1;i>=0;i--)
        {

            if(arr[i]>0)
            {
                if(i+arr[i]>=n)
                {
                    dp[i]=1;
                }
                else
                {
                    for(int j=1;j<=arr[i];j++)
                    {
                        if(dp[i+j]<0)
                            continue;
                        dp[i]=Math.min(1+dp[i+j],dp[i]);
                    }
                }
            }
        }
        if(dp[0]==Integer.MAX_VALUE)
            System.out.println("null");
        else
            System.out.println(dp[0]);
    }

}
