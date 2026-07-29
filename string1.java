

import java.util.*;
/*
class Main {
    public static String Reverse(String str){
      char[]arr=str.toCharArray();
        int left=0;
        int right=str.length()-1;
        while(left<=right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String str="gayatri";
       System.out.println( Reverse(str));
    }
}
*/
// check palindrome
/*
class Main{
    public static boolean palindrome(String str){
        char[]arr=str.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            if(arr[left]!=arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[]args){
        String str="madam";
        System.out.println(palindrome(str));
    }
}
    */
//valid anagram
/*
class Main{
    public static boolean Anagram(String str,String str1){
        char[] arr=str.toCharArray();
        char[]arr1=str1.toCharArray();
        if(arr.length!=arr1.length) return false;
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for(int i=0;i<arr.length;i++){

            if(arr[i]!=arr1[i]){
                return false;
            }

        }
        return true;

    }
    public static void main(String[]args){
        String str="listen";
        String str1="silent";
        System.out.println(Anagram(str,str1));
    }
}
 */

