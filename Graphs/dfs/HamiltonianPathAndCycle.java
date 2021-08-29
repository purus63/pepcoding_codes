package Graphs.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HamiltonianPathAndCycle {
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

        int src = Integer.parseInt(br.readLine());

        int visited[] = new int[vtces];
        dfs(graph,src,visited,"",src);
        // write all your codes here
        
    }

    private static void dfs(ArrayList<Edge>[] graph, int src, int[] visited, String s,int root) {
        visited[src]=1;
        s+=src;
        if(s.length()==graph.length)
        {
            boolean flag=false;
            System.out.print(s);
            for(Edge e:graph[src])
            {
                if(e.nbr==root)
                {
                    flag=true;break;
                }
            }
            if(flag)
                System.out.println("*");
            else
                System.out.println(".");
        }
        for(Edge e:graph[src])
        {
            if(visited[e.nbr]==0)
            {dfs(graph,e.nbr,visited,s,root);}

        }
        visited[src]=0;
    }

}
