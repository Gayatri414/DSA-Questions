
/*
important xor properties
if two elements value is same then it becomes 0
x^x=0;
x^0=x;
x^y^y=x;
 */

import java.util.*;
//swap two numbers

public class BitManupulation {
    public static void Swap(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        int a=9;
        int b=2;
        Swap(a,b);
    }
}
