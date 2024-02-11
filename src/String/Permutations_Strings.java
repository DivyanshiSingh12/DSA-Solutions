package String;
public class Permutations_Strings {
    public static void printPermutations(String s, String p){
        //Base Case
        if(s.length()==0){
            System.out.print(p);
            return;
        }

        //Recursion
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            String str = s.substring(0, i)+s.substring(i+1,s.length());
            printPermutations(str,p+curr);
        }
    }
    public static void main(String args[]){
        String  s = "abc";
        String p = " ";

    }
}
