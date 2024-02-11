package Arrays;
public class Arrays_buyAndSellStocks {

    public static int stockprofit(int arr[]){

        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0;i<arr.length;i++){
            if(buyprice<arr[i]){
                int profit = arr[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buyprice = arr[i];
            }
        }

        return maxprofit;
    }

    public static void main(String args[]){
        int price[] = {7,1,5,3,6,4};

        int buy = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0;i<price.length;i++){
            if(buy<price[i]){
                int profit = price[i]-buy;
                maxprofit = Math.max(profit,maxprofit);
                
            }else{
                buy = price[i];
            }
        }

        System.out.print("Maximum profit is"+" "+maxprofit);
         System.out.println("Maximum profit is"+" "+stockprofit(price));
    }
    
}
