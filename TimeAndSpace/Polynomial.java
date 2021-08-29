package TimeAndSpace;

import java.util.Scanner;

public class Polynomial {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int n=sc.nextInt();

        //int sol=f1(x,n);
        int bestapp= poly(x,n);
        System.out.println(bestapp);
    }

    private static int poly(int x, int n) {
        int ans=0;
        int N=n;
        int X=x;
        for(int i=1;i<=n;i++)
        {
            ans+=N*x;
            N--;
            x*=X;
        }
        return ans;
    }

    private static int f1(int x, int n) {
        int ans=0,prod=1;
        for(int i=1;i<=n;i++)
        {
            prod=1;
            int temp=n-i+1;
            while(temp>0)
            {prod*=x;temp--;}
            ans+=i*prod;
        }
        return ans;
    }

    private static int f(int x, int n,int i) {

        if(n==0)
            return 0;
        int sol= (int) (i*Math.pow(x,n));
        return sol+f(x,n-1,i+1);
    }
}
