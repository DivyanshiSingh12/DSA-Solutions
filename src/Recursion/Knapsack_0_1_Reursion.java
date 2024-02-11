package Recursion;
import java.util.*;

public class Knapsack_0_1_Reursion {

    public static int knapSack(int val[],int wt[],int W, int n){
        if(W==0 || n==0){
            return 0;
        }

        if(wt[n-1]<=W){
            //included 
            int ans1 = val[n-1] + knapSack(val, wt, W-wt[n-1], n-1);
            //not included
            int ans2 = knapSack(val, wt, W, n-1);

            int ans = Math.max(ans1,ans2);
            return ans;
        }else{
            return knapSack(val, wt, W, n-1);
        }

    }

    public static void main(String args[]){
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;

        System.out.print(knapSack(val, wt, W, val.length));


    }



    
}
