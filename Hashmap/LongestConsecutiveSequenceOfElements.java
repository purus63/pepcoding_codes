package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class LongestConsecutiveSequenceOfElements {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int a =sc.nextInt();
            hmap.put(a,1);
        }
        //System.out.println(hmap);
        for (Integer k : hmap.keySet())
        {
            if(hmap.containsKey(k+1) && hmap.get(k+1)==1 && hmap.get(k)==1)
            {
                updatevalue(hmap,k+1);
                hmap.put(k,hmap.get(k)+hmap.get(k+1));
            }
            else if(hmap.containsKey(k+1) && hmap.get(k+1)>1 && hmap.get(k)==1)
            {
                hmap.put(k,hmap.get(k)+(hmap.get(k+1)));
            }
            else
                hmap.put(k,hmap.get(k));
        }

        int max_count=-1;
        int startingkey=-1;

        for (Integer k : hmap.keySet())
        {
            if(hmap.get(k)>max_count)
            {
                max_count=hmap.get(k);
                startingkey=k;
            }
        }

        for(int i=0;i<max_count;i++)
        {
            System.out.println(i+startingkey);
        }
    }

    private static void updatevalue(HashMap<Integer, Integer> hmap, int i) {
        if(hmap.containsKey(i+1) && hmap.get(i+1)==1 && hmap.get(i)==1)
        {
            updatevalue(hmap,i+1);
            hmap.put(i,hmap.get(i)+ (hmap.get(i+1)));
        }
        else  if(hmap.containsKey(i+1) && hmap.get(i+1)>1 &&  hmap.get(i)==1)
        {
            hmap.put(i,hmap.get(i)+(hmap.get(i+1)));
        }
        else
            hmap.put(i,hmap.get(i));
    }

}
