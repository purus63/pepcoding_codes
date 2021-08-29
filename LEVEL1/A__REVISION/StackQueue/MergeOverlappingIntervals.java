package LEVEL1.A__REVISION.StackQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class MergeOverlappingIntervals {
    static class Pair implements  Comparable<Pair>{
        int start;
        int end;

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }


        @Override
        public int compareTo(Pair pair) {
            return this.start-pair.start;
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
        int n= arr.length;
        Pair[] parr = new Pair[n];
        for(int i=0;i<n;i++)
        {
            Pair p = new Pair(arr[i][0],arr[i][1]);
            parr[i]=p;
        }

        Arrays.sort(parr);
        Stack<Pair> st= new Stack<>();
        st.push(parr[0]);

        for(int i=1;i<n;i++)
        {
            if(parr[i].start<=st.peek().end)
            {
                if(parr[i].end>st.peek().end)
                {
                    st.peek().end=parr[i].end;
                }
            }
            else{
                st.push(parr[i]);
            }
        }

        Stack<Pair>st2= new Stack<>();
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
