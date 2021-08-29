package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class CountFacotsTillN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int countfactor[] =new int[n+1];
        Arrays.fill(countfactor,2);

        factorcount(countfactor,n);

        for(int i=1;i<=n;i++)
        {
                System.out.println(countfactor[i]);
        }

    }

    private static void factorcount(int[] countfactor,int n) {
        countfactor[1]=1;

        for(int i=2;i*i<=n;i++)
        {
            for(int j=i*i;j<=n;j+=i)
            {
                if(j==i*i)
                    countfactor[j]++;
                else
                    countfactor[j]+=2;
            }
        }
    }
}
