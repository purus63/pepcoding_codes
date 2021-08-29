package Easy;

import java.util.Scanner;

public class PythogoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        a=a*a;
        b=b*b;
        c=c*c;
        if(a>b && a>c && a==b+c)
        {
            System.out.println(true);
        }
        else if(b>a && b>c && b==c+a)
        {            System.out.println(true);
        }
        else if(c>a && c>b && c==a+b)
        {            System.out.println(true);
        }
        else
            System.out.println(false);
    }
}
