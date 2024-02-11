package Arrays;
public class Array_PrintSubArray {

    public static void Array_PrintSubArray(int arr[]){

        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i; j<arr.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String args[]){
     int nums[] = {4,6,8,10};
     Array_PrintSubArray(nums);
    }
    
}
