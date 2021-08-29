package TimeAndSpace;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class TargetSumPair1 {
    public static void targetSumPairX(int[] arr, int target){
        //2nd approach
        //if i get the two element in the beginning i will print it first
        ArrayList<Integer> al= new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(al.contains(target-arr[i]))
            {
                System.out.println(arr[i]+", "+(target-arr[i]));
            }else
            {
                al.add(arr[i]);
            }
        }
    }

    private static void targetSumPair(int[] arr, int target) {
        int left=0,right=arr.length-1;
        sort(arr);
        while(left<right)
        {
            if(arr[left]+arr[right]==target)
            {
                System.out.println(arr[left]+", "+arr[right]);
                left++;right--;
            }
            else if(arr[left]+arr[right]>target)
            {
                right--;
            }
            else if(arr[left]+arr[right]<target)
            {
                left++;
            }
        }
    }


    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i < n; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        targetSumPair(arr,target);
    }


}
