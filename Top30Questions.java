
import java.util.*;
// 1.two sum

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

//2.Best time to sell and buy

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
//3.Maximum subarray
class Main{
    public static int maxSubarray(int[]arr){
        int sum=0;
        int maxSum=arr[0];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            maxSum=Math.max(maxSum,sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[]args){
        int[]arr={1,-1,2,3,-6,4};
        System.out.println(maxSubarray(arr));
    }
}
//4. Product except itself
class Main {

    public static void ProductExceptItself(int[] arr) {
        int n = arr.length;

        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * arr[i - 1];
        }

        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * arr[i + 1];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = prefix[i] * suffix[i];
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        ProductExceptItself(arr);
    }
}

