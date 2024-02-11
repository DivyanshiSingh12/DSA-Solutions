package Practice_Questions;
import java.util.*;

//Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.
public class Practice_Question_1 {

    public static boolean checkBeautifulArray(ArrayList<Integer> nums, int n){
        //All elements should be between 1 to n
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)<1 || nums.get(i)>n){
                return false;
            }
        }

        for(int i=0, j=nums.size()-1; i<j;i++,j--){

            for(int k=i+1;k<=j-1;k++){
                if(2*nums.get(k)== nums.get(i)+nums.get(j)){
                    return false;
                }
            }

        }

        return true;
    }

    public static ArrayList checkLonely(ArrayList<Integer> nums){
        ArrayList<Integer> l = new ArrayList<>();
        int n = nums.size();
        boolean arr[] = new boolean[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = false;
        }
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums.get(i)==nums.get(j) || nums.get(i)==nums.get(j)+1 || nums.get(i)==nums.get(j)+1){
                 arr[i] = true;
                 arr[j] = true;
                
            }
            
        }
    }

     for(int i=0;i<nums.size();i++){
        if(arr[i]==false){
            l.add(nums.get(i));
        }
     }

     return l;
    }

    public static boolean checkMonotonic(ArrayList<Integer> nums){
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums.get(i)==nums.get(j)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){
        

        ArrayList<Integer> nums = new ArrayList<>();
        int n = nums.size();
        nums.add(2);
        nums.add(1);
        nums.add(4);
        nums.add(3);
        
        System.out.println(checkBeautifulArray(nums,n));
    }
    
}
