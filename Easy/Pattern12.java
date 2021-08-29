package Easy;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arrlen=(n*(n+1))/2;
        int arr[]= new int[arrlen];

        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<arrlen;i++){arr[i]=arr[i-1]+arr[i-2];}
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j<=i)
                {
                    System.out.print(arr[count++]+"\t");
                }
            }
            System.out.println();
        }
    }


}
