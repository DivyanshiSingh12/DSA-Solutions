package Arrays;
import java.util.Scanner;

public class Arrays_1 {
    public static void main(String args[]){
        int[] arr = new int[5];
        int[] arr1 = {11,22,33,34};
        Scanner input = new Scanner(System.in);
        int n = arr1.length;
        //System.out.println("Enter the elements of the array");
        /*for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }*/
        for(int j=0;j<n;j++){
            System.out.println(arr1[j]);
        }
        
    }

}
