package cp;
import java.util.*;
public class Unique_Path_In_A_Grid 
{
	static final int mod=1000000007;
    static int recurse(int i,int j,int n,int m,int[][]arr,int[][]dp)
    {
        if(i>n || j>m || arr[i][j]==0)
            return 0;
        if(i==n && j==m)
            return 1;
        if(dp[i][j]!=-1)
            return (dp[i][j])%mod;
        dp[i][j] = (recurse(i,j+1,n,m,arr,dp)+recurse(i+1,j,n,m,arr,dp))%mod;
        return (dp[i][j])%mod;
    }
    static int uniquePaths(int n, int m, int[][] grid) 
    {
        if(grid[0][0]==0 || grid[n-1][m-1]==0)
            return 0;
        int dp[][]=new int[n+1][m+1];
        for(int[]temp:dp)
            Arrays.fill(temp,-1);
        return (recurse(0,0,n-1,m-1,grid,dp))%mod;  
    }
	public static void main(String[] args) 
	{
		int grid[][] = {{1, 1, 1},{1, 0, 1},{1, 1, 1}};
		System.out.println(uniquePaths(3,3,grid));
		int grid1[][]= {{1,0,1}};
		System.out.println(uniquePaths(1,3,grid1));
	}

}
