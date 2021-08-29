package Easy;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i+j<n-1)
                    System.out.print("\t");
                else if(j==n-1)
                    System.out.print("*");
                else
                    System.out.print("*\t");
            }
            System.out.println();
        }
    }
}