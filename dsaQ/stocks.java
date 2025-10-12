public class stocks {
    
    public static void main(String args[]) {
        int prices[] = {7,1,5,3,6,4};
        int buy = 1;
        int profit = 0;
        for(int i = buy; i<prices.length; i++){
            if(prices[buy] == prices[i]){
                System.out.println("your buy price is "+(prices[i]));
            }
            profit = prices[buy] - prices[i];
            if(prices[buy] > profit){
                
            }
            System.out.println("profit is "+profit);
            profit = 0;
        }
        
    }
}
