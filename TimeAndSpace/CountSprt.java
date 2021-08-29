package TimeAndSpace;

import java.util.Scanner;


public class CountSprt {
    //Simple
    /*public static void countSort(int[] arr, int mini, int maxi) {
        int len= maxi-mini+1;
        int hmap[] =new int[len];

        int idx=0;
        for(int i=0;i<arr.length;i++)
        {
            hmap[arr[i]-mini]++;
        }
        for(int i=0;i<len;i++)
        {
            int val=i+mini;
            int freq=hmap[i];
            for(int j=0;j<freq;j++)
            {
                arr[idx]=val;
                idx++;
            }

        }

    }*/
    public static void countSort(int[] arr, int mini, int maxi) {
        int fmap[]= new int[maxi-mini+1];
        int idx=0;
        for(int i=0;i<arr.length;i++)
        {
            idx=arr[i]-mini;
            fmap[idx]++;
        }
        fmap[0]--;
        for(int i=1;i<fmap.length;i++)
        {
            fmap[i]+=fmap[i-1];
        }

        int newarr[] = new int[arr.length];

        for(int i=arr.length-1;i>=0;i++)
        {
            int val= arr[i]-mini;
            int indx= fmap[val];
            fmap[val]--;
            newarr[indx]=arr[i];

        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=newarr[i];
        }

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        countSort(arr,min,max);
        print(arr);
    }

}
