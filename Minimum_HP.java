package cp;
import java.util.*;
public class Minimum_HP 
{
	public static int minimumHp(int n, int m, int[][] board)
    {   
		int[][] dp = new int[n][m];
		dp[n - 1][m - 1] = Math.max(1, 1 - board[n - 1][m - 1]);
		for (int i = m - 2; i >= 0; i--) 
			dp[n - 1][i] = Math.max(1, dp[n - 1][i + 1] - board[n - 1][i]);
		for (int i = n - 2; i >= 0; i--) 
			dp[i][m - 1] = Math.max(1, dp[i + 1][m - 1] - board[i][m - 1]);
		for (int i = n - 2; i >= 0; i--) 
			for (int j = m - 2; j >= 0; j--) 
				dp[i][j] = Math.min(Math.max(1, dp[i + 1][j] - board[i][j]), Math.max(1, dp[i][j + 1] - board[i][j]));
		return dp[0][0];
    }
	public static void main(String[] args) 
	{
		int board[][]= {{-1,-7,3,-10},{10,-13,3,-14},{-13,6,-6,9}};
		System.out.println(minimumHp(3,4,board));
	}

}
