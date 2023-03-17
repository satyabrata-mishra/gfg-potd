package cp;
import java.util.*;
public class Maximum_No_Of_Coins 
{
	public static int maxCoins(int N, ArrayList<Integer> arr) 
    {
		arr.add(0, 1);
        arr.add(1);
        int n = arr.size();
        int[][] dp = new int[n][n];
        for (int l = 3; l <= n; l++)
        {
            for (int i = 0; i <= n - l; i++) 
            {
                int j = i + l - 1;
                for (int k = i + 1; k < j; k++) 
                    dp[i][j] = Math.max(dp[i][j], dp[i][k] + dp[k][j] + arr.get(i) * arr.get(k) * arr.get(j));
            }
        }
        return dp[0][n-1];
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(10);
		System.out.println(maxCoins(a.size(),a));
	}

}
