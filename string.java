import javax.sound.sampled.ReverbType;
import java.sql.SQLOutput;
import java.util.Arrays;

//reverse using two pointer
/*
public class string {
    public static void Reverse(String str){
        char[] arr=str.toCharArray();
        int start=0;
        int end=arr.length-1;
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(new String(arr));
        }
    public static void main(String[] args) {
String str="Gayatri";
Reverse(str);
    }
}
 */
//by suing string Bulider
/*
public class string {
    public static void Reverse(String str){
        StringBuilder sb=new StringBuilder(str);
        System.out.println( sb.reverse());
    }
    public static void main(String[] args) {
        String str="Gayatri";
        Reverse(str);
    }
}

 */
//using loop
/*
public class string{
    public static void reverse(String str){
        String reversed="";

        for(int i=str.length()-1;i>=0;i--){
            reversed=reversed + str.charAt(i);

        }
        System.out.println(reversed);
    }
    public static void main(String[] args) {
        String str="Gayatri";
        reverse(str);
    }
}
 */
//palindrome
/*
public class string {
    public static  boolean palindrome(String str){
        char[]arr=str.toCharArray();

        int start=0;
        int end=arr.length-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                System.out.println("its not palindrome");
                return false;
            }
            start++;
            end--;
        }
        System.out.println("it is palindrome");
        return true;
    }
    public static void main(String[] args) {
String str="gayatri";
palindrome(str);
    }
}
 */
//3.Count vowels and consonants.
/*
public class string {
    public static void Vowels(String str){
        str=str.toLowerCase();

        int vowel=0;
                int  consonants=0;
        for(int j=0;j<str.length();j++){
            char ch=str.charAt(j);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowel++;
            }else{
                consonants++;
            }
            System.out.println("Vowels: " + vowel);
            System.out.println("Consonants: " + consonants);
        }
    }
    public static void main(String[] args) {
String str="gayatri";
Vowels(str);
    }
}
 */
//4.find dupliocate characters
/*
public class string{
    public static void duplicate(String str){
        for(int i=0;i<str.length();i++){

            for(int j=i+1;j<str.length();j++){

                if(str.charAt(i)==str.charAt(j)){
                    System.out.println(str.charAt(i));

                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        String str="aacd";
        duplicate(str);
    }
}
 */
//anagram checking
/*
public class string {
    public static void anagram(String str1,String str2){
        char[] str=str1.toCharArray();
       char[] str3= str2.toCharArray();
        Arrays.sort(str);
        Arrays.sort(str3);
       if(Arrays.equals(str,str3)){
           System.out.println("its is anagram");
       }else{
           System.out.println("it si not anagram");
       }
    }
    public static void main(String[] args) {
anagram("hayatri","irtayah");
    }
}

 */
//6.Longest substring without repeating characters.
//7.String compression