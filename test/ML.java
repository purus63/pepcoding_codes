package test;

import java.util.HashSet;
import java.util.Scanner;

public class ML {
    public static void main(String[] args) {
        HashSet<String> hSet =new HashSet<>();
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
                else if(sbr.charAt(i)!=sbr.charAt(i+k)  && sbr.charAt(i)=='?' &&  sbr.charAt(i+k)=='?')
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
            /*for(int i=0;i<sbr.length()-k;i++)
            {
                if(sbr.charAt(i)==sbr.charAt(i+k))
                {hSet.add(sbr.substring(i,i+k+1));}
            }
            for (String val : hSet) {
                    System.out.println(val);
                break;
            }
            if(hSet.size()<1)
            {
                System.out.println("-1");
            }
            hSet.clear();*/
            t--;
        }
    }
}
