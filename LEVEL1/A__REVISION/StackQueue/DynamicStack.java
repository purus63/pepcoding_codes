package LEVEL1.A__REVISION.StackQueue;

import java.util.ArrayList;

public class DynamicStack {

    public static class dstack{
        ArrayList<Integer> al;
        int cap;

        public dstack(ArrayList<Integer> al,int cap) {
            this.al = new ArrayList<>();
            this.cap=cap;
        }

        //push pop peek size
        void push(int val)
        {

            if(al.size()==cap)
            {
                ArrayList<Integer> list= new ArrayList<>();
                for(int i:al)
                {
                    list.add(i);
                }
                al=list;
            }
            al.add(val);
        }

        int pop(){
            if(al.size()==0)
            {
                System.out.println("Stack Underflow");
                return -1;
            }
            return al.remove(al.size()-1);
        }

        int peek(){
            if(al.size()==0)
            {
                System.out.println("Stack Underflow");
                return -1;
            }
            return al.get(al.size()-1);
        }

        int size(){
            return al.size();
        }
    }

}
