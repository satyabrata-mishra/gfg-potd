package cp;
public class Stock_buy_and_sell_II 
{
	public static int stockBuyAndSell(int n, int[] prices) 
    {
		int profit = 0;
        for(int i=1;i<n;i++)
            profit += Math.max(0, prices[i]-prices[i-1]);
        return profit;
    }
	public static void main(String[] args) 
	{
		int a[] = {3, 4, 1, 5};
		System.out.println(stockBuyAndSell(a.length,a));
	}
}