package Easy;

import java.util.Scanner;

public class Patterns1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder sbr= new StringBuilder();

        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=n-1-i;j<n-1;j++) {
                System.out.print("*\t");
            }
            System.out.print("*\n");
        }
    }
}
