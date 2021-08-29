package LEVEL1.A__REVISION.StackQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class XNextGreaterElement {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] nge = solve(a);
        display(nge);
    }

    public static int[] solve(int[] arr){
        // solve
        int n=arr.length;
        int ans[] = new int[n-1];
        ans[n-1]=-1;
        for(int i=n-2;i>=0;i--)
        {

        }
        return null;
    }
}
