package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class GetCommomElements1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
        HashMap<Integer,Integer> hmap1 =new HashMap<>();
        for(int i=0;i<n1;i++){
            int a=sc.nextInt();
            hmap1.put(a,hmap1.get(a)==null?1:hmap1.get(a)+1);
        }
        int n2=sc.nextInt();

        for(int i=0;i<n2;i++)
        {
            int a=sc.nextInt();
            if(hmap1.get(a)!=null) {
                System.out.println(a);
                hmap1.remove(a);
            }
        }
    }
}
