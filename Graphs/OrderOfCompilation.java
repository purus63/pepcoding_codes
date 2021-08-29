package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class OrderOfCompilation {

    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
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
        }

        int visited[] = new int [vtces];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<vtces;i++)
        {
            if(visited[i]==0)
            {dfs(graph,i,visited,st);
            st.push(i);}
        }
        // write your code here
        while(st.size()>0)
        {
            System.out.println(st.pop());
        }
    }

    private static void dfs(ArrayList<Edge>[] graph, int i, int[] visited,Stack<Integer>st) {

        visited[i]=1;

        for(Edge e:graph[i]) {
            if (visited[e.nbr] == 0) {
                dfs(graph, e.nbr, visited,st);
                st.push(e.nbr);
            }
        }

    }


}
