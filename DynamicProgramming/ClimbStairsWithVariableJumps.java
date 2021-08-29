package DynamicProgramming;

import java.util.Scanner;

public class ClimbStairsWithVariableJumps {
    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];


        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int dp[]= new int[n];



        for(int i=n-1;i>=0;i--)
        {
            int temp=arr[i];
            if(temp>0)
            {
                if(i+temp>=n)
                {dp[i]=dp[i]+1;}
                for(int j=1;j<=temp;j++)
                {
                    if(j+i<n)
                    {dp[i]+=dp[i+j];}
                    else
                        break;
                }
            }
            else
                dp[i]=0;
        }
        System.out.print(dp[0]);
    }
}
