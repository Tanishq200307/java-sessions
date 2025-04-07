public class buyandSellStocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i;j<prices.length;j++){
                int profit = prices[j]-prices[i];
                if(maxProfit<profit){
                    maxProfit = profit;
                }
            }
        }
        if(maxProfit<0) return 0;
        else return maxProfit;
    }
}
