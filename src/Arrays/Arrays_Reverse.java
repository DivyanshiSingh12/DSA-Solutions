package Arrays;
import java.util.*;
public class Arrays_Reverse {

    /*public static void Reverse(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        for(int k=0;k<n;k++){
            System.out.println(arr[k]);
        }
    }*/

    private static void Recursive_Reverse(int arr[], int start, int end){
       if(start>=end){
        return;
       }
       int temp = arr[start];
       arr[start] = arr[end];
       arr[end] = temp;
       
       Recursive_Reverse(arr, start+1, end-1);
    }
    public static void Print_Array(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
    int arr[] = {11,22,33,44,55};
    int start = 0;
    int end = arr.length-1;
    Recursive_Reverse(arr,start,end);
    Print_Array(arr);

    }
   
    
}
