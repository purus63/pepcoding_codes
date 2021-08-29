package Heaps;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Sort_K_SortedArray {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int k = Integer.parseInt(br.readLine());
        // write your code here
        int cnt=0;
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        for(int i=0;i<n;i++)
        {
            if(i<k)
            {
                pq.add(arr[i]);
            }
            else{
                if(arr[i]<pq.peek())
                {
                    arr[cnt++]=arr[i];
                }
                else{
                    arr[cnt++]=pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        while(pq.size()>0)
        {
            arr[cnt++]=pq.remove();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }

}
