package programs15;

public class BuySellStock {
public static void main(String[] args) {
	int[] prices= {7,1,5,3,6,4};
	int max=maxProfit(prices);
	System.out.println(max);
}

private static int maxProfit(int[] prices) {
	 
	int buy = prices[0];
	int maxProfit = 0;
	
	for (int i = 1; i < prices.length; i++) {
		
		if (prices[i]<buy) {
			buy = prices[i];
		} else {
			maxProfit = Math.max(maxProfit, prices[i]-buy);
		}
	}
	
	return maxProfit;
}

}
