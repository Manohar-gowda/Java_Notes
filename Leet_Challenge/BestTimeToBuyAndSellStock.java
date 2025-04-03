public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(sol(prices));

    }

    public static int sol(int[] prices) {
      int profit = Integer.MIN_VALUE;
      int buy = prices[0];
      int sell = 0;

      for (int i=0;i<prices.length-1;i++) {
          if(prices[i] < buy ) {
              buy = prices[i];
          }
          sell = prices[i+1];
          int temp = sell - buy;
          if(temp > profit) {
              profit = temp;
          }

      }
      return profit;
    }
}
