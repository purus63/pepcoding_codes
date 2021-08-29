package Easy;

import java.util.Scanner;

public class GcdAndLcm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int gcd_out=gcd(a,b);
        int lcm_out=lcm(a,b);

        System.out.println(gcd_out);
        System.out.println(lcm_out);
    }

    private static int lcm(int a, int b) {
        return (a*b)/gcd(a,b);
    }

    private static int gcd(int a, int b) {
        if(a==0)
            return b;
        else
            return gcd(b%a,a);

    }


}
