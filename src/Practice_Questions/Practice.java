package Practice_Questions;
import java.util.Arrays;
import java.util.HashSet;

public class Practice {

        public static int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int n = set.size();
        return n;    
        
        
    }
    
    public static void removeElement(int[] nums, int val) {
        //Arrays.sort(nums);
        int arr[] = new int[nums.length]; 
        
        int j=0;
        for(int i=0;i<nums.length;i++){
          if(nums[i]!=val){
            arr[j] = nums[i];
            j++;
          }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        
        int nums[] = {3,2,2,3};
        int val = 3;
        removeElement(nums, val);
        
    }
}
