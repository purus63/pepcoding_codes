package stack;

import java.util.ArrayList;

public class stackusingarraylist {
    private ArrayList<Integer>  al=new ArrayList<>();

    public void push(int val)
    {
        if(al.size()==10000)
        {
            System.out.println("stackoverflow");
        }
        al.add(val);
    }
    public int pop()
    {
        if(al.size()==0)
        {
            System.out.println("stackunderflow");
            return -1;
        }
        int temp =al.get(al.size()-1);
        al.remove(al.size()-1);
        return  temp;
    }
    public int peek()
    {
        if(al.size()==0)
        {
            System.out.println("stackunderflow");
            return -1;
        }
        return al.get(al.size()-1);
    }
    public boolean isEmpty()
    {
        return al.size()==0;
    }
    public int size()
    {
        return al.size();
    }
    public void display()
    {
        System.out.println(al);
    }

    public static void main(String[] args) {
        stackusingarraylist st =new stackusingarraylist();
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
