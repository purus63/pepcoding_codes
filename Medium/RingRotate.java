package Medium;

import java.util.Scanner;

public class RingRotate {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int [][]arr= new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        int s=sc.nextInt();
        int r=sc.nextInt();

        int oned[] = fillarray(arr,s);
        reverse(oned,r);
        refill2D(arr,oned,s);
        display(arr);
    }

    private static void refill2D(int[][] arr, int[] oned, int s) {

        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int idx = 0;
        //minr,minc->maxr,minc
        for (int i = minr; i <= maxr; i++) {
            arr[i][minc] = oned[idx++];
        }
        //maxr,minc+1->maxr,maxc
        for (int i = minc + 1; i <= maxc; i++) {
            arr[maxr][i] = oned[idx++] ;
        }
        //maxr-1,maxc ->minr ,maxc
        for (int i = maxr - 1; i >= minr; i--) {
            arr[i][maxc] =oned[idx++];
        }
        //minr,maxc-1 ->minr,minc+1
        for (int i =maxc-1; i >= minc+1; i--) {
            arr[minr][i] = oned[idx++];
        }

    }

    private static void reverse(int[] oned, int r) {

        int n=oned.length;
        r=r%n;
        if(r<0)
        {r=r+n;}

        reversepart(oned,0,n-1-r);
        reversepart(oned,n-r,n-1);
        reversepart(oned,0,n-1);

    }

    private static void reversepart(int[] oned, int i, int j) {
        int temp=0;
        while(i<j)
        {
            temp=oned[i];
            oned[i]=oned[j];
            oned[j]=temp;
            i++;j--;
        }
    }

    private static int[] fillarray(int[][] arr, int s) {

        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int len = 2 * (maxr - minr) + 2 * (maxc - minc);
        int oned[] = new int[len];

        int idx = 0;
        //minr,minc->maxr,minc
        for (int i = minr; i <= maxr; i++) {
            oned[idx++] = arr[i][minc];
        }
        //maxr,minc+1->maxr,maxc
        for (int i = minc + 1; i <= maxc; i++) {
            oned[idx++] = arr[maxr][i];
        }
        //maxr-1,maxc ->minr ,maxc
        for (int i = maxr - 1; i >= minr; i--) {
            oned[idx++] = arr[i][maxc];
        }
        //minr,maxc-1 ->minr,minc+1
        for (int i =maxc-1; i >= minc+1; i--) {
            oned[idx++] = arr[minr][i];
        }

        return oned;
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
