package LEVEL1.A__REVISION.TimeAndSpace;

public class Stable_CountSort {
    public static void main(String[] args) {
        int arr[]={2,13,9,8,2,6,5,7,6};

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            min=Integer.min(arr[i],min);
            max=Integer.max(arr[i],max);
        }
        stable_countsort(arr,min,max);
        for(int i:arr)
            System.out.println(i);
    }

    private static void stable_countsort(int[] arr, int min, int max) {

        int[] ans=new int[arr.length];

        int fmap[]=new int[max-min+1];
        for(int i=0;i<arr.length;i++)
        {
            fmap[arr[i]-min]++;
        }

        for(int i=1;i<fmap.length;i++)
        {
            fmap[i]+=fmap[i-1];
        }

        for(int i=arr.length-1;i>=0;i--)
        {
            int pos=fmap[arr[i]-min]-1;
            ans[pos]=arr[i];
            fmap[arr[i]-min]--;
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=ans[i];
        }
    }
}
