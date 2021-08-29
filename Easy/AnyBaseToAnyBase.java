package Easy;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();

        int x=getValueIndecimal(n,sourceBase);
        int y= getValueInBase(x,destBase);
        System.out.println(y);
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

