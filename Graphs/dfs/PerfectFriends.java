package Graphs.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PerfectFriends {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int v1,v2;
        ArrayList<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int i=0;i<k;i++)
        {
            String[] parts = br.readLine().split(" ");
            v1 = Integer.parseInt(parts[0]);
            v2 = Integer.parseInt(parts[1]);
            graph[v1].add(v2);
            graph[v2].add(v1);
        }

        ArrayList<ArrayList<Integer>> res= new ArrayList<>();
        int []visited =new int[n];

        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            if(visited[i]==0) {
                dfs(graph,i,visited,temp);
                res.add(temp);
            }
        }

        //O(n*n)
        /*int ans=0;
        for(int i=0;i<res.size();i++)
        {
            for(int j=i+1;j<res.size();j++)
            {
                ans+=res.get(i).size()*res.get(j).size();
            }
        }*/
        int ans=0;
        int sum=res.get(res.size()-1).size();
        for(int i=res.size()-2;i>=0;i--)
        {
            ans+=res.get(i).size()*sum;
            sum+=res.get(i).size();
        }

        System.out.println(ans);
        // write your code here
    }

    private static void dfs(ArrayList<Integer>[] graph, int i, int[] visited, ArrayList<Integer> temp) {

        visited[i]=1;
        temp.add(i);
        for(Integer a:graph[i])
        {
            if(visited[a]==0)
            {
                dfs(graph,a,visited,temp);
            }
        }

    }

}
