package Graphs;

/*      0
        4 4
        1 3
        3 2
        2 0
        0 1*/

import java.util.ArrayList;
import java.util.Scanner;

public class DetectACycleInDAG {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for(int i = 0; i < V+1; i++)
                list.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if(new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else System.out.println("0");
        }
    }
}// } Driver Code Ends


/*Complete the function below*/

class Solution
{
    //Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean res=false;
        int visited[]=new int[V];
        int mypath[]=new int[V];


        for(int i=0;i<V;i++)
            res= res || fastapproach(V,adj,i,visited,mypath);

        return res;
    }

    private boolean fastapproach(int v, ArrayList<ArrayList<Integer>> adj, int src, int[] visited, int[] mypath) {

        mypath[src]=1;
        visited[src]=1;
        boolean rr=false;

        for(int nbr: adj.get(src))
        {
            if(mypath[nbr]==1)
            {return true;}
            else if(visited[nbr]==1)
                rr=false;
            else
            {rr=fastapproach(v,adj,nbr,visited,mypath);
                if(rr)
                    return rr;
            }
        }
        mypath[src]=0;
        return rr;
    }

    public boolean helpernaive(int V,ArrayList<ArrayList<Integer>> adj,int src, int[] visited)
    {

        visited[src]=1;
        boolean flag=false;
        for(int nbr:adj.get(src))
        {

            if(visited[nbr]==0)
            {
                flag= helpernaive(V,adj,nbr,visited);
                if(flag)
                    return flag;
            }
            else
                return true;
        }

        visited[src]=0;
        return flag;


    }




}