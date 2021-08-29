package Easy;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int b= sc.nextInt();
        int dn= getValueInBase(n,b);
        System.out.println(dn);

    }

    private static int getValueInBase(int n, int b) {
        String str="";
        int temp=0;
        while(n>0)
        {
            temp=n%b;
            n=n/b;
            str=temp+str;
        }
        return Integer.parseInt(str);
    }
}
