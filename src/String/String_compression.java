package String;
import java.util.*;
public class String_compression {
    //aaabbbcc --> a3b3c3

    public static String compression(String str){
        String s = " ";
        for(int i=0;i<str.length();i++){
            int count = 1;
            while( i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
             count++;
             i++;
            }
            s = s+str.charAt(i);
            if(count>1){
                s = s +""+count;

            }

            
        }
        return s.toString();
    }
    public static void main(String args[]){
       String a = "aaabbbcccc";
       System.out.println(compression(a));
    }
}
