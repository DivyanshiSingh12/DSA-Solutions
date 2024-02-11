package Hashing_Hashmaps;
import java.util.HashMap;

public class Hashing_ValidAnagram {

    public static boolean isAnangram(String s, String t){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
        if(map.get(ch) != null){
            if(map.get(ch) == 1){    
                map.remove(ch);
            } else {
                map.put(ch, map.get(ch)-1);
            }
        }
        else{
            return false;
        }
    }
         return map.isEmpty();
    }

    public static void main(String args[]){
        String s = "race";
        String t = "care";

        System.out.print(isAnangram(s, t));
    }
    
}
