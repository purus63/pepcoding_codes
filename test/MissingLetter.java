package test;

import java.util.Scanner;

public class MissingLetter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        int n,k;
        String s;
        while(t>0)
        {
            n=sc.nextInt();
            k=sc.nextInt();
            s= sc.next();
            StringBuilder sbr =new StringBuilder();
            sbr.append(s);
            int flag=0;
            for(int i=0;i<sbr.length()-k;i++)
            {
                if(sbr.charAt(i)!=sbr.charAt(i+k) && sbr.charAt(i)!='?' && sbr.charAt(i+k)!='?')
                {
                    flag=1;
                    break;
                }
                else if(sbr.charAt(i)==sbr.charAt(i+k)  && sbr.charAt(i)=='?' &&  sbr.charAt(i+k)=='?')
                {
                    sbr.setCharAt(i,'a');
                    sbr.setCharAt(i+k,'a');
                }
                else if(sbr.charAt(i)!=sbr.charAt(i+k)  && sbr.charAt(i+k)=='?')
                {
                    sbr.setCharAt(i+k,sbr.charAt(i));
                }
                else if(sbr.charAt(i)!=sbr.charAt(i+k)  && sbr.charAt(i)=='?')
                {
                    sbr.setCharAt(i,sbr.charAt(i+k));
                }

            }
            if(flag==1)
            {
                System.out.println("-1");
            }
            else
                System.out.println(sbr);

            t--;
        }
    }
}
