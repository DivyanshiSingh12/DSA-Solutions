package Arrays;
import java.util.*;

public class Arrays_MaxSubArraySumPrefix {

    public static int maxSubarraySumPre(int arr[]){
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        int currsum = Integer.MIN_VALUE;
        int maxSum  = Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){
            
            prefix[i] = arr[i] + prefix[i-1];

        }

        for(int i=0;i<arr.length;i++){
            int s = i;
            for(int j=i;j<arr.length;j++){
                int e=j;
                for(int k=i;k<=j;k++){
                    currsum = s == 0 ? prefix[e] : prefix[e] - prefix[s-1];

                    if(maxSum<currsum){
                        maxSum = currsum;
                    }
                }
            }
        }

        return maxSum;


    }

    public static void main(String args[]){

        int arr[] = {1,-2,6,-1,3};
        
        System.out.println(maxSubarraySumPre(arr));


    }
    

}
