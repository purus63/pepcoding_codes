package test;

import java.util.Scanner;

public class PositiveAND {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n+1];
        for(int i=1;i<=n;i++)
        {arr[i]=sc.nextInt();}

        int BIN[][]= new int[n+1][32];

        for(int i=1;i<=n;i++)
        {
            int temp =arr[i];
            for(int j=0;j<32 && temp>0;j++)
            {
                int mod=temp%2;
                temp=temp/2;
                BIN[i][j]=mod;
            }
        }
        int count[][] =new int [32][n+1];
        for(int i=0;i<32;i++)
        {
                count[i][1]=BIN[1][i];
               for(int j=2;j<=n;j++)
               {
                   if(BIN[j][i]==1)
                        count[i][j]=count[i][j-1]+1;
                   else
                       count[i][j]=count[i][j-1];
               }
        }



        int Q,L,R;
        Q=sc.nextInt();
        while(Q>0)
        {
            L=sc.nextInt();
            R=sc.nextInt();

            int reqd1= R-L+1;

            for(int i=0;i<32;i++)
            {
                for(int j=L;j<=R;j++)
                {

                }
            }


            Q--;
        }


    }
}
