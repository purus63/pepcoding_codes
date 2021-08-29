package Graphs;

import java.util.*;

//Evaluate Division
public class Leetcode399 {

    static class Edge{
        String nbr;
        double wt;

        public Edge(String nbr, double wt) {
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    static int idx=0;
    public static void main(String[] args) {

        List<List<String>> equations =new ArrayList<>();
        List<List<String>> queries = new ArrayList<>();

        List<String> eq1=new ArrayList<>();
        eq1.add("a");
        eq1.add("b");

        List<String> eq2=new ArrayList<>();
        eq2.add("b");
        eq2.add("c");

        List<String> eq3=new ArrayList<>();
        eq3.add("bc");
        eq3.add("cd");

        equations.add(eq1);
        equations.add(eq2);
        equations.add(eq3);

        List<String> q1=new ArrayList<>();
        q1.add("a");
        q1.add("c");

        List<String> q2=new ArrayList<>();
        q2.add("c");
        q2.add("b");

        List<String> q3=new ArrayList<>();
        q3.add("bc");
        q3.add("cd");

        List<String> q4=new ArrayList<>();
        q4.add("cd");
        q4.add("bc");

        queries.add(q1);
        queries.add(q2);
        queries.add(q3);
        queries.add(q4);


        double[] values= {1.5,2.5,5.0};

        System.out.println(Arrays.toString(calcEquation(equations,values,queries)));
    }

    public static double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

        HashMap<String,ArrayList<Edge>> graph =new HashMap<>();
        double [] res= new double[queries.size()];
        int i=0;
        for(List<String> l:equations)
        {
            double val=values[i++];
            if(graph.containsKey(l.get(0)))
            {
                graph.get(l.get(0)).add(new Edge(l.get(1), val));
            }
            else {
                graph.put(l.get(0), new ArrayList<>());
                graph.get(l.get(0)).add(new Edge(l.get(1), val));
            }

            if(graph.containsKey(l.get(1)))
            {
                graph.get(l.get(1)).add(new Edge(l.get(0), 1 / val));
            }
            else {
                graph.put(l.get(1), new ArrayList<>());
                graph.get(l.get(1)).add(new Edge(l.get(0), 1 / val));
            }
        }


        for(List<String> q:queries)
        {
            String a=q.get(0);
            String b=q.get(1);

            if(graph.containsKey(a)==false || graph.containsKey(b)==false)
            {
                res[idx++]=-1.00;
            }
            else if(a.equals(b))
            {
                res[idx++]=1.00;
            }
            else
            {
                HashSet<String> visited= new HashSet<>();
                boolean flag=dfs(graph,a,b,visited,res,1.00000);
                if(flag==false)
                    res[idx++]=-1.00;
            }
        }
            return res;
    }

    private static boolean dfs(HashMap<String, ArrayList<Edge>> graph, String a, String b, HashSet<String> visited, double[] res,double wt) {

        if(a.equals(b))
        {
            res[idx++]=wt;
            return true;
        }
        visited.add(a);

        for(Edge e:graph.get(a))
        {
            if(visited.contains(e.nbr)==false)
            {
                boolean flag= dfs(graph,e.nbr,b,visited,res,wt*e.wt);
                if(flag)
                    return flag;
            }
        }
        return false;
    }
}
