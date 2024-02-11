package Practice_Questions;
public class Sorting_Merge {

    public static void mergeSort(int arr[], int st, int end){
        if(st>=end){
            return;
        }
        int mid = (st+end)/2;
        mergeSort(arr, st, mid);
        mergeSort(arr,mid+1,end);
        merge(arr, st, mid, end);
        

    }

    public static void merge(int arr[], int st, int mid, int end){
        int temp[] = new int[end-st+1];
        int i = st;
        int j = mid+1;
        int k =0;

        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
                
            }else{
                temp[k] = arr[j];
                j++;
               
            }
            k++;
        }

        //Leftover left part
        while(i<=mid){
           temp[k++] = arr[i++];
        }
        //Leftover right part
        while(j<=end){
           temp[k++] = arr[j++];
        }

        //Copying the temp array to original array
        int l = 0;
        for(int x=0;x<temp.length;x++){

            arr[l] = temp[x];
            l++;

        }
    }

    public static void main(String args[]){
        int arr[] = {38,24,45,2,1,0};
        int n = arr.length-1;
        mergeSort(arr,0,n);

        for(int i=0; i<n+1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
