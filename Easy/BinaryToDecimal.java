package Easy;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int i=0,temp=0,num=0;
        while(n>0)
        {
            temp= n%2;
            n=n/10;

            num+=temp*Math.pow(2,i);
            i++;
        }
        System.out.println(num);
    }
}
