package Graphs.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class InfectionSpread {
    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }
    }
    static class Pair{
        int vtx;
        int level;

        public Pair(int vtx, int level) {
            this.vtx = vtx;
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
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }

        int src = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());

        int ans=0;
        int visited[] = new int[vtces];
        Queue<Pair> q =new LinkedList<>();
        q.add(new Pair(src,1));

        while(q.size()>0)
        {
            Pair temp = q.remove();
            if(visited[temp.vtx]!=0)
                continue;;
            if(temp.level>t)
            {
                break;
            }
            ans++;
            visited[temp.vtx]=1;
            for(Edge e:graph[temp.vtx])
            {
                if(visited[e.nbr]==0)
                {
                    q.add(new Pair(e.nbr,temp.level+1));
                }
            }

        }
        System.out.println(ans);
        // write your code here
    }

}
