package LEVEL1.A__REVISION.TimeAndSpace;

import java.util.Scanner;

public class WordSort {
    public static void sortDates(String[] arr) {
        // write your code here
        for(int i=3;i>=0;i--)
        {
            countsort(arr,i);
        }
    }

    private static void countsort(String[] narr, int idx) {

        int n=narr.length;
        String ans[]= new String[n];

        int fmap[]= new int[26];
        for(int i=0;i<n;i++)
        {
            int pos=narr[i].charAt(idx)-'a';
            fmap[pos]++;
        }

        for(int i=1;i<26;i++)
        {
            fmap[i]+=fmap[i-1];
        }

        for(int i= n-1;i>=0;i--)
        {
            int pos=fmap[narr[i].charAt(idx)-'a']-1;
            ans[pos]=narr[i];
            fmap[narr[i].charAt(idx)-'a']--;
        }
        for(int i=0;i<n;i++)
        {
            narr[i]=ans[i];
        }
    }

    public static void countSort(String[] arr,int div, int mod, int range) {
        // write your code here
    }

    public static void print(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String str = scn.next();
            arr[i] = str;
        }
        sortDates(arr);
        print(arr);
    }

}
