package Easy;

import java.util.Scanner;

public class DifferenceOfTwoArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int arr1[]=new int[n1];

        for(int i=0;i<n1;i++)
        {arr1[i]=sc.nextInt();}

        int n2=sc.nextInt();
        int arr2[] =new int[n2];
        for(int i=0;i<n2;i++)
        {arr2[i]=sc.nextInt();}

        int l=n2;

        int res[]= new int [l];
        int temp,ll=l;

        while(l>0 && n1>0)
        {
            if(arr2[l-1]<arr1[n1-1])
            {
                arr2[l-1]+=10;
                arr2[l-2]--;
            }
            temp=arr2[l-1]-arr1[n1-1];
            res[l-1]=temp;
            l--;
            n1--;
        }
        while(l>0)
        {
            temp=arr2[l-1];
            res[l-1]=temp;
            l--;
        }
        int flag=0;
        for(int i=0;i<n2;i++)
        {
            if(flag==0 && res[i]==0)
            {continue;}
            else
            {
                flag=1;
                System.out.print(res[i]);
            }

        }

    }

}
