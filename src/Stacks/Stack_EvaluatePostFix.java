package Stacks;
import java.util.*;
public class Stack_EvaluatePostFix {

    public static int Postfixans(String s){

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<s.length();i++){

            char c = s.charAt(i);

            if (c == ' ')
                continue;

            if(Character.isDigit(c)){
                int n = 0;
 
                // Extract the characters and store it in num
                while (Character.isDigit(c)) {
                    n = n * 10 + (int)(c - '0');
                    i++;
                    c = s.charAt(i);
                }
                i--;
 
                // Push the number in stack
                st.push(n);
            }
            else{
                int val1 = st.pop();
                int val2 = st.pop();

                switch(c){
                    case '+':
                            st.push(val2+val1);
                            break;
                    case '-':
                            st.push(val2-val1);
                            break;
                    case '*': 
                            st.push(val2*val1);
                            break;
                    case '/': 
                            st.push(val2/val1);
                            break;                       

                }

            }




        }
        return st.pop();
    }

    public static void main(String args[]){
        String exp = "100 200 + 2 / 5 * 7 +";
        System.out.println(Postfixans(exp));
    }
    
}
