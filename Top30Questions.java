
import java.util.*;
//two sum

class Main {
    public static int[] TwoSum(int[]arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
       for(int i=0;i<n;i++){
           int diff=target-arr[i];
           if(map.containsKey(diff)) return new int[]{ map.get(diff),i};
           map.put(arr[i],i);
       }
       return new int[]{1,-1};
    }
    public static void main(String[] args) {
       int[] arr = {2, 9, 11, 15};
        int target = 20;

        int[] ans = TwoSum(arr, target);

        System.out.println(ans[0] + " " + ans[1]);
    }
}

//Best time to sell and buy

class Main{
    public static int Profit(int[]arr){
       int maxProfit = Integer.MIN_VALUE;
        int minPrice=arr[0];
        for(int i=0;i<arr.length;i++){
            minPrice = Math.min(minPrice, arr[i]);
                  int profit = arr[i] - minPrice;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
    public static void main(String[]args){
        int[]arr= {7,1,5,3,6,4};
    System.out.println(Profit(arr));
        
    }
}


