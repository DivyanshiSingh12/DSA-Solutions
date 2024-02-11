package Stacks;
import java.util.*;
public class Stack_ValidParenthesis {

    public static boolean isValid(String s){
        //Make a stack
        Stack<Character> st = new Stack<>();
        //Check if valid

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                st.push(')');
              
            }else if(c=='{'){
                st.push('}');
            }else if(c=='['){
                st.push(']');
            }else if(st.isEmpty() || st.pop()!=c){
                return false;
            }
        }
        return st.isEmpty();

    }

    public static void main(String args[]){
        String s = "(){}[]";

        System.out.println(isValid(s));
        
    }
    
}
