package cp;
import java.util.*;
public class Wall_Coloring_2 
{
	public static int minCost(int [][] costs) 
	{
		int n = costs.length , k=costs[0].length;
		if(k<=1 && n>1)
			return -1;
		int dp[][] = new int[n][k];
		int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
		for(int i=0;i<k;i++)
		{
			dp[0][i]=costs[0][i];
			if(costs[0][i]<min1)
			{
				min2=min1;
				min1=costs[0][i];
			}
			else if(costs[0][i]<min2)
				min2 = costs[0][i];
		}
		for(int i=1;i<n;i++)
		{
			int newmin1=Integer.MAX_VALUE,newmin2=Integer.MAX_VALUE;
			for(int j=0;j<k;j++)
			{
				if(min1==dp[i-1][j])
					dp[i][j]=min2+costs[i][j];
				else
					dp[i][j]=min1+costs[i][j];
				if(dp[i][j]<newmin1)
				{
					newmin2=newmin1;
					newmin1=dp[i][j];
				}
				else if(dp[i][j]<newmin2)
					newmin2 = dp[i][j];
			}
			min1=newmin1;
			min2=newmin2;
		}
		return min1;
	}
	public static void main(String[] args) 
	{
		int costs[][] = {{1, 5, 7},
			             {5, 8, 4},
			             {3, 2, 9},
			             {1, 2, 4}};
		System.out.println(minCost(costs));
	}

}
