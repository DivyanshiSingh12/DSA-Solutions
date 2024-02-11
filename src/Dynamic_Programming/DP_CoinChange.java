package Dynamic_Programming;
import java.util.*;

public class DP_CoinChange {

    public static int coinChange(int coin[], int sum){
        int n = coin.length;
    
        int dp[][] = new int[n+1][sum+1];

        //initialize 
        for(int i=0;i<n+1;i++){
            dp[i][0] = 1;
        }
        for(int j=0;j<sum+1;j++){
            dp[0][j] = 0;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){

                if(coin[i-1]<=j){
                    dp[i][j] = dp[i][j-coin[i-1]] + dp[i-1][j];
                }else{
                   dp[i][j] = dp[i-1][j];
                }

            }
        }

        printArray(dp);

        return dp[n][sum];

    }

    public static void printArray(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int coin[] = {1,2,3};
        int sum = 4;

        System.out.println(coinChange(coin, sum));
    


    }
    
}
