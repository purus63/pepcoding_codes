package Heaps;

import java.util.ArrayList;

public class MinPriorityQueue {
    public static class minPriorityQ{
        private ArrayList<Integer> data;

        public minPriorityQ(){
            data=new ArrayList<>();
        }

        private void swap(int i,int j){
            int temp=data.get(i);
            data.set(i,data.get(j));
            data.set(j,temp);
        }

        private void upheapify(int indx){
            if(indx==0)
                return;
            int pi=(indx-1)/2;
            if(data.get(indx)<data.get(pi))
            {
                swap(indx,pi);
                upheapify(pi);
            }
        }

        public void add(int val){
            data.add(val);
            upheapify(data.size()-1);
        }
        private void downheapify(int indx){
            int l=2*indx+1;
            int r=2*indx+2;
            int large=indx;

            if(l>= data.size())
                return;
            if(data.get(large)>data.get(l))
                large=l;
            if(data.get(large)>data.get(r))
                large=r;

            if(large!=indx){
                swap(large,indx);
                downheapify(large);
            }
        }

        public int remove(){
            if(data.size()==0)
            {
                System.out.println("Queue Underflow");
                return -1;
            }
            swap(0,data.size()-1);
            int val=data.remove(data.size()-1);
            downheapify(0);
            return val;
        }
        public int peek(){
            if(data.size()==0){
                System.out.println("Queue Underflow");
                return -1;
            }
            return data.get(0);
        }
        public int size(){
            return data.size();
        }

        public void display(){
            System.out.println(data);
        }

    }

    public static void main(String[] args) {
        minPriorityQ pq= new minPriorityQ();
        pq.add(1);
        pq.add(2);
        pq.display();
    }


}
