package Dynamic_Programming;
import java.util.*;

public class DP_CoinCange2 {

    public static int coinChange(int coins[], int amount){

        if(amount<1){
            return 0;
        }
        
        int dp[] = new int[amount+1];

        for(int i=1;i<amount+1;i++){
            dp[i] = Integer.MAX_VALUE;

           
           for (int j = 0; j < coins.length; j++) {
            int coin = coins[j];
               if(coin<=i && dp[i-1]!= Integer.MAX_VALUE)
                   dp[i] = Math.min(dp[i],1+dp[i-coin]);
               
           }
        }

        if(dp[amount]==Integer.MAX_VALUE){
            return -1;
        }else{
            return dp[amount];
        }


    }

    
    public static void main(String args[]){
        int coins[] = {1,2,5};
        int amount = 11;

        System.out.println(coinChange(coins, amount));
    }
    
}
