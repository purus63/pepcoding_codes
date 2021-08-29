package Easy;

import java.util.Scanner;

public class SumOfTwoArray {
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

        int l=0,s=0;
        if(n1>n2) {l=n1;s=n2; }
        else{l=n2;s=n1;}
        int ddlj=l;
        int res[]=new int[l+1];
        int temp=0,carry=0;

        while(l>0 &&n1>0 && n2>0)
        {
            temp=arr1[n1-1]+arr2[n2-1]+carry;
            if(temp>9){
                carry=temp/10;
                temp=temp%10;}
            else
                carry=0;
            res[l]=temp;
            l--;
            n1--;
            n2--;
        }
        while(l>0 &&n1>0)
        {
            temp=arr1[n1-1]+carry;
            if(temp>9){
                carry=temp/10;
                temp=temp%10;}
            else
                carry=0;
            res[l]=temp;
            l--;
            n1--;
        }
        while(l>0 && n2>0)
        {
            temp=arr2[n2-1]+carry;
            if(temp>9){
                carry=temp/10;
                temp=temp%10;}
            else
                carry=0;
            res[l]=temp;
            l--;
            n2--;
        }
        if(carry>0)
            res[0]=carry;

        if(res[0]!=0)
            System.out.println(res[0]);;
        for(int i=1;i<=ddlj;i++)
        {
                System.out.println(res[i]);
        }
    }
}
