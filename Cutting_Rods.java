package cp;
public class Cutting_Rods 
{
	public static int cutRod(int price[], int n) 
    {
		int dp[]=new int[n+1];
		for(int i=1;i<=n;i++)
        {
            int mx=0;
            for(int j=1;j<=i;j++)
            {
                int left=i-j;
                mx=Math.max(mx,price[j-1]+dp[left]);
            }
            dp[i]=mx;
        }
        return dp[n];
    }
	public static void main(String[] args)
	{
		int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
		System.out.println(cutRod(price,price.length));
	}
}