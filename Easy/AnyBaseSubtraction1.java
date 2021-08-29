package Easy;

import java.util.Scanner;

public class AnyBaseSubtraction1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int res= anyBaseSub(b,n1,n2);
        System.out.println(res);

    }

    private static int anyBaseSub(int b, int n1, int n2) {




        int val1=0,val2=0,carry=0,diff=0;
        int res=0,power=1;

        while(n2>0)
        {
            val1=n1%10;
            n1/=10;
            val2=n2%10;
            n2/=10;

            diff=val2-val1+carry;
            if(diff<0)
            {diff+=b;carry=-1;}
            else {
                carry=0;
            }
            res+=diff*power;
            power*=10;
        }
        return res;
    }
}
