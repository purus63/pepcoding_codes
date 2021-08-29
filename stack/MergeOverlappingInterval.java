package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;


public class MergeOverlappingInterval {

    public static class Pair implements Comparable<Pair>{
        private int start;
        private int end;

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
        public int compareTo(Pair o)
        {
            return this.start-o.start;
        }
    }
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time
        Pair[] p =new Pair[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            p[i]=new Pair(arr[i][0],arr[i][1]);
        }
        Arrays.sort(p);
        Stack<Pair> st= new Stack<>();
        st.push(p[0]);

        for(int i=1;i<p.length;i++)
        {
            if(st.peek().end>=p[i].start)
            {
                if(st.peek().end<p[i].end)
                {
                    st.peek().end=p[i].end;
                }
            }
            else
            {
                st.push(p[i]);
            }
        }
        Stack<Pair>st2 = new Stack<>();
        while(st.size()>0)
        {
            st2.push(st.pop());
        }
        while(st2.size()>0)
        {
            System.out.println(st2.peek().start+" "+st2.peek().end);
            st2.pop();
        }

    }
}
