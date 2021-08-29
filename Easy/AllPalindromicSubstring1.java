package Easy;

import java.util.Scanner;
//dp Approach
public class AllPalindromicSubstring1 {
    public static void solution(String str){
        int n=str.length();
        boolean dp[][] =new boolean[n][n];

        for(int i=0;i<n;i++)
        {dp[i][i]=true;}

        for(int k=2;k<n;k++)
        {
            for(int i=0;i<n-k+1;i++) {
                int j=i+k-1;
                if(k==2 && str.charAt(i)==str.charAt(j))
                {dp[i][j]=true;}
                else if(k==2)
                {dp[i][j]=false;}
                else if(str.charAt(i)==str.charAt(j) && dp[i+1][j-1])
                {dp[i][j]=true;}
                else
                {dp[i][j]=false;}
            }
        }

        for(int k=1;k<=n;k++)
        {
            for(int i=0;i<n-k+1;i++) {
                int j=i+k-1;
                if(dp[i][j]==true)
                    System.out.println(str.substring(i,j+1));
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        solution(str);
    }
}
