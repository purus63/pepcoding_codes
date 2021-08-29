package LEVEL1.A__REVISION.Recursion.Introduction.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AllIndicesOfArray {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        // write ur code here
        if(arr.length==idx)
        {
            return new int[fsf];
        }
        if(arr[idx]==x)
            fsf++;
        int base[]= allIndices(arr,x,idx+1,fsf);

        if(arr[idx]==x)
        {
            base[--fsf]=x;
        }
        return base;

    }

}
