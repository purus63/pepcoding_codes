package TimeAndSpace;

public class RecBinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int high=arr.length-1;
        int low =0;
        //int idx=binarysearch(arr,low,high,99);
        int idx= linearsearch(arr,low,8);
        System.out.println(idx);
    }

    private static int linearsearch(int[] arr, int low, int data) {
        if(low==arr.length)
        {return -1;}
        if(arr[low]==data)
            return low;
        return linearsearch(arr,low+1,data);
    }

    private static int binarysearch(int[] arr, int low, int high,int data) {


        if(low>high)
        {
            return -1;
        }

        int mid=low+(high-low)/2;
        if(arr[mid]==data)
            return mid;
        else if(arr[mid]<data)
        {
            return binarysearch(arr,mid+1,high,data);
        }
        else
        {
           return binarysearch(arr,low,mid-1,data);
        }

    }
}
