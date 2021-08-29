package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RotateAnArray {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }



    public static void rotate(int[] a, int k){
        int flag=0,temp=0;
        int len=a.length;
        if(k<0)
            k=len-(Math.abs(k)%len);
        else
            k=k%len;
        for(int i=0;i<k;i++)
        {RotateToLeftByOne(a);}


    }

    /*private static void RotateToRightByOne(int[] a) {

        int temp=a[a.length-1];
        int i=0;
        for(i=a.length-1;i>0;i--)
        {a[i]=a[i-1];}
        a[0]=temp;
    }
*/
    private static void RotateToLeftByOne(int[] a) {
        int temp=a[0];
        int i=0;
        for(i=1;i<a.length;i++)
        {
            a[i-1]=a[i];
        }
        a[i-1]=temp;
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);
    }

}
