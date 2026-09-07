import java.util.*;

//balance bracket
/*
public class stack {
    public static boolean isBalanced(String str){
Stack <Character> st= new Stack<>();
int n=str.length();
for(int i=0;i<n;i++){
char ch=str.charAt(i);
if(ch=='('){
    st.push(ch);
}else{
    if(st.size()==0) return false;
    if(st.peek()=='(') st.pop();
}
}
if(st.size()>0) return  false;
else return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(isBalanced(str));
    }

}
 */
//remove consecutive subsequences
/*
public class stack{
    public static int[] remove(int[] arr){
int n=arr.length;
Stack <Integer> st=new Stack<>();
for(int i=0;i<n;i++){
if(st.size()==0||st.peek()!=arr[i]) st.push(arr[i]);
else if(arr[i]==st.peek()){
    if(i==n-1||arr[i]!=arr[i+1]) st.pop();
}
}
int []res=new int[st.size()];
int m=res.length;
for(int i=m-1;i>=0;i--){
    res[i]=st.pop();
}
return res;
    }
    public static void main(String[] args) {
        int []arr={1,2,2,3,10,10,10,4,4,4,7,7,2};
        int []res=remove(arr);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]+" ");
        }
    }
}


 */
// next greter elemrnt
import java.util.*;

class Main {

    static int[] nextGreater(int[] arr) {

        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty())
                ans[i] = -1;
            else
                ans[i] = st.peek();

            st.push(arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 10, 8};

        System.out.println(Arrays.toString(nextGreater(arr)));
    }
}
