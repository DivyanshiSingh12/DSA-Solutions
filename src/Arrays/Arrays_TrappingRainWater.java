package Arrays;
import java.util.*;
public class Arrays_TrappingRainWater {

    public static int trappedwater(int arr[]){

        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        left[0] = arr[0];
        right[right.length-1] = arr[arr.length-1];
        for(int i=1;i<left.length;i++){
            if(arr[i]>left[i-1]){
                left[i] = arr[i];
            }else{
                left[i] = left[i-1];
            }
        }

        for(int i=right.length-2;i>=0;i--){
            if(arr[i]>right[i+1]){
                right[i] = arr[i];
            }else{
                right[i] = right[i+1];
            }
        }

        int trapped_water = 0;

        for(int i=0;i<arr.length;i++){
            int waterlevel = Math.min(left[i],right[i]);
            trapped_water = trapped_water + (waterlevel-arr[i]);
        }

        return trapped_water;
    }

    public static int waterTrapped(int heights[]){

        int leftmax[] = new int[heights.length];
        int rightmax[] = new int[heights.length];

        //Storing elements in the left array
        leftmax[0] = heights[0];
        for(int i=1;i<heights.length;i++){
            leftmax[i] = Math.max(heights[i],leftmax[i-1]);
        }

        //Storing elements in the right array
        int x = heights.length;
        rightmax[heights.length-1] = heights[heights.length-1];
        for(int i=x-2;i>=0;i--){
            rightmax[i] = Math.max(heights[i],rightmax[i+1]);
        }

        int trapped_water = 0;
        for(int i=0;i<heights.length;i++){
            int waterlevel = Math.min(leftmax[i],rightmax[i]) - heights[i];
            trapped_water = trapped_water + waterlevel;
        }

    return trapped_water;

    }

    public static void main(String args[]){

        int heights[] = {4,2,0,6,3,2,5};
        System.out.println(trappedwater(heights));
        System.out.println(waterTrapped(heights));

    }
    
}
