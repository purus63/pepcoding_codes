package Graphs.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class IsCyclicGraph {
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
        int visited[] = new int[vtces];
        boolean flag=false;
        for(int i=0;i<vtces;i++)
        {
            if(visited[i]==0)
                flag=dfs(graph,-1,i,visited);
            if(flag)
                break;
        }
        System.out.println(flag);
    }

    private static boolean dfs(ArrayList<Edge>[] graph, int p,int c, int[] visited) {

        boolean flag=false;
        visited[c]=1;
        for(Edge e:graph[c])
        {
            if(visited[e.nbr]==0)
            {
                flag=dfs(graph,c,e.nbr,visited);
                if(flag)
                    break;
            }
            else if(e.nbr!=p)
            {
                return true;
            }
        }
        return flag;
    }
}
