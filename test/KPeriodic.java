package test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class KPeriodic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();

        while(t>0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String str=sc.next();
            int temp=0,temp2=0,flag=0;
            ArrayList<String> al =new ArrayList<>();
            for(int l=2;l<=k;l++) {
                for (int i = 0; i < str.length() - l; i++) {
                    int j = i + l;
                    if (str.charAt(i) == str.charAt(j)) {
                        if (flag == 0) {
                            temp = i;
                        }
                        temp2 = j;
                        flag = 1;
                        continue;
                    } else {
                        al.add(str.substring(temp, j+1));
                        flag = 0;
                        i = j;
                        temp = i + 1;
                    }
                }
            }
            System.out.println(al);
            t--;
        }

    }
}
