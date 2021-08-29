package Easy;

import java.util.Scanner;

public class AnyBaseSubstraction {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int b=sc.nextInt();
        int n1=sc.nextInt();
        int n2= sc.nextInt();

        int x=getValueIndecimal(n1,b);
        int y=getValueIndecimal(n2,b);
        System.out.println(getValueInBaseB(x-y,b));

    }

    private static int getValueInBaseB(int n,int b) {

        int temp=0,res=0,i=0;
        while(n>0)
        {
            temp=n%b;
            n=n/b;
            res+=temp*Math.pow(10,i);
            i++;
        }
        return  res;
    }

    public static int getValueIndecimal(int n, int b){
        int ans=0;
        int temp=0,count=0;
        while(n>0)
        {
            temp=n%10;
            n=n/10;
            ans+=temp*Math.pow(b,count++);
        }
        return ans;
    }
}
