package String;
import java.util.*;
public class String_Anagrams {

    public static boolean isAnagram(String str1, String str2){

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length()==str2.length()){
            char s1[] = str1.toCharArray();
            char s2[] = str2.toCharArray();
            Arrays.sort(s1);
            Arrays.sort(s2);

            for(int i=0;i<str1.length();i++){
                if(s1[i]!=s2[i]){
                    return false;
                }
            }
            return true;

        }
        return false;

        

    }

    public static void main(String args[]){
        String str1 = "race";
        String str2 = "care1";

        System.out.println(isAnagram(str1,str2));
    }
    
}
