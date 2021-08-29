package Graphs;

import java.util.ArrayList;

public class graph{

    public static class Edge{
        int v1;int v2;int wt;

        public Edge(int v1, int v2, int wt) {
            this.v1 = v1;
            this.v2 = v2;
            this.wt = wt;
        }
    }

    public static void addEdge(ArrayList<Edge>[] graph, int v1, int v2, int wt){
        graph[v1].add(new Edge(v1,v2,wt));
        graph[v2].add(new Edge(v2,v1,wt));
    }

    public static void display(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++)
        {
            for(Edge e:graph[i])
            {
                System.out.print("( "+e.v1+" -> "+e.v2+" @ "+e.wt+" )");
            }
            System.out.println();
        }
    }

    public static void fun(){
        int n=7;
        ArrayList<Edge>[] graph = new ArrayList[n];
        for(int i=0;i<n;i++)
        {graph[i]=new ArrayList<>();}

        int [][] data={
                {0,1,10},
                {0,3,40},
                {1,2,10},
                {2,3,10},
                {3,4,2},
                {4,5,3},
                {4,6,8},
                {5,6,3}
        };

        for(int i=0;i<data.length;i++)
        {addEdge(graph,data[i][0],data[i][1],data[i][2]);}

        display(graph);
    }

    public static void main(String[] args) {
        fun();
    }
}
