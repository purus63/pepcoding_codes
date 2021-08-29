package stack;

public class stackusingarray {
    private int[] arr;

    private int size=0;

    public stackusingarray(int capacity){
        arr= new int[capacity];
    }
    public void push(int val){
        if(size==arr.length){
            System.out.println("StackOverflow");
            return;}
        arr[size++]=val;
    }
    public int pop(){
        if(size==0)
        {
            System.out.println("StackUnderflow");
            return -1;
        }
        int temp=arr[size-1];
        arr[size-1]=0;
        size--;
        return temp;
    }

    public int peek(){
        if(size==0)
        {
            System.out.println("StackUnderflow");
            return -1;
        }
        return arr[size-1];
    }
    public boolean isEmpty(){
        if(size==0)
        {return true;}
        return  false;
    }

    public int size(){
        return size;
    }

    public void display(){
        int temp=size;
        while(temp>0)
        {
            System.out.print(arr[temp-1]);temp--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        stackusingarray st =new stackusingarray(8);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.display();
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        st.display();

    }
}
