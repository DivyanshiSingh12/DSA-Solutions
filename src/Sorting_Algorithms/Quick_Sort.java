package Sorting_Algorithms;

public class Quick_Sort{

    public static void quickSort(int arr[], int s, int e){
        if(s>=e){
            return;
        }
        int p = partition(arr,s,e);
        quickSort(arr,s,p-1);
        quickSort(arr, p+1, e);
    }
    
    public static int partition(int arr[], int s, int e){
        int pivot = arr[e];
        int i = s - 1;
        for(int j=s;j<e;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[e] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String args[]){
        
        int arr[] = {5,4,1,3,2};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        quickSort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        
    }
}