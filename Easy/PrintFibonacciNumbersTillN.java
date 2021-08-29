package Easy;

import java.util.Scanner;

public class PrintFibonacciNumbersTillN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int fib[]= new int [n+1];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<n;i++)
        {
            fib[i]=fib[i-1]+fib[i-2];

        }
        for(int i=0;i<n;i++)
        {System.out.println(fib[i]);}
    }
}
