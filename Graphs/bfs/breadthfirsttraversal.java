package Graphs.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class breadthfirsttraversal {
    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }
    }
    static class BSFPair {
        int src;
        String psf;

        public BSFPair(int src, String psf) {
            this.src = src;
            this.psf = psf;
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
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }

        int src = Integer.parseInt(br.readLine());

        // write your code here
        Queue<BSFPair> qu =new ArrayDeque<>();
        qu.add(new BSFPair(src,src+""));
        int visited[] =new int[edges];
        bfs(graph,qu,visited);


    }

    private static void bfs(ArrayList<Edge>[] graph, Queue<BSFPair> qu, int[] visited) {

        while(qu.size()>0)
        {
            BSFPair p=qu.remove();
            if(visited[p.src]==0)
                System.out.println(p.src+"@"+p.psf);
            visited[p.src]=1;

            for(Edge e :graph[p.src])
            {
                if(visited[e.nbr]==0)
                {
                    qu.add(new BSFPair(e.nbr,p.psf+e.nbr));
                }
            }

        }

    }


}
