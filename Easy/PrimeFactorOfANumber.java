package Easy;

import java.util.Scanner;

public class PrimeFactorOfANumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        primefactor(n);


    }

    private static void primefactor(int n) {

        int temp=n;
        for(int i=2;i*i<=n;i++)
        {
            while(temp%i==0)
            {
                System.out.print(i+" ");
                temp/=i;
            }
        }
        if(temp!=1)
        {
            System.out.print(temp);
        }
    }
}
