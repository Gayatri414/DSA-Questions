import java.util.*;
//max=smallest ,closest,sorting
//min heap=largest
//min heap= PriorityQueue<Integer> pq=new PriorityQueue<>();
//max heap= PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

//Kth smallest num
/*
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

 */

//Kth largest num
/*

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

 */
//sorted array -sort a k sorted array-time complexity=nlogk
/*
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
 */

//minimal cost
/*
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

 */
//minimum cost of ropes

