package LEVEL1.A__REVISION.leetcode;

import java.util.HashMap;
import java.util.Stack;

public class LeetCode496 {
/*
[1,3,5,2,4]
[6,5,4,3,2,1,7]
* */
    public static void main(String[] args) {
        int arr1[]={1,3,5,2,4};
        int arr2[]={6,5,4,3,2,1,7};

        int res[] = nextGreaterElement(arr1,arr2);
        for(int a:res)
        {
            System.out.println(a);
        }
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> hmap= new HashMap<>();
        Stack<Integer> st= new Stack<>();

        for(int a:nums2)
        {

            while(st.size()>0 && a>st.peek())
            {
                hmap.put(st.pop(),a);
            }
            st.push(a);
        }

        while(st.size()>0)
        {
            hmap.put(st.pop(),-1);
        }

        int ans[] =new int [nums1.length];

        for(int i=0;i<nums1.length;i++)
        {
            ans[i]=hmap.getOrDefault(nums1[i],-1);
        }
        return ans;
    }
}
