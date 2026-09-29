package array.assigment;

public class stock {
    public static int calculateStock(int prices[]){
        int buy = prices[0];
        int maxprofit = 0;
        for(int i = 0; i<prices.length; i++){
            if(buy < prices[i]){
                int profit = prices[i] - buy;
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buy = prices[i];
            }
        }
       return maxprofit;
    }
    public static void main(String args[]){
        int prices[] = {7,6,4,3,1};
        int profit = calculateStock(prices);
        System.out.println(profit);
    }
}
