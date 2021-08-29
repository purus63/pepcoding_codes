package LEVEL1.A__REVISION.Recursion.Introduction;

import java.util.Scanner;

public class PowerLogarithmic {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();

        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        if(x==0)
            return 1;
        int x1 = power(x,n/2);
        if(n%2==1) {
            return x1*x1*x;
        }
        else
        {return x1*x1;}
    }
}
