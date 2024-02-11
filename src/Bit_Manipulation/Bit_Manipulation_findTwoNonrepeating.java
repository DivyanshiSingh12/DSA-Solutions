package Bit_Manipulation;
import java.util.*;
public class Bit_Manipulation_findTwoNonrepeating {

    public static int[] singleNumbers(int[] nums){
        int arr[] = new int[2];
        int k=0;
        Arrays.sort(nums);

        for(int i=0; i<nums.length-1;i=i+2){
            if(nums[i]!=nums[i+1]){
                arr[k++] = nums[i];
                i=i-1;
            }
        }
        if(arr[1]==0){
            arr[1] = nums[nums.length-1];

        }
        return arr;
    }

    public static void main(String args[]){
        int nums[] ={1,1,2,2,3,4,5,5};
        int x[] = singleNumbers(nums);
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }

    }
    
}
