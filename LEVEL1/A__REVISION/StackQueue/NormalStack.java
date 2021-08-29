package LEVEL1.A__REVISION.StackQueue;

public class NormalStack {

    static int arr[] =new int [10];
    static int idx=-1;
    // push pop peek size
    static void push(int val)
    {
        if(idx==arr.length-1)
        {
            System.out.println("StackOverflow");
            return;
        }
        arr[++idx]=val;
    }

    static int pop(){
        if(idx==-1)
        {
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[idx--];
    }

    static int peek()
    {
        if(idx==-1)
        {
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[idx];
    }

    static int size()
    {
        return idx+1;
    }

    public static void main(String[] args) {

        System.out.println(peek());
        System.out.println(size());
        push(0);
        push(1);
        push(2);
        System.out.println(pop());
        System.out.println(peek());
        System.out.println(size());
    }

}
