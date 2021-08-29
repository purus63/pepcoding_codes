package Queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NormalQueue {
    public static class CustomQueue {
        int[] data;
        int front;
        int size;

        public CustomQueue(int cap) {
            data = new int[cap];
            front = 0;
            size = 0;
        }

        int size() {
            // write ur code here
            return this.size;
        }

        void display() {
            int idx;
            for(int i=0;i<size;i++)
            {
                idx=(i+front)%data.length;
                System.out.println(data[idx]+" ");
            }
        }

        void add(int val) {
            // write ur code here
            if(this.size == data.length)
            {
                System.out.println("Queue overflow");
                return;
            }
            int idx=(front+size)%data.length;
            size++;
            data[idx]=val;
        }

        int remove() {
            // write ur code here
            if(this.size==0)
            {
                System.out.println("Queue underflow");
                return -1;
            }
            int temp = data[(front+size)%data.length];
            size--;
            front=(front+1)%data.length;
            return temp;
        }

        int peek() {
            // write ur code here
            if(this.size==0)
            {
                System.out.println("Queue underflow");
                return -1;
            }
            return data[front];
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        CustomQueue qu = new CustomQueue(n);

        String str = br.readLine();
        while(str.equals("quit") == false){
            if(str.startsWith("add")){
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if(str.startsWith("remove")){
                int val = qu.remove();
                if(val != -1){
                    System.out.println(val);
                }
            } else if(str.startsWith("peek")){
                int val = qu.peek();
                if(val != -1){
                    System.out.println(val);
                }
            } else if(str.startsWith("size")){
                System.out.println(qu.size());
            } else if(str.startsWith("display")){
                qu.display();
            }
            str = br.readLine();
        }
    }
}