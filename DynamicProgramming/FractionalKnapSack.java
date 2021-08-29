package DynamicProgramming;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FractionalKnapSack {
        static class Pair implements Comparable<Pair>{

            int val;
            int wt;
            double valperwt;

            public Pair(int val, int wt) {
                this.val = val;
                this.wt = wt;
                this.valperwt= (1.0*val)/wt;
            }

            @Override
            public int compareTo(Pair pair) {
                if(this.valperwt>pair.valperwt)
                {
                    return  1;
                }
                else if(this.valperwt<pair.valperwt)
                    return -1;
                else
                    return 0;
            }
        }

        public static void main(String[] args) throws Exception {
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();

            int val[] = new int[n];
            int wt[]  = new int[n];
            int bagwt;

            for(int i=0;i<n;i++)
            {
                val[i]=sc.nextInt();
            }

            for(int i=0;i<n;i++)
            {
                wt[i]=sc.nextInt();
            }

            bagwt=sc.nextInt();

            PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
            for(int i=0;i<n;i++)
            {
                pq.add(new Pair(val[i],wt[i]));
            }
            double ans=0;
            while(bagwt>0)
            {
                Pair p=pq.remove();
                if(p.wt>bagwt)
                {
                    ans=(bagwt*p.valperwt);
                    break;
                }
                else{
                    ans+=(p.wt*p.valperwt);
                    bagwt-=p.wt;
                }
            }
            System.out.println(ans);

        }

}
