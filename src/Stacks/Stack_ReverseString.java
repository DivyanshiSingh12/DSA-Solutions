package Stacks;
import java.util.*;
public class Stack_ReverseString {

    public static void reverseString(String s){
        Stack<String> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            String b = " ";
            b=b+a;

            st.push(b);

            b=" ";
        }
        
        String d ="";
        while(!st.isEmpty()){

            d = d + st.pop();

           


        }
        System.out.println(d);

        

    }

    public static void main(String args[]){
        String s = "abcdefg";
        reverseString(s);
    }
    
}
