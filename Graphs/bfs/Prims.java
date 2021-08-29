package Graphs.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims {
    static class PrimPair implements Comparable<PrimPair>{
        int vtc;
        int parent;
        int wt;

        public PrimPair(int vtc, int parent, int wt) {
            this.vtc = vtc;
            this.parent = parent;
            this.wt = wt;
        }

        @Override
        public int compareTo(PrimPair p) {
            return this.wt-p.wt;
        }
    }

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
        PriorityQueue<PrimPair> pq= new PriorityQueue<>();
        pq.add(new PrimPair(0,-1,0));

        int n= graph.length;

        int visited[]= new int[n];
        while(pq.size()>0)
        {
            PrimPair pp= pq.remove();

            if(visited[pp.vtc]==1)
                continue;
            visited[pp.vtc]=1;
            if(pp.parent!=-1)
                System.out.println("["+pp.vtc+"-"+pp.parent+"@"+pp.wt+"]");
            for(Edge e:graph[pp.vtc])
            {
                if(visited[e.nbr]==0)
                    pq.add(new PrimPair(e.nbr,pp.vtc,e.wt));
            }
        }



    }

}
