import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapImp {


    public static class HashMap<K, V> {
        private class HMNode {
            K key;
            V value;

            HMNode(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size; // n
        private LinkedList<HMNode>[] buckets; // N = buckets.length

        public HashMap() {
            initbuckets(4);
            size = 0;
        }



        public void put(K key, V value) throws Exception {
            // write your code here
            int bidx=hashfn(key);
            int nodeidx=findInBucket(key,bidx);

            if(nodeidx==-1)
            {
                HMNode nn= new HMNode(key,value);
                buckets[bidx].addLast(nn);
                size++;
            }
            else
            {
                HMNode n=buckets[bidx].get(nodeidx);
                n.value=value;
            }

            double lambda=1.0* size/buckets.length;
            if (lambda > 2.0) {
                rehash();
            }

        }


        public int hashfn(K key)
        {
            int hshcode=key.hashCode();
            return Math.abs(hshcode)%buckets.length;

        }



        public V get(K key) throws Exception {
            // write your code here
            int bidx=hashfn(key);
            int nodeidx= findInBucket(key,bidx);

            if(nodeidx==-1)
                return null;
            else
            {
                HMNode n=buckets[bidx].get(nodeidx);
                return n.value;
            }

        }

        public boolean containsKey(K key) {
            // write your code here
            int bidx=hashfn(key);
            int nodeidx= findInBucket(key,bidx);

            if(nodeidx==-1)
                return false;
            else
                return true;
        }

        public V remove(K key) throws Exception {
            // write your code here
            int bidx=hashfn(key);
            int nodeidx= findInBucket(key,bidx);

            if(nodeidx==-1)
                return null;
            else
            {
                HMNode n=buckets[bidx].remove(nodeidx);
                size--;
                return n.value;
            }

        }

        public ArrayList<K> keyset() throws Exception {
            // write your code here
            ArrayList<K> al= new ArrayList<>();
            for(int i=0;i<buckets.length;i++)
            {
                for(HMNode p:buckets[i])
                {
                    al.add(p.key);
                }
            }
            return al;
        }

        public int size() {
            // write your code here
            return size;
        }

        public void display() {
            System.out.println("Display Begins");
            for (int bi = 0; bi < buckets.length; bi++) {
                System.out.print("Bucket" + bi + " ");
                for (HMNode node : buckets[bi]) {
                    System.out.print( node.key + "@" + node.value + " ");
                }
                System.out.println(".");
            }
            System.out.println("Display Ends");
        }

        public int findInBucket(K key,int bidx)
        {
            int i=0;
            for(HMNode p:buckets[bidx])
            {
                if(p.key.equals(key)){
                    return i;}
                i++;
            }
            return -1;
        }
        public void rehash()throws Exception{
            LinkedList<HMNode>[] temp= buckets;
            buckets= new LinkedList[2*temp.length];
            for(int i=0;i<temp.length;i++)
            {
                for(HMNode p:temp[i])
                {
                    put(p.key,p.value);
                }
            }
        }

        private void initbuckets(int N) {
            buckets = new LinkedList[N];
            for (int bi = 0; bi < buckets.length; bi++) {
                buckets[bi] = new LinkedList<>();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("put")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                Integer val = Integer.parseInt(parts[2]);
                map.put(key, val);
            } else if (str.startsWith("get")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.get(key));
            } else if (str.startsWith("containsKey")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.containsKey(key));
            } else if (str.startsWith("remove")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.remove(key));
            } else if (str.startsWith("size")) {
                System.out.println(map.size());
            } else if (str.startsWith("keyset")) {
                System.out.println(map.keyset());
            } else if (str.startsWith("display")) {
                map.display();
            }
            str = br.readLine();
        }
    }
}
