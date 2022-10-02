package cp;

public class Queries_On_A_Matrix 
{
	public static int[][] solveQueries(int n, int[][] Queries)
    {
		int ans[][]=new int[n][n];
		for(int x=0;x<Queries.length;x++)
		{
			int a=Queries[x][0],b=Queries[x][1],c=Queries[x][2],d=Queries[x][3];
			for(int i=a;i<=c;i++)
				for(int j=b;j<=d;j++)
					ans[i][j]++;
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int queries[][]= {
				{4,0,5,3},
				{0,0,3,4},
				{1,2,1,2},
				{1,1,2,3},
				{0,0,3,1},
				{1,0,2,4}};
		int n = 6;
		queries = solveQueries(n,queries);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(queries[i][j]+" ");
			System.out.println();
		}
	}

}
