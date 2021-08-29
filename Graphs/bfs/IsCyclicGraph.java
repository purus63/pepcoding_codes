package Graphs.bfs;

import sun.awt.image.ImageWatched;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
        boolean flag=false;
        int visited[] = new int[vtces];
        for(int i=0;i<vtces;i++)
        {
            if(visited[i]==0)
                flag=bfs(graph,i,visited);
            if(flag==true)
                break;
        }
        System.out.println(flag);
    }

    private static boolean bfs(ArrayList<Edge>[] graph, int i, int[] visited) {

        boolean flag=false;
        Queue<Integer> q= new LinkedList<>();
        q.add(i);

        while(q.size()>0)
        {
            int temp= q.remove();
            if(visited[temp]==1)
            {
                flag=true;
                break;
            }
            visited[temp]=1;

            for(Edge e:graph[temp])
            {
                if(visited[e.nbr]==0)
                    q.add(e.nbr);
            }

        }
        return flag;
    }
}
