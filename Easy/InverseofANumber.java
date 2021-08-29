package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class InverseofANumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int inv=0;
        int mod=0;
        int i=1;
        while(n!=0)
        {
            mod=n%10;
            inv+=Math.pow(10,mod-1)*i;
            n=n/10;
            i++;
        }
        System.out.println(inv);




        /*Solution lenghty*/
       /* String str=Integer.toString(n);
        StringBuilder sbr= new StringBuilder();
        sbr.append(str);

        int len=str.length();
        int res[]= new int[len+1];

        int flag=0,temp,sum=0;
        for(int i=0;i<len;i++)
        {
            temp= Integer.parseInt(String.valueOf(str.charAt(i)));
            sum+=temp;
            if(temp>len)
            {
                flag = 1;
            }
        }
        int val=(len*(len+1))/2;

        if(flag==0 || sum==val)
        {
            sbr.reverse();
          for(int i=0;i<len;i++)
            {
                temp= Integer.parseInt(String.valueOf(sbr.charAt(i)));
                res[temp]=i+1;
            }
        }
       for(int i=len;i>0;i--)
       {
           System.out.print(res[i]);
       }*/
    }
}
