package Arrays;
public class Arrays_MaxSubArraySum {

    public static int maxSubArraySum(int arr[]){
       int currSum = 0;
       int maxSum = 0;

       for(int i=0;i<arr.length;i++){
        int start = arr[i];
        for(int j=i;j<arr.length;i++){
            int end = arr[j];
            for(int k=start; k<=end;i++){
                currSum = currSum+arr[k];
            }
            if(currSum>maxSum){
                maxSum = currSum;
            }
        }
       }
       return maxSum;

    }

    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3};
        int answer = maxSubArraySum(arr);
        System.out.println("Hello");

    }
    
}
