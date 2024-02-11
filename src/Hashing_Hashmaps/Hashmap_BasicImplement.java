package Hashing_Hashmaps;
import java.util.*;
public class Hashmap_BasicImplement {

    public static void main(String args[]){
        int arr[] = {10,100,200,300,30,20};
        int k = 3;

        //find a pair of three numbers that will have min difference between max and min value
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-k;i++){
            int currmin = arr[i+k-1] - arr[i];
            min = Math.min(min, currmin);
        }

        System.out.println(min);


    }
    
}
