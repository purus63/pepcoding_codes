package Graphs.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {

    static class Pair implements Comparable<Pair>{
        int vtc;
        int wsf;
        String psf;

        public Pair(int vtc, int wsf, String psf) {
            this.vtc = vtc;
            this.wsf = wsf;
            this.psf = psf;
        }

        @Override
        public int compareTo(Pair pair) {
            return this.wsf-pair.wsf;
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

        int src = Integer.parseInt(br.readLine());
        // write your code here
        PriorityQueue<Pair> pq= new PriorityQueue<>();
        pq.add(new Pair(src,0,src+""));

        int visited[] =new int[graph.length];
        while(pq.size()>0)
        {
            Pair pp= pq.remove();
            if(visited[pp.vtc]==1)
                continue;
            visited[pp.vtc]=1;
            System.out.println(pp.vtc +" via "+pp.psf+" @ "+pp.wsf);
            for(Edge e:graph[pp.vtc])
            {
                if(visited[e.nbr]==0)
                    pq.add(new Pair(e.nbr, pp.wsf+e.wt,pp.psf+e.nbr));
            }
        }

    }
}
