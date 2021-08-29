package Easy;

import java.util.Scanner;

public class AnyBaseAddition1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int res= anyBaseAdd(b,n1,n2);
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
}
