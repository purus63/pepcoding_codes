/*package test;

import java.util.*;

public class Pep_Combination_Sum {

    public static List<List<Integer>> glo= new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        // write your code here
        List<List<Integer>> res=recursionsum(candidates,target,0,0,"");
        return res;
    }

    private static List<List<Integer>> recursionsum(int[] candidates, int target, int sum,int idx,String str) {

        if(idx== candidates.length)
        {
            if(target==sum)
            {
                String[] numlist = str.split(",");
                ArrayList<Integer> al= new ArrayList<>();
                for(int i=0;i<numlist.length;i++)
                {
                    al.add(Integer.parseInt(numlist[i]));
                }
                glo.add(al);
                return glo;
            }
            return new ArrayList<>();
        }

        if(sum+candidates[idx]<=target)
        {
          List<List<Integer>> l1 =  recursionsum(candidates,target,sum+candidates[idx],idx+1,str+candidates[idx]+",");
        }
        List<List<Integer>> l2=recursionsum(candidates,target,sum,idx+1,str);


    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        List<List<Integer>> res = combinationSum(arr, target);
        System.out.println(res);
    }
}*/