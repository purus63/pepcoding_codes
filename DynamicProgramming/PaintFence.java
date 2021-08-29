package DynamicProgramming;

import java.util.Scanner;

public class PaintFence {

    public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int k=sc.nextInt();

            int same=0;
            int distinct=k;
            for(int i=1;i<n;i++)
            {
                    int n_same=distinct;
                    int n_distinct=(same+distinct)*(k-1);

                    same=n_same;
                    distinct=n_distinct;
            }
        System.out.println(same+distinct);
    }
}
