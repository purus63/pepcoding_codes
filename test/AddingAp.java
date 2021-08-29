package test;

import java.util.Scanner;

public class AddingAp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();

        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int Q=sc.nextInt();
        int L,R,a,d;
        while(Q>0)
        {
            L=sc.nextInt();
            R=sc.nextInt();
            a=sc.nextInt();
            d=sc.nextInt();
            int idx=0;

            for(int i=L-1;i<=R-1;i++)
            {
                arr[i]=arr[i]+a+idx*d;
                idx++;
            }
            Q--;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }

    }
}
