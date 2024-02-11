package Recursion;
public class Recurssion_WAF {

    public static int findKey(int arr[], int key, int i){

        if(i==arr.length){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }

        return findKey(arr, key, i+1);

    }

    public static void main(String args[]){

        int arr[] = {2,1,4,3,6,7,3,9};

        System.out.print(findKey(arr, 6, 0));

    }
    
}
