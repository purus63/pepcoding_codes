package Graphs.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class IsBiPartiate {
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

    static class Pair{
        int src;int level;

        public Pair(int src, int level) {
            this.src = src;
            this.level = level;
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
        for (int i = 0; i < vtces; i++)
        {
            if(visited[i]==0)
                flag=isbipartiate(graph,i,visited);
            if(flag==false)
                break;
        }
        if(flag==false)
        {
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    }

    private static boolean isbipartiate(ArrayList<Edge>[] graph, int i, int[] visited) {

        Queue<Pair> qu = new LinkedList<>();
        qu.add(new Pair(i,1));
        while(qu.size()>0)
        {
            Pair temp=qu.remove();
            if(visited[temp.src]!=0)
            {
                if(visited[temp.src]==temp.level)
                    continue;
                else
                    return false;
            }
            visited[temp.src]= temp.level;
            for(Edge e:graph[temp.src])
            {
                if(visited[e.nbr]==0)
                    qu.add(new Pair(e.nbr,temp.level+1));
            }
        }
        return true;
    }
}

