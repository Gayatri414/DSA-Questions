import java.util.*;
// Most frequent
// Least frequent
// Top K frequent
// Closest
// Nearest
// Smallest distance
// K nearest
// Merge K sorted arrays
// Merge K sorted lists
// Smallest among many sorted lists
// K smallest
// Top K
// Kth largest
// Kth smallest
//max=smallest ,closest,sorting
//min heap=largest
| Problem Type               | Heap              |
| -------------------------- | ----------------- |
| K Largest                  | Min Heap          |
| K Smallest                 | Max Heap          |
| Minimum element repeatedly | Min Heap          |
| Maximum element repeatedly | Max Heap          |
| Merge K Sorted Lists       | Min Heap          |
| Top K Frequent             | Min Heap (size K) |
| Closest Points             | Max Heap (size K) |
| Dijkstra                   | Min Heap          |
| Prim                       | Min Heap          |
| Huffman Coding             | Min Heap          |

min heap= PriorityQueue<Integer> pq=new PriorityQueue<>();
max heap= PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

//Kth smallest num

public class heap {
    public static int KthSmallest(int[] arr,int k){
        //maxheap
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:arr){
            pq.add(ele);
            if(pq.size()>k) pq.remove();
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        System.out.println(KthSmallest(arr, k));
    }
    }

 

//Kth largest num


public class heap {
    public static int KthLargest(int[] arr,int k){
        //minheap
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele:arr){
            pq.add(ele);
            if(pq.size()>k) pq.remove();
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        System.out.println(KthLargest(arr, k));
    }
    }

 
//sorted array -sort a k sorted array-time complexity=nlogk

public class heap{
    public static void nearlySorted(int[]arr,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int idx=0;
        for(int ele:arr) {
            pq.add(ele);
            if (pq.size() > k) {
                int top = pq.remove();
                arr[idx++] = top;
            }
        }
            while(pq.size()>0){
                int top=pq.remove();
                arr[idx++]=top;
            }


    }
    public static void main(String[] args) {
        int[]arr={5,4,3,7,8,9};
        int k=3;

            nearlySorted(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}


//minimal cost

public class heap {
    public static int minimizeCost(int k,int arr[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:arr){
            pq.add(ele);
            if(pq.size()>k){
                pq.remove();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[]arr={10,20,10};
        int k=1;
        System.out.println(minimizeCost(k,arr));
    }
}


//minimum cost of ropes

public class heap{
    public static  int MinCost(int[]arr){
        //min heap
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        int cost=0;
        for(int ele:arr){
        pq.add(ele);
    }
    while(pq.size()>1){
        int first=pq.remove();
        int second=pq.remove();
         int Add=first+second;
         cost+=Add;
        pq.add(Add);

    }
return cost;
    }
    public static void main(String[] args) {
int[]arr={4,2,7,6,9};
System.out.println(MinCost(arr));
    }
}

// k frequent elements


public class heap {

    static class Pair implements Comparable<Pair> {
        int ele;
        int freq;

        Pair(int ele, int freq) {
            this.ele = ele;
            this.freq = freq;
        }

        @Override
        public int compareTo(Pair p) {
            if (this.freq == p.freq)
                return this.ele - p.ele;

            return this.freq - p.freq;
        }
    }

    public static ArrayList<Integer> topFrequent(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int ele : map.keySet()) {
            int freq = map.get(ele);

            pq.add(new Pair(ele, freq));

            if (pq.size() > k) {
                pq.remove();
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            ans.add(pq.remove().ele);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2,3};
        int k = 2;

        System.out.println(topFrequent(arr, k));
    }
}
//K closest points to origin
import java.util.*;

class Triplet implements Comparable<Triplet> {
    int dist;
    int x;
    int y;

    Triplet(int dist, int x, int y) {
        this.dist = dist;
        this.x = x;
        this.y = y;
    }

    // Max Heap: larger distance comes first
    public int compareTo(Triplet t) {
        return t.dist - this.dist;
    }
}

public class KClosestPointsToOrigin {

    public static int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Triplet> pq = new PriorityQueue<>();

        for (int[] point : points) {

            int x = point[0];
            int y = point[1];

            int dist = x * x + y * y;

            pq.add(new Triplet(dist, x, y));

            // Remove the farthest point
            if (pq.size() > k) {
                pq.remove();
            }
        }

        int[][] ans = new int[k][2];

        for (int i = 0; i < k; i++) {

            Triplet top = pq.remove();

            ans[i][0] = top.x;
            ans[i][1] = top.y;   // You had top.x here
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] points = {
            {3, 3},
            {5, -1},
            {-2, 4}
        };

        int k = 2;

        int[][] ans = kClosest(points, k);

        for (int[] point : ans) {
            System.out.println(point[0] + " " + point[1]);
        }
    }
}
//is binary tree is heap
