package Arrays;
public class Arrays_MaxSubArraysKadans {

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
  
        for(int i=0;i<nums.length;i++){

            currSum = currSum + nums[i];
            if(currSum<0){
                currSum=0;
            }

            maxSum = Math.max(currSum,maxSum);

        } 
        return maxSum;
      }
      public static void main(String args[]){
       int arr[] = {1,-2,6,-1,3};
       int answer = maxSubArray(arr);
       System.out.println(answer);
      }
    
}
