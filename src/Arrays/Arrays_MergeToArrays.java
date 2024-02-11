package Arrays;
public class Arrays_MergeToArrays {

    public static void  findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i = 0;
        int j = 0;
        int k = 0;
        int nums[] = new int[n+m];
        while(i<m && j<n && k<n+m){
            if(nums1[i]<nums2[j]){
                nums[k] = nums1[i];
                i++;
                k++;
            }
            else if(nums2[j]<nums1[i]){
                nums[k] = nums2[j];
                j++;
                k++;
                
            }
        }
        if (i>=m){
            while(j!=n){
                nums[k]=nums2[j];
                j++;
                k++;
            }
        }
        else{
            while(i!=m){
                nums[k]=nums1[i];
                i++;
                k++;
            }
        }
        //Printning the merged array
        for(int p=0;p<nums.length;p++){
            System.out.print(nums[p]+" ");
        }

        
    }

    public static void main(String args[]){

        int nums1[] = {1,2};
        int nums2[] = {3,4};
        
        findMedianSortedArrays(nums1,nums2);
    }
    
}
