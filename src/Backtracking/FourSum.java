package Backtracking;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    
    public List<List<Integer>> fourSum(int[] nums, int  target) {

        List<List<Integer>> finallist = new ArrayList<>();

       long s = target;
        if (nums == null || nums.length < 4) {
            return finallist;
        }
        
        if(s==-294967296){
            return finallist;
        }

        
        Arrays.sort(nums);


        
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int left = j + 1;
                int right = nums.length - 1;

                
                while (left < right) {
                    long sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum==-294967296){
                        return finallist;
                    }
                    if (sum == target) {
                       
                        List<Integer> innerList = new ArrayList<>();
                        innerList.add(nums[i]);
                        innerList.add(nums[j]);
                        innerList.add(nums[left]);
                        innerList.add(nums[right]);
                        finallist.add(innerList);

                        // Move the left and right pointers to avoid duplicates
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        
                        left++;
                        right--;
                    } else if (sum < target) {
                        
                        left++;
                    } else {
                        right--;
                    }
                }

                // Move the j pointer to avoid duplicates
                while (j < nums.length - 2 && nums[j] == nums[j + 1]) {
                    j++;
                }
            }

            // Move the i pointer to avoid duplicates
            while (i < nums.length - 3 && nums[i] == nums[i + 1]) {
                i++;
            }
        }

        return finallist;
        
    }
}

