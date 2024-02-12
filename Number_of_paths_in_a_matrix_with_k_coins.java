package cp;
public class Number_of_paths_in_a_matrix_with_k_coins
{
	long numberOfPath(int n, int k, int [][]arr) 
    {
		long dp[][][] = new long[n][n][k+1];
        if(arr[n-1][n-1] <=k)
            dp[n-1][n-1][arr[n-1][n-1]] = 1;
        for(int i=n-1; i>=0 ; i--)
        {
            for(int j=n-1; j>=0 ; j--)
            {
                for(int m=1; m <= k ; m++)
                {
                    if(m-arr[i][j] >= 0 && i+1<n)
                        dp[i][j][m] += dp[i+1][j][m-arr[i][j]];
                    if(m-arr[i][j] >= 0 && j+1<n)
                        dp[i][j][m] += dp[i][j+1][m-arr[i][j]];;
                }
            }
        }
        return dp[0][0][k];
    }
	public static void main(String[] args)
	{
		int arr[][] ={{1, 2, 3}, 
		              {4, 6, 5}, 
		              {3, 2, 1}};
		int k=12;
		Number_of_paths_in_a_matrix_with_k_coins ob1=new Number_of_paths_in_a_matrix_with_k_coins();
		System.out.println(ob1.numberOfPath(arr.length,k,arr));
	}
}