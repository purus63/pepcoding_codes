package Graphs.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class IsGraphConnected {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        // write your code here
        int count = 0;
        int [] visited= new int[vtces];

        for (int i = 0; i < vtces; i++)
        {
            if(visited[i]==0) {
                count++;
                if(count>1){
                    System.out.println("false");
                    break;
                }
                dfs(graph, i, visited);
            }
        }
        if(count==1)
            System.out.println("true");
    }

    private static void dfs(ArrayList<Edge>[] graph, int i, int[] visited) {

        visited[i]=1;
        for(Edge e:graph[i])
        {
            if(visited[e.nbr]==0)
            {
                dfs(graph,e.nbr,visited);
            }
        }
    }
}
