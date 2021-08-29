package Medium;

import java.util.Scanner;

public class AnyBaseMultiplication1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int res= anyBaseMultiply(b,n1,n2);
        System.out.println(res);

    }

    private static int anyBaseAdd(int b, int n1, int n2) {

        int carry=0,power=1,rem,res=0;
        int val1,val2,sum=0;
        while(n1>0 || n2>0)
        {
            val1=n1%10;
            n1=n1/10;
            val2=n2%10;
            n2=n2/10;
            sum=val1+val2+carry;
            rem=sum%b;
            carry= sum/b;
            res+=rem*power;
            power*=10;
        }
        sum=carry;
        res+=carry*power;
        return res;
    }

    private static int anyBaseMultiply(int b, int n1, int n2) {

        int temp=0,res=0,val1,val2,N2,power=1,carry;
        while(n1>0)
        {
            res=0;
            val1=n1%10;
            n1/=10;

            N2=n2;
            carry=0;
            int powr=1,mult=0,sum=0;
            while(N2>0 || carry!=0)
            {
                val2=N2%10;
                N2/=10;
                mult=val1*val2+carry;
                carry=mult/b;
                sum=mult%b;
                res+=sum*powr;
                powr*=10;
            }
            res=res*power;
            power*=10;
            temp=anyBaseAdd(b,res,temp);
        }
    return temp;
    }

}
