package cp;
public class Buy_and_Sell_a_Share_at_most_twice 
{
	public static int maxProfit(int n, int[] price)
    {
		if (n <= 1) 
            return 0;
        int[] profit1 = new int[n];
        int[] profit2 = new int[n];
        int minPrice1 = price[0];
        for (int i=1;i<n;i++) 
        {
            minPrice1 = Math.min(minPrice1, price[i]);
            profit1[i] = Math.max(profit1[i - 1], price[i] - minPrice1);
        }
        int maxPrice2 = price[n - 1];
        for (int i=n-2;i>=0;i--) 
        {
            maxPrice2 = Math.max(maxPrice2, price[i]);
            profit2[i] = Math.max(profit2[i + 1], maxPrice2 - price[i]);
        }
        int maxProfit = 0;
        for (int i = 0; i < n; i++) 
            maxProfit = Math.max(maxProfit,profit1[i]+(i+1<n?profit2[i+1]:0));
        return maxProfit;
    }
	public static void main(String[] args)
	{
		int prices[] = {10,22,5,75,65,80};
		System.out.println(maxProfit(prices.length,prices));
	}
}