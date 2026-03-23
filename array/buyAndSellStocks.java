package array;

public class buyAndSellStocks { // time complexity is O(n)
    public static int maxProfit(int priceArr[]){
        int maxProfit = 0;
        int buyPrice = priceArr[0];
        for(int i = 0; i<priceArr.length; i++){
            if(buyPrice < priceArr[i]){
                int profit = priceArr[i] - buyPrice;
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }else{
                buyPrice = priceArr[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int stocksPrices[] = {7,1,5,3,6,2};
        int profit = maxProfit(stocksPrices);
        System.out.println("Profit is : "+ profit);
    }
}
