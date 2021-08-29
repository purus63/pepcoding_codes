package Easy;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j<=i)
                {
                    System.out.print(count+"\t");
                    count++;
                }
            }
            System.out.println();
        }

    }
}
