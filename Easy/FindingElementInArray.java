package Easy;

import java.util.Scanner;

public class FindingElementInArray {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]= new int[n];
        for(int i=0;i<n;i++){arr[i]=sc.nextInt();}

        int d=sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==d)
            {System.out.println(i);flag=1;}
        }
        if(flag==0)
            System.out.println(-1);

    }
}
