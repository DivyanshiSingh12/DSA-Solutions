package Recursion;
public class Recurssion_RemoveDuplicate {


    public static void removeDuplicate(String str, int i, boolean arr[], String finalstr){
       
        if(i==str.length()){
            System.out.print(finalstr);
            return;
        }
        
        if(arr[str.charAt(i)-'0']==true){
            removeDuplicate(str, i+1, arr, finalstr);

        }else{
            arr[str.charAt(i)-'0'] = true;
            removeDuplicate(str, i+1, arr, finalstr+str.charAt(i));
        }

        
        

    }
    public static void main(String args[]){
        boolean arr[] = new boolean[26];
        String str = "appnaCollege";
        String s ="";
        removeDuplicate(str, 0, arr, s);

    }
    
}
