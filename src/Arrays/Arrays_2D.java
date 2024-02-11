package Arrays;
import java.util.Scanner;

public class Arrays_2D {

    public static void print_elements(int[][] arr){
       System.out.println("Below are the elements of Matrix");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static boolean Search(int[][] arr,int x){
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                if(arr[i][j]==x){
                    System.out.println("The position of element is"+ i +j);
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        //Create a 2D Array
        int[][] marks = new int[2][2];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements of the 2*2 matrix");

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                marks[i][j] = input.nextInt(); 
            }
        }
        int x = input.nextInt();
        boolean answer = Search(marks,x);
        System.out.println(answer);

        
    }
}
