package TimeAndSpace;

import java.util.Arrays;
import java.util.HashMap;

public class CountSortDemo {
    public static void main(String[] args) {
        int arr[]={2,2,2,5,5,5,5,3,3,3,6,6,6,6,6,7,7,7,1,1,1,0,0,0};

        int hmap[] =new int[8];
        for(int i=0;i<arr.length;i++)
        {
            hmap[arr[i]]++;
        }

        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(hmap[j]>0)
            {
                arr[i]=j;
                hmap[j]-=1;
            }
            else
            {j++;i--;}
        }
        System.out.println(Arrays.toString(arr));
    }
}
