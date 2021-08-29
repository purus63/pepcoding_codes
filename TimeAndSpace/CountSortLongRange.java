package TimeAndSpace;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class CountSortLongRange {
    public static void main(String[] args) {
        int arr[]={-10000000,-10000000,-10000000,-10000000,100000000,100000000,100000000,100000000,
                100000001,100000001,100000002,100000002,100000002,100000003,100000003,100000003};
        LinkedHashMap<Integer,Integer> hmap=new LinkedHashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            hmap.put(arr[i],hmap.containsKey(arr[i]) ? hmap.get(arr[i])+1 : 0);
        }

        int len=hmap.size();
        int idx=0,i=0;

        for (int ival : hmap.keySet())
        {
            int val=ival;
            int freq=hmap.get(ival);
            for(int j=0;j<freq;j++)
            {
                arr[idx]=val;
                idx++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
