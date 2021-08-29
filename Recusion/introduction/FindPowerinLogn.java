package Recusion.introduction;

import java.util.Scanner;

public class FindPowerinLogn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int x =sc.nextInt();

        System.out.println(findpower(n,x));

    }

    private static int findpower(int n, int x) {

        int val;

        if(x==0)
            return 1;
        val=findpower(n,x/2);
        if(x%2==0)
            return val*val;
        else
            return val*val*n;
    }
}
