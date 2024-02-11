package Arrays;
import java.util.*;
public class Array_Second_Largest {

    public static int findSecondMinium(int arr[]){

        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i]<min){

                min = arr[i];

            }
            if(min<=second_min && arr[i]>min){
                
                second_min = arr[i];
            }

        }

        return second_min;

        
    }

    public static void main(String args[]){
        int arr[] = {1,45,23,24,5,3,1};

        System.out.println(findSecondMinium(arr));
    }

}