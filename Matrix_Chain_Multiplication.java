package cp;
import java.util.*;

public class Matrix_Chain_Multiplication 
{
	static int dp[][]=new int[100][100];
	public static int mcm(int a[],int i,int j)
	{
		if(i==j)
			return 0;
		if(dp[i][j]!=-1)
			return dp[i][j];
		dp[i][j]=Integer.MAX_VALUE;
		for(int k=i;k<j;k++)
			dp[i][j]=Math.min(dp[i][j], mcm(a,i,k)+mcm(a,k+1,j)+a[i-1]*a[k]*a[j]);
		return dp[i][j];
	}
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4};
		for(int[] rows:dp)
			Arrays.fill(rows, -1);
		System.out.println(mcm(arr,1,arr.length-1));
	}

}
