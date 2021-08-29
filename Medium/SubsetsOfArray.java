package Medium;

import java.util.Scanner;

public class SubsetsOfArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();

        int dp[]= new int[n];

        for(int i=0;i<n;i++)
        {
            dp[i]=sc.nextInt();
        }

        int bnlen = (int) Math.pow(2,n);

        int temp,r;
        for(int i=0;i<bnlen;i++)
        {
            temp=i;
            String str="";
            for(int j=n-1;j>=0;j--)
            {

                r=temp%2;
                temp=temp/2;
                if(r==0){
                    str="\t-"+str;
                }
                else{
                    str="\t"+dp[j]+str;
                }
            }
            System.out.println(str.trim());
        }

    }
}
