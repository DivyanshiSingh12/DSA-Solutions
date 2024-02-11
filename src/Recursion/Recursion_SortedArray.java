package Recursion;
public class Recursion_SortedArray {
    
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String args[]){

        int arr[] = {1,2,3,4,3,6,7,8};
        System.out.print(isSorted(arr, 0));
      
    }
    
}
