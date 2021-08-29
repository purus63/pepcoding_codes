package DynamicProgramming;

import java.util.Scanner;

public class CoinChangePermutation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int []arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int amt=sc.nextInt();

        //int dp[]= new int[amt+1];
        //System.out.println(tabcoinchangepermutation(arr,amt,dp));

        System.out.println(coinchangerec(arr,amt));
    }

    private static int coinchangerec(int[] arr, int amt) {
        if(amt==0)
        {
            return 1;
        }

        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(amt-arr[i]>=0)
                count+=coinchangerec(arr,amt-arr[i]);
        }
        return count;
    }

    private static int tabcoinchangepermutation(int[] arr, int amt,int dp[]) {
        dp[0]=1;

        for(int i=1;i<=amt;i++)
        {
            for(int coin:arr)
            {
                if(i-coin>=0)
                    dp[i]+=dp[i-coin];
            }
        }
        return dp[amt];
    }
}
