package PepcodingPractice;

import java.util.Scanner;

public class PrintZ {

    public static void main(String[] args) {
        // Write your code here
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
        {System.out.print("*");}
        System.out.println();

        for(int i=1;i<n-1;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i+j==n-1)
                {System.out.print("*");}
                else
                {System.out.print(" ");}
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {System.out.print("*");}
    }
}
