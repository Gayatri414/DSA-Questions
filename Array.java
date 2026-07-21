import java.sql.SQLOutput;
import java.util.HashMap;

//7,9,10
//largest element in an array.
/*
public class Array {
    public static  int Largest(int[]arr){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest =arr[i];
            }
        }
        System.out.println(largest);
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Largest(arr);
    }
}
 */
//second largest element.
/*
public class Array {
    public static int SecondLargest(int[]arr){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        System.out.println(secondLargest);
        return secondLargest;

    }
    public static void main(String[] args) {
int arr[]={1,2,3,4,5,6,7};
SecondLargest(arr);
    }
}
 */
//reverse an array
/*
public class Array {
    public static void reverse(int[]arr){
        int n= arr.length;
        int start=0;
        int end=n-1;

            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }

        // print reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        reverse(arr);
    }
}

 */
//6.Move all zeros to end.
/*
public class Array {
    public static void zero(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            if(arr[start]==0 && arr[end]==1){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            if(arr[start]==1){
                start++;
            }
            if(arr[end]==0){
                end--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,1,0,0};
        zero(arr);
    }
}

 */
//8.Two Sum Problem.
/*
public class Array {
    public static void TwoSum(int[]arr,int target){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length;j++) {
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i] + " "+arr[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=3;
        TwoSum(arr,target);
    }
}

 */
//two sum
/*
public class Array {
    public static int[] TwoSum(int arr[],int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++ ){
            int diff=k-arr[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff)};
            }

                map.put(arr[i],i);

        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=3;
        TwoSum(arr,target);
    }
}

 */
/*
public class Array {
    public static int Largest(int[]arr){
        int max=arr[0];
        for(int num:arr){
            max=Math.max(max,num);
        }
        return max;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println((Largest(arr)));
    }
}

 */
//remove duplicates from array
/*
public class Array {
    public static int remove(int arr[]){
        int n=arr.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,3,3,4,5,5};
        System.out.println(remove(arr));
    }
}
 */
//move zeros
/*
public class Array {
    public static void MoveZeros(int[]arr){
        int n=0;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {

    }
}
 */
//left rotate by one
/*
public class Array{
    public static void LeftRotate(int[]arr){
        int n=arr.length;
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
    public static void main(String[] args) {

    }
}

 */
//3 sum
import java.util.Arrays;
/*
public class Array {

    public static boolean threeSum(int[] arr, int target) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    System.out.println(arr[i] + " " + arr[left] + " " + arr[right]);
                    return true;
                }
                else if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int target = 7;

        System.out.println(threeSum(arr, target));
    }
}
 */