public class Best_time_to_buy_sell_stock {

    public static int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices)); // Expected output: 5
    }
}
