package Arrays;
public class Arrays_RotatedArrays {

    public static void Reverse(int nums[], int start, int end){

        while(start != end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length-1;
        
        //Reverse the complete array
        Reverse(nums,0,n);
        //Reverse k elements;
        Reverse(nums,0,k-1);
        //Reverse the leftout array
        Reverse(nums,k,n);

}


    public static void main(String args[]){

        System.out.println("Hello");

        int nums[] = {1,2,3,4,5,6,7};
        int  k = 3;

        rotate(nums,k);

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

    }
    
}
