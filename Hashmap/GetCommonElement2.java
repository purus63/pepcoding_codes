package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class GetCommonElement2 {

    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();

        HashMap<Integer,Integer> hmap = new HashMap<>();

        for(int i=0;i<n1;i++)
        {
            int a =sc.nextInt();
            hmap.put(a,hmap.get(a)==null?1:hmap.get(a)+1);
        }

        int n2=sc.nextInt();

        for(int i=0;i<n2;i++)
        {
            int a =sc.nextInt();
            if(hmap.get(a)!=null && hmap.get(a)>0)
            {
                System.out.println(a);
                hmap.put(a,hmap.get(a)-1);
            }
        }

    }
}
