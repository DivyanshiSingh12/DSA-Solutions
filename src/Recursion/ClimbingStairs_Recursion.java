package Recursion;
import java.util.*;
public class ClimbingStairs_Recursion{

    public static int countWays(int n,int arr[]){

        if(n==0){

            return 1;
        }
        if(n<0){
            return 0;
        }
        if(arr[n]!=-1){
            return arr[n];
        }

        arr[n] = countWays(n-1,arr)+countWays(n-2,arr)+countWays(n-3, arr);
        return arr[n];
    }

    public static int countWaysTabulation(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[n];
    }

    public static void main (String args[]){
        int n = 5;
        int ways[] = new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println(countWaysTabulation(n));

    }

}
