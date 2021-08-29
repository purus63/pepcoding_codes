package Easy;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrime {
    public static void main(String[] args) {

            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            ArrayList<Integer> al = new ArrayList<>();
            for(int i = 0 ; i < n; i++){
                al.add(scn.nextInt());
            }
            solution(al);
            System.out.println(al);


    }

    private static void solution(ArrayList<Integer> al) {
        int len=al.size();

        for(int i=len-1;i>=0;i--)
        {
            int count=0;
            int val=al.get(i);
            for(int j=2;j*j<=val;j++)
            {
                if(val%j==0)
                {count=1;break;}
            }
            if(count==0)
                al.remove(i);
        }
    }
}
